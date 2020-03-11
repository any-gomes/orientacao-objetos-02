package exercicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTeste {
    private Retangulo r1;

    @BeforeEach
    public void beforeEach(){
        r1 = new Retangulo();
        r1.setBase(5.0);
        r1.setAltura(4.0);
    }

    @Test
    public void criarObjetoRetangulo() {
        assertNotNull(r1);
    }

    @Test
    public void presencaAtributoBase() {
        assertNotNull(r1.getBase());
    }

    @Test
    public void presencaAtributoAltura() {
        assertNotNull(r1.getAltura());
    }

    @Test
    public void metodoSetBaseCorreto() {
        r1.setBase(10.0);
        assertEquals(10.0, r1.getBase());
    }

    @Test
    public void metodoSetBaseCorreto() {
        r1.setBase(10.0);
        assertEquals(10.0, r1.getAltura());
    }

    @Test
    public void metodoSetBaseIncorreto() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> r1.setBase(-5.0));
        assertEquals("Base deve ser positiva", exception.getMessage());
    }

    @Test
    public void metodoSetAlturaIncorreto() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> r1.setAltura(-2.0));
        assertEquals("Altura deve ser positiva", exception.getMessage());
    }

    @Test
    public void metodoCalcularArea() {
        Double valorEsperado = 20.0;
        assertEquals(valorEsperado, r1.calcularArea());
    }

    @Test
    public void metodoCalcularPerimetro() {
        Double valorEsperado = 18.0;
        assertEquals(valorEsperado, r1.calcularPerimetro());
    }
}
