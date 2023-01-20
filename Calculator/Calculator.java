package Calculator;

public class Calculator {
    // Construtor default

    // Criando métodos
    public static int Soma(int a, int  b) {
        return a + b;
    }

    public static int Subtracao(int a, int b) {
        return a - b;
    }

    public static int Multiplicacao(int a, int b) {
        return a * b;
    }

    public static double Divisao(Double a, Double b) {
        return b != 0 ? a / b : 0;
    }

    public static void main(String[] args) {
        System.out.println("Soma " + Soma(3, 9));
        System.out.println("Subtracao " + Subtracao(3, 9));
        System.out.println("Multiplicacao " + Multiplicacao(3, 9));
        System.out.println("Divisao " + Divisao(8.0, 0.0));
    }
}
