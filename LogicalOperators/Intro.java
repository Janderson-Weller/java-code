package LogicalOperators;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        try (Scanner dados = new Scanner(System.in)) {
            System.out.println("Digite seu nome: ");
            String nome = dados.nextLine();
            System.out.println("Digite sua idade: ");
            Integer idade = dados.nextInt();
            dados.nextLine();

            if(idade > 18) {
                System.out.printf("Parabens %s, voce ja eh maior de idade!", nome);
            }
            else {
                System.out.printf("Poxa %s, voce ainda nao tem idade suficiente", nome);
            }
        }
    }
}
