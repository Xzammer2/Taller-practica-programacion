import java.util.Scanner;

public class Main {

    // Fórmula general para polígonos regulares: Área = (Perímetro * Apotema) / 2
    public static double calcularAreaPoligonoRegular(double numeroLados, double longitudLado, double apotema) {
        double perimetro = numeroLados * longitudLado;
        return (perimetro * apotema) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- ÁREA DE UN POLÍGONO REGULAR ---");
        System.out.print("Ingrese número de lados: ");
        double lados = scanner.nextDouble();
        System.out.print("Ingrese longitud de cada lado: ");
        double longitud = scanner.nextDouble();
        System.out.print("Ingrese el apotema: ");
        double apotema = scanner.nextDouble();

        double area = calcularAreaPoligonoRegular(lados, longitud, apotema);
        System.out.println("El área del polígono es: " + area);

        scanner.close();
    }
}