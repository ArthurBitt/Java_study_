package exercicios.controle;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        // 2. Criar um programa informa se o ano atual é um ano bissexto;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ano");
        int ano = entrada.nextInt();
        boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0  || ano % 400 == 0); //condição para ser bissexto

        if (bissexto){
            System.out.printf("%d É um ano bissexto", ano);
        }else{
            System.out.println("Não é um ano bissexto");
        }
    }
}
