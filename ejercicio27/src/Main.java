public class Main {

    public static String obtenerPenultimaPalabra(String texto) {
        String[] palabras = texto.trim().split("\\s+");
        if (palabras.length < 2) {
            return "El texto no tiene suficientes palabras.";
        }
        return palabras[palabras.length - 2];
    }

    public static void main(String[] args) {
        String texto = "Me gusta programar en el lenguaje Java";
        System.out.println("La penúltima palabra es: " + obtenerPenultimaPalabra(texto));
    }
}