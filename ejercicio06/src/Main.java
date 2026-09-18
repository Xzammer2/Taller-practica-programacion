package ejercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número decimal: ");
        double numero = scanner.nextDouble();

        int parteEntera = (int) numero;
        double parteDecimal = numero - parteEntera;

        System.out.println("Parte entera: " + parteEntera);
        System.out.println("Parte decimal: " + parteDecimal);

        scanner.close();
    }
}