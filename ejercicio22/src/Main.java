import java.util.Scanner;

public class Main {

    public static int contarDigitos(int numero) {
        if (numero < 0) numero = -numero; // Manejo de negativos por si acaso
        if (numero == 0) return 1;

        int contador = 0;
        while (numero > 0) {
            numero /= 10;
            contador++;
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número menor a 100.000: ");
        int numero = scanner.nextInt();

        System.out.println("El número tiene " + contarDigitos(numero) + " dígitos.");
        scanner.close();
    }
}