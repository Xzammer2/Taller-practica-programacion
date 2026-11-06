public class Main {

    public static void imprimirImpares() {
        System.out.println("--- 10 PRIMEROS NÚMEROS IMPARES ---");
        int contador = 0;
        int numero = 1;
        while (contador < 10) {
            System.out.print(numero + " ");
            numero += 2;
            contador++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        imprimirImpares();
    }
}