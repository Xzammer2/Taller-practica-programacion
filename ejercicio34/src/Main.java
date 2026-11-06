import java.util.Scanner;

public class Main {

    public static int solicitarEnteroPositivo(Scanner scanner) {
        int numero;
        do {
            System.out.print("Ingrese un número entero positivo: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Valor no válido. Debe ser un número entero.");
                scanner.next(); // Limpiar entrada incorrecta
                System.out.print("Ingrese un número entero positivo: ");
            }
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("El número debe ser mayor a 0. Intente nuevamente.");
            }
        } while (numero <= 0);

        return numero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroValido = solicitarEnteroPositivo(scanner);
        System.out.println("¡Valor válido ingresado con éxito!: " + numeroValido);
        scanner.close();
    }
}