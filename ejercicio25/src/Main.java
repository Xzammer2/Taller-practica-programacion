public class Main {

    public static String invertirTexto(String textoOriginal) {
        return new StringBuilder(textoOriginal).reverse().toString();
    }

    public static void main(String[] args) {
        String texto = "Laboratorio de Java";
        System.out.println("Texto invertido: " + invertirTexto(texto));
    }
}