package ejercicio17;

import java.util.Scanner;

public class Main {

    // Función para calcular el IVA (19%)
    public static double calcularIVA(double subtotal) {
        return subtotal * 0.19;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de la venta: ");
        double valorVenta = scanner.nextDouble();

        double descuento = 0;

        // Si la venta es mayor a 150.000, aplicamos un descuento del 5%
        if (valorVenta > 150000) {
            descuento = valorVenta * 0.05;
            valorVenta -= descuento; // Restamos el descuento al valor de la venta
            System.out.println("¡Aplica descuento del 5%! Valor del descuento: $" + descuento);
        }

        // Calculamos el IVA usando la función requerida
        double iva = calcularIVA(valorVenta);
        double totalPagar = valorVenta + iva;

        System.out.println("Nuevo valor base: $" + valorVenta);
        System.out.println("IVA (19%): $" + iva);
        System.out.println("Total a pagar: $" + totalPagar);

        scanner.close();
    }
}