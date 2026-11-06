import java.util.Scanner;

public class Main {

    public static int binarioADecimal(String binario) {
        return Integer.parseInt(binario, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número binario (ej. 1010): ");
        String bin = scanner.next();
        System.out.println("En decimal es: " + binarioADecimal(bin));
        scanner.close();
    }
}