public class Main {

    public static String capitalizarPalabras(String texto) {
        String[] palabras = texto.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                resultado.append(Character.toUpperCase(palabra.charAt(0)))
                        .append(palabra.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return resultado.toString().trim();
    }

    public static void main(String[] args) {
        String texto = "programación orientada a objetos";
        System.out.println("Resultado: " + capitalizarPalabras(texto));
    }
}