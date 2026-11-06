import java.util.Scanner;

public class Main {

    public static void resolverEcuacion(double a, double b, double c) {
        double discriminante = (b * b) - (4 * a * c);

        if (a == 0) {
            System.out.println("No es una ecuación cuadrática (a no puede ser 0).");
            return;
        }

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("La ecuación tiene dos soluciones reales:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La ecuación tiene una única solución real:");
            System.out.println("x = " + x);
        } else {
            System.out.println("La ecuación no tiene soluciones reales (raíces complejas).");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- RESOLUCIÓN ECUACIÓN CUADRÁTICA ---");
        System.out.print("Ingrese a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese c: ");
        double c = scanner.nextDouble();

        resolverEcuacion(a, b, c);
        scanner.close();
    }
}