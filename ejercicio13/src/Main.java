package ejercicio13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un dígito: ");
        int n = scanner.nextInt();

        int numero1 = n;
        int numero2 = n * 11;
        int numero3 = n * 111;

        int suma = numero1 + numero2 + numero3;

        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        System.out.println("Número 3: " + numero3);
        System.out.println("La suma es: " + suma);

        scanner.close();
    }
}
