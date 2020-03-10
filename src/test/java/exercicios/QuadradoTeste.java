package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuadradoTeste {

    @Test
    public void criarObjetoQuadrado() {
        Quadrado q1 = new Quadrado();
        assertNotNull(q1);
    }

    @Test
    public void presencaAtributoLado() {
        Quadrado q1 = new Quadrado();
        q1.setLado(8.0);
        assertNotNull(q1.getLado());
    }

    @Test
    public void metodoCalcularArea() {
        Quadrado q1 = new Quadrado();
        q1.setLado(8);
        Double valorEsperado = 80.0;
        Double valorObtido = q1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro() {
        Quadrado q1 = new Quadrado();
        q1.setLado(8.0);
        Double valorEsperado = 40.0;
        Double valorObtido = q1.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoSetLado(double lado) {
        Quadrado q1 = new Quadrado();
        q1.setLado(8.6);
        assertTrue(q1.getLado() == 8.6);
    }

    @Test
    public void metodoGetLado() {
        Quadrado q1 = new Quadrado();
        q1.setLado(8.6);
        assertEquals(q1.getLado(), 8.6);
    }
}
