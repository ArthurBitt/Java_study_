package exercicios.controle;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        // 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = entrada.nextDouble();

        var verifica_par = numero%2 ==0;


        if (numero >=0 && numero<=10){

            if (verifica_par == true ){
                System.out.printf("%.2f: Par", numero);
            }else{
                System.out.printf("%.2f :ímpar", numero);
            }

        }else{
            System.out.printf("Número %.2f não está entre 0 e 10", numero);
        }
    }
}
