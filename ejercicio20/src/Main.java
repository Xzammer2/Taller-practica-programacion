import java.util.Scanner;

public class Main {

    public static boolean validarCredenciales(String usuario, String password) {
        String usuarioReal = "carlos";
        String passwordReal = "1234";
        return usuario.equals(usuarioReal) && password.equals(passwordReal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- LOGIN DE USUARIO ---");
        System.out.print("Ingrese usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese contraseña: ");
        String password = scanner.nextLine();

        if (validarCredenciales(usuario, password)) {
            System.out.println("¡Acceso concedido! Bienvenid@.");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }

        scanner.close();
    }
}