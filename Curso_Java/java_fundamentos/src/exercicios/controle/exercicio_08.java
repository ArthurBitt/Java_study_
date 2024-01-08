package exercicios.controle;

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        // 8. Criar um programa que receba uma palavra e imprime no console letra por letra.


        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = entrada.nextLine();
        char letras[] = palavra.toCharArray();
        System.out.println(letras);
        for (int i = 0; i<palavra.length(); i++){
            System.out.print(letras[i]+"|");
        }



        entrada.close();

    }
}
