package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        // Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite sua altura: ");

        double altura = entrada.nextDouble();
        System.out.println("Digite seu peso: ");
        double peso = entrada.nextDouble();

        double imc = peso/Math.pow(altura,2);

        System.out.printf("seu imc: %.2f  ", imc);
    }
}
