package ejercicio16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("El número es POSITIVO.");
        } else if (numero < 0) {
            System.out.println("El número es NEGATIVO.");
        } else {
            System.out.println("El número es CERO (neutro).");
        }

        scanner.close();
    }
}