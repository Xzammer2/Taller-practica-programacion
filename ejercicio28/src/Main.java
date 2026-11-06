public class Main {

    public static boolean segundoContienePrimero(String t1, String t2) {
        return t2.contains(t1);
    }

    public static void main(String[] args) {
        String t1 = "Java";
        String t2 = "Estoy programando en Java hoy";

        boolean contiene = segundoContienePrimero(t1, t2);
        System.out.println("¿El segundo texto contiene al primero?: " + contiene);
    }
}