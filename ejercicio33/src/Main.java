public class Main {

    public static void imprimirPares() {
        System.out.println("--- 10 PRIMEROS NÚMEROS PARES ---");
        for (int i = 1; i <= 10; i++) {
            System.out.print((i * 2) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        imprimirPares();
    }
}