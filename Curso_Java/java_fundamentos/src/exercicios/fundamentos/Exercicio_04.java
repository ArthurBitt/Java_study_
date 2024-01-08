package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        // Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num =  entrada.nextDouble();

        System.out.println("Dobro: " + Math.pow(num,2));
        System.out.println("Triplo: " + Math.pow(num,3));
    }
}
