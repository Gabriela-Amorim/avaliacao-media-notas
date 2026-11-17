package avaliacao;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AvaliacaoTest {

    private Avaliacao avaliacao;

    @BeforeEach
    public void setUp() {
        avaliacao = new Avaliacao();
    }

    @Test
    public void deveCalcularMediaOitoESeis() {
        assertEquals(7.0, avaliacao.calcularMedia(8.0, 6.0), 0.01);
    }

    @Test
    public void deveRetornarRecuperacaoParaMediaSeis() {
        assertEquals("RECUPERACAO", avaliacao.verificarSituacao(6.0));
    }

    @Test
    public void deveLancarExcecaoParaNotaOnze() {
        assertThrows(IllegalArgumentException.class, () -> {
            avaliacao.calcularMedia(11.0, 8.0);
        });
    }
}
