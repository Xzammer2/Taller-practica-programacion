import java.util.Scanner;

public class Main {

    public static String evaluarOrden(int n1, int n2, int n3) {
        if (n1 < n2 && n2 < n3) {
            return "Está incrementando";
        } else if (n1 > n2 && n2 > n3) {
            return "Está disminuyendo";
        } else {
            return "Ni se incrementa ni disminuye";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese número 1: ");
        int n1 = scanner.nextInt();
        System.out.print("Ingrese número 2: ");
        int n2 = scanner.nextInt();
        System.out.print("Ingrese número 3: ");
        int n3 = scanner.nextInt();

        System.out.println("Resultado: " + evaluarOrden(n1, n2, n3));
        scanner.close();
    }
}