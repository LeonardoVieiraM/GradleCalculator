package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    
    private final Calculadora calc = new Calculadora();
    private static final float DELTA = 0.0001f;
    
    @Test
    void testSomar() {
        assertEquals(5.5f, calc.somar(2.3f, 3.2f), DELTA);
        assertEquals(-1.0f, calc.somar(-2.5f, 1.5f), DELTA);
        assertEquals(0.0f, calc.somar(0f, 0f), DELTA);
    }
    
    @Test
    void testSubtrair() {
        assertEquals(1.0f, calc.subtrair(5.7f, 4.7f), DELTA);
        assertEquals(-3.0f, calc.subtrair(2f, 5f), DELTA);
    }
    
    @Test
    void testMultiplicar() {
        assertEquals(6.25f, calc.multiplicar(2.5f, 2.5f), DELTA);
        assertEquals(0f, calc.multiplicar(5f, 0f), DELTA);
    }
    
    @Test
    void testDividir() {
        assertEquals(2.0f, calc.dividir(5f, 2.5f), DELTA);
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(5f, 0f));
    }
}