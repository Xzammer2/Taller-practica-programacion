import java.util.Scanner;

public class Main {

    public static String decimalABinario(int decimal) {
        if (decimal == 0) return "0";
        StringBuilder binario = new StringBuilder();
        while (decimal > 0) {
            binario.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binario.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        int num = scanner.nextInt();
        System.out.println("En binario es: " + decimalABinario(num));
        scanner.close();
    }
}