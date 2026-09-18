package ejercicio07;

import java.util.Scanner;

public class Main {

    public static double calcularPromedio(double n1, double n2, double n3, double n4, double n5) {
        return (n1 * 0.15) + (n2 * 0.20) + (n3 * 0.15) + (n4 * 0.30) + (n5 * 0.20);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota 1 (15%): ");
        double n1 = scanner.nextDouble();
        System.out.print("Ingrese la nota 2 (20%): ");
        double n2 = scanner.nextDouble();
        System.out.print("Ingrese la nota 3 (15%): ");
        double n3 = scanner.nextDouble();
        System.out.print("Ingrese la nota 4 (30%): ");
        double n4 = scanner.nextDouble();
        System.out.print("Ingrese la nota 5 (20%): ");
        double n5 = scanner.nextDouble();

        double notaFinal = calcularPromedio(n1, n2, n3, n4, n5);
        System.out.println("La nota final es: " + notaFinal);

        scanner.close();
    }
}