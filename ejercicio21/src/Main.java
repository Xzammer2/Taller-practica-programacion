import java.util.Scanner;

public class Main {

    public static String convertirNumeroTexto(int num) {
        switch (num) {
            case 0: return "CERO";
            case 1: return "UNO";
            case 2: return "DOS";
            case 3: return "TRES";
            case 4: return "CUATRO";
            case 5: return "CINCO";
            case 6: return "SEIS";
            case 7: return "SIETE";
            case 8: return "OCHO";
            case 9: return "NUEVE";
            case 10: return "DIEZ";
            default: return "Número fuera del rango (0-10)";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entre 0 y 10: ");
        int numero = scanner.nextInt();

        System.out.println("Resultado: " + convertirNumeroTexto(numero));
        scanner.close();
    }
}