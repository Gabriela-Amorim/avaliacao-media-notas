import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AvaliacaoTest {

    private Avaliacao avaliacao;

    // Executado antes de cada método de teste para instanciar o objeto
    @BeforeEach
    public void setUp() {
        avaliacao = new Avaliacao();
    }

    @Test
    public void deveCalcularMediaCorretamente() {
        // Cenário (1) JUnit: média de 8 e 6 = 7
        double resultado = avaliacao.calcularMedia(8.0, 6.0);
        assertEquals(7.0, resultado, 0.001);
    }

    @Test
    public void deveVerificarSituacaoRecuperacao() {
        // Cenário (2) JUnit: situação da média 6 = RECUPERACAO
        String situacao = avaliacao.verificarSituacao(6.0);
        assertEquals("RECUPERACAO", situacao);
    }

    @Test
    public void deveLancarExcecaoParaNotaInvalida() {
        // Cenário (3) JUnit: nota 11 lança IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            avaliacao.calcularMedia(11.0, 5.0);
        });
    }
}