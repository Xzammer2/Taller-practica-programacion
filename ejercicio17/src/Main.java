package ejercicio17;

import java.util.Scanner;

public class Main {

    public static double calcularIVA(double subtotal) {
        return subtotal * 0.19;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de la venta: ");
        double valorVenta = scanner.nextDouble();

        double descuento = 0;

        if (valorVenta > 150000) {
            descuento = valorVenta * 0.05;
            valorVenta -= descuento; 
            System.out.println("¡Aplica descuento del 5%! Valor del descuento: $" + descuento);
        }

        double iva = calcularIVA(valorVenta);
        double totalPagar = valorVenta + iva;

        System.out.println("Nuevo valor base: $" + valorVenta);
        System.out.println("IVA (19%): $" + iva);
        System.out.println("Total a pagar: $" + totalPagar);

        scanner.close();
    }
}
