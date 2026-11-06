import java.util.Scanner;

public class Main {

    public static void imprimirTrianguloArrobas(int filas) {
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        imprimirTrianguloArrobas(filas);
        scanner.close();
    }
}