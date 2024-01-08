package exercicios.controle;

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        //7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.


        Scanner entrada = new Scanner(System.in);

        double num = 0;
        double total = 0;

        while(num >= 0){
            System.out.println("\nDigite um número: ");
            num = entrada.nextDouble();

            total +=num;
            if (num < 0){
                System.out.println("Não são permitidos números negativos");

            }else{
                System.out.printf("Total: %.2f ", total);
            }
        }
        entrada.close();
    }
}
