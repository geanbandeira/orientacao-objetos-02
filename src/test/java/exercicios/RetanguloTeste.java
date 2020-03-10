package exercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RetanguloTeste {

    @Test
    public void criarObjetoRetangulo() {
        Retangulo x = new Retangulo();
        assertNotNull(x);
    }

    @Test
    public void presencaAtributoBase() {
        Retangulo x = new Retangulo();
        x.setBase(20.0);
        assertNotNull(x.getBase());
    }

    @Test
    public void presencaAtributoAltura() {
        Retangulo x = new Retangulo();
        x.setAltura(10.0);
        assertNotNull(x.getAltura());
    }

    @Test
    public void metodoCalcularArea() {
        Retangulo x = new Retangulo();
        x.setBase(20.0);
        x.setAltura(10.0);
        Double valorEsperado = 200.0;
        Double valorObtido = x.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro() {
        Retangulo x = new Retangulo();
        x.setBase(20.0);
        x.setAltura(10.0);
        Double valorEsperado = 80.0;
        Double valorObtido = x.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoSetAltura(double lado) {
        Retangulo x = new Retangulo();
        x.setAltura(8.6);
        assertEquals(x.getAltura(), 8.6);
    }

    @Test
    public void metodoGetAltura() {
        Retangulo x = new Retangulo();
        x.setAltura(8.6);
        assertEquals(x.getAltura(), 8.6);
    }

    @Test
    public void metodoSetBase(double lado) {
        Retangulo x = new Retangulo();
        x.setBase(8.6);
        assertEquals(x.getBase(), 8.6);
    }

    @Test
    public void metodoGetBase() {
        Retangulo x = new Retangulo();
        x.setBase(8.6);
        assertEquals(x.getBase(), 8.6);
    }
}
