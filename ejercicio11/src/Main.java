package ejercicio11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos números va a ingresar?: ");
        int n = scanner.nextInt();

        double suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();

            suma = suma + numero;
        }

        double promedio = suma / n;

        System.out.println("El promedio es: " + promedio);

        scanner.close();
    }
}
