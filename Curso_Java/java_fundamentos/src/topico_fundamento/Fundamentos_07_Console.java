package topico_fundamento;

import java.util.Scanner;

public class Fundamentos_07_Console {
    public static void main(String[] args) {
        System.out.print("primeira linha: ");//imprime e nao quebra linha, puxa o 1 na mesma linha
        System.out.println("1");// imprime e quebra linha, próximo print sai na linha abaixo
        System.out.println("segunda linha: 2");
        System.out.printf("Megasena: %d %d %d %d %d %d", 1,2,3,4,5,6);

        Scanner entrada = new Scanner(System.in);
        System.out.print("\nDigite seu nome: ");
        String nome = entrada.nextLine();
        int idade = entrada.nextInt();
        double  salario = entrada.nextDouble();

        System.out.printf("Nome: %s", nome);

        entrada.close();

    }
}
