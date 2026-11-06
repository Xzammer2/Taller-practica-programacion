import java.util.Scanner;

public class Main {

    public static void imprimirTrianguloDecreciente(int filas) {
        for (int i = filas; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        imprimirTrianguloDecreciente(filas);
        scanner.close();
    }
}