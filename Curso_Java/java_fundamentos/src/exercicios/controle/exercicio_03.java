package exercicios.controle;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        // 3. Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado".

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite uma segunda nota: ");
        double nota2 = entrada.nextDouble();

        double nota_final = (nota1 + nota2) / 2;

        if (nota_final >= 7) {
            System.out.println("Aprovado");
        } else if (nota_final < 7 && nota_final > 4) {
            System.out.println("Recuperação");
        } else  {
            System.out.println("Reprovado");
        }
    }
}