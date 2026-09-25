package ejercicio08;

import java.util.Scanner;

public class Main {

    public static double calcularIVA(double precioBruto) {
        return precioBruto * 1.19;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio bruto: ");
        double precioBruto = scanner.nextDouble();

        double iva = precioBruto * 0.19;
        double precioConIVA = calcularIVA(precioBruto);

        System.out.println("El precio bruto es: " + precioBruto);
        System.out.println("El valor del IVA es: " + iva);
        System.out.println("El precio con IVA es: " + precioConIVA);

        scanner.close();
    }
}
