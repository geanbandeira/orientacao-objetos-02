package exercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CirculoTeste {

    @Test
    public void criarObjetoCirculo() {
        Circulo c = new Circulo();
        assertNotNull(c);
    }

    @Test
    public void presencaAtributoRaio() {
        Circulo c = new Circulo();
        c.setRaio(10.0);
        assertNotNull(c.getRaio());
    }

    @Test
    public void metodoCalcularArea() {
        Circulo c = new Circulo();
        c.setRaio(10.0);
        Double valorEsperado = 340.0;
        Double valorObtido = c.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro() {
        Circulo c = new Circulo();
        c.setRaio(10.0);
        Double valorEsperado = 68.2;
        Double valorObtido = c.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoSetRaio(double rao) {
        Circulo c = new Circulo();
        c.setRaio(8.1);
        assertEquals(c.getRaio(), 8.1);
    }

    @Test
    public void metodoGetRaio() {
        Circulo c = new Circulo();
        c.setRaio(8.1);
        assertEquals(c.getRaio(), 8.1);
    }
}
