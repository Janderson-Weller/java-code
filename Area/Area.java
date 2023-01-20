package JavaStart.Area;

public class Area {
    public static void main(String[] args) {
        double raio = 5;
        final double PI = 3.14159; // Deixando o pi estático
        double area = PI * raio * raio;

        System.out.println("Area é " + area);
    }
}
