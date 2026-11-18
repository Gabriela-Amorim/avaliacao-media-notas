package steps;

import static org.junit.jupiter.api.Assertions.*;
import avaliacao.Avaliacao;
import io.cucumber.java.pt.*;

public class AvaliacaoSteps {

    private Avaliacao avaliacao = new Avaliacao();
    private double nota1;
    private double nota2;
    private double media;
    private String situacao;
    private Exception erro;

    @Dado("que o aluno obteve as notas {int} e {int}")
    public void queOAlunoObteveAsNotas(int n1, int n2) {
        this.nota1 = n1;
        this.nota2 = n2;
    }

    @Quando("calcular a média e verificar a situação")
    public void calcularAMediaEVerificarASituacao() {
        this.media = avaliacao.calcularMedia(nota1, nota2);
        this.situacao = avaliacao.verificarSituacao(media);
    }

    @Quando("tentar calcular a média")
    public void tentarCalcularAMedia() {
        try {
            this.media = avaliacao.calcularMedia(nota1, nota2);
        } catch (IllegalArgumentException e) {
            this.erro = e;
        }
    }

    @Então("a média deve ser {int}")
    public void aMediaDeveSer(int mediaEsperada) {
        assertEquals(mediaEsperada, this.media, 0.01);
    }

    @E("a situação deve ser {string}")
    public void aSituacaoDeveSer(String situacaoEsperada) {
        assertEquals(situacaoEsperada, this.situacao);
    }

    @Então("deve lançar um erro de nota inválida")
    public void deveLancarUmErroDeNotaInvalida() {
        assertNotNull(this.erro);
        assertTrue(this.erro instanceof IllegalArgumentException);
    }
}
