package ejercicio14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cantidad de segundos: ");
        int totalSegundos = scanner.nextInt();

        // Cálculos
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        // Usamos String.format para asegurarnos de que siempre se vea con dos dígitos (ej: 09:05:02)
        String resultadoFormateado = String.format("%02d:%02d:%02d", horas, minutos, segundos);

        System.out.println("Resultado -> " + resultadoFormateado);

        scanner.close();
    }
}