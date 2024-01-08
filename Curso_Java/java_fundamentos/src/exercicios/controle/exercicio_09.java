package exercicios.controle;

import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        // 9. Crie um programa que recebe 10 valores e ao final imprima o maior número.


        Scanner entrada = new Scanner(System.in);


        double num= 0;
        double maior = 0;
        for (int i =0; i<10; i++){
            System.out.println("Digite um número: ");
            num = entrada.nextDouble();
            if (maior < num){
                maior = num;
            }
        }
        System.out.printf("O maior número digitado foi: %.2f ", maior);


        entrada.close();

    }

}
