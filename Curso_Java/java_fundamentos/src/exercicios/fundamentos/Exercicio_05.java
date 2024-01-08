package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        // Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da base do triângulo: ");
        double base = entrada.nextDouble();

        System.out.println("Digite o valor da altura do triângulo: ");
        double altura = entrada.nextDouble();


        double area = base * altura;
        System.out.printf("Area: %.2f", area);
    }
}
