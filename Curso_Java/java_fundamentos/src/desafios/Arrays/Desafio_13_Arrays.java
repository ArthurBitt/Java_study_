package desafios.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio_13_Arrays {
    public static void main(String[] args) {
        // quantas notas você quer informar
        // array com tamanho notas
        // em 2 laços for - pegar aas notas e armazenar no array no primeiro/ no segundo usar foreach que soma todas
        // notas e tira media


        Scanner entrada = new Scanner(System.in);
        System.out.print("quantas notas você quer informar?: ");

        int quantNotas = entrada.nextInt();

        double arrayNotas[] = new double[quantNotas];

        for (int i = 0; i< arrayNotas.length; i++){
            System.out.printf("Digite a %d° nota: ", i+1);
            double nota = entrada.nextDouble();
            arrayNotas[i] = nota;

        }

        System.out.println("As notas digitadas são: " + Arrays.toString(arrayNotas));

        double soma = 0;
        for (double nota:
             arrayNotas) {
            soma += nota;
        }
        System.out.printf("Média: %.2f ", soma/arrayNotas.length);


        entrada.close();
    }

}
