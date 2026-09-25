package ejercicio10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el lado del hexágono: ");
        double lado = scanner.nextDouble();

        double area = (3 * Math.sqrt(3) * lado * lado) / 2;

        System.out.println("El área del hexágono es: " + area);

        scanner.close();
    }
}
