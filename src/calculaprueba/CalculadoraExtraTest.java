package calculaprueba;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraExtraTest {

    @Test
    public void testPotenciaAlCubo() {
        CalculadoraExtra calculadoraExtra = new CalculadoraExtra();
        double numero = 2.0;
        double resultado = calculadoraExtra.potenciaAlCubo(numero);
        assertEquals(8.0, resultado, 0.01);
    }

    @Test
    public void testRaizCuadrada() {
        CalculadoraExtra calculadoraExtra = new CalculadoraExtra();
        double numero = 16.0;
        double resultado = calculadoraExtra.raizCuadrada(numero);
        assertEquals(4.0, resultado, 0.01);
    }
}
