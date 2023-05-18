package calculaprueba;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UtilTest {

    @Test
    public void testObtenerTipoDato() {
        Util util = new Util();

        String tipoString = util.obtenerTipoDato("Hola");
        assertEquals("String", tipoString);

        String tipoInteger = util.obtenerTipoDato(123);
        assertEquals("Integer", tipoInteger);

        String tipoDouble = util.obtenerTipoDato(3.14);
        assertEquals("Double", tipoDouble);

        String tipoBoolean = util.obtenerTipoDato(true);
        assertEquals("Boolean", tipoBoolean);

    }

    @Test
    public void testQuitarEspacios() {
        Util util = new Util();

        String textoConEspacios = "  Hola,   este es un    ejemplo    con espacios.   ";
        String textoSinEspacios = util.quitarEspacios(textoConEspacios);
        assertEquals("Hola,esteesunejemploconespacios.", textoSinEspacios);

        String textoVacio = "";
        String textoVacioSinEspacios = util.quitarEspacios(textoVacio);
        assertEquals("", textoVacioSinEspacios);
    }

    @Test
    public void testConvertirNumeroToString() {
        Util util = new Util();

        String numeroString = util.convertirNumeroToString(123);
        assertEquals("123", numeroString);

        String numeroDoubleString = util.convertirNumeroToString(3.14);
        assertEquals("3.14", numeroDoubleString);

    }
}
