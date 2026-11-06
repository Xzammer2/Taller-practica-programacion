import java.util.Scanner;

public class Main {

    public static String obtenerDia(int dia) {
        switch (dia) {
            case 1: return "Lunes";
            case 2: return "Martes";
            case 3: return "Miércoles";
            case 4: return "Jueves";
            case 5: return "Viernes";
            case 6: return "Sábado";
            case 7: return "Domingo";
            default: return "Día inválido (debe ser entre 1 y 7)";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número de día (1-7): ");
        int d = scanner.nextInt();

        System.out.println("El día es: " + obtenerDia(d));
        scanner.close();
    }
}