public class Main {

    public static boolean esPalindromo(String palabra) {
        String limpia = palabra.replaceAll("\\s+", "").toLowerCase();
        // Aquí corregimos 'limpiada' por 'limpia':
        String invertida = new StringBuilder(limpia).reverse().toString();
        return limpia.equals(invertida);
    }

    public static void main(String[] args) {
        String palabra = "reconocer";
        System.out.println("¿Es palíndromo?: " + esPalindromo(palabra));
    }
}