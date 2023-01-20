package JavaStart.Inputs;

import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.printf("Digite seu nome: ");
            String nome = input.nextLine();

            System.out.printf("Digite seu sobrenome: ");
            String sobrenome = input.nextLine();

            System.out.printf("Digite sua idade: ");
            Integer idade = input.nextInt();
            input.nextLine();

            System.out.printf("Ola %s %s, sua idade e %d ", nome, sobrenome, idade);
        }
    }
}
