package calculaprueba;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraNormalTest {
    
    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(100, 90);
        assertEquals(190, resultado);
    }
    
    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.restar(10, 2);
        assertEquals(8, resultado);
    }
    
    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(16, 2);
        assertEquals(32, resultado);
    }
    
}
