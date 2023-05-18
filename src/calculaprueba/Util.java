package calculaprueba;

public class Util {

    public String obtenerTipoDato(Object dato) {
        if (dato instanceof String) {
            return "String";
        } else if (dato instanceof Integer) {
            return "Integer";
        } else if (dato instanceof Double) {
            return "Double";
        } else if (dato instanceof Boolean) {
            return "Boolean";
        } else if (dato instanceof Character) {
            return "Character";
        } else if (dato instanceof Long) {
            return "Long";
        } else if (dato instanceof Float) {
            return "Float";
        } else if (dato instanceof Byte) {
            return "Byte";
        } else if (dato instanceof Short) {
            return "Short";
        } else {
            return "Unknown";
        }
    }
    
    
    public String quitarEspacios(String texto) {
        if (texto == null) {
            return null;
        }

        return texto.replaceAll("\\s+", "");
    }
	
    
    public String convertirNumeroToString(Number numero) {
        return String.valueOf(numero);
    }

    
	
}
