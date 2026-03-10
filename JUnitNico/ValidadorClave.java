public class ValidadorClave {

    public static boolean esSegura(String clave) {
        if (clave == null) {
            return false;
        }
        
        // 8 caracteres y al menos un número
        return clave.length() >= 8 && clave.matches(".*[0-9].*");
    }
}
