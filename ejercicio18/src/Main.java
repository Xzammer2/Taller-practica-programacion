import java.util.Scanner;

public class Main {

    // Función para calcular el promedio ponderado de las 5 notas
    public static double calcularPromedio(double n1, double n2, double n3, double n4, double n5) {
        return (n1 * 0.15) + (n2 * 0.20) + (n3 * 0.15) + (n4 * 0.30) + (n5 * 0.20);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- INGRESO DE NOTAS ---");
        System.out.print("Ingrese Nota 1 (15%): ");
        double n1 = scanner.nextDouble();
        System.out.print("Ingrese Nota 2 (20%): ");
        double n2 = scanner.nextDouble();
        System.out.print("Ingrese Nota 3 (15%): ");
        double n3 = scanner.nextDouble();
        System.out.print("Ingrese Nota 4 (30%): ");
        double n4 = scanner.nextDouble();
        System.out.print("Ingrese Nota 5 (20%): ");
        double n5 = scanner.nextDouble();

        // Calculamos la nota final usando la función
        double notaFinal = calcularPromedio(n1, n2, n3, n4, n5);
        System.out.println("\nNota final obtenida: " + notaFinal);

        // Evaluamos las condiciones del estudiante
        if (notaFinal < 2.0) {
            System.out.println("El estudiante no puede habilitar.");
        } else if (notaFinal < 3.0) {
            System.out.println("El estudiante reprobó.");
        } else {
            System.out.println("El estudiante aprobó.");
            if (notaFinal > 4.5) {
                System.out.println("¡Felicitaciones por tu excelente desempeño!");
            }
        }

        scanner.close();
    }
}