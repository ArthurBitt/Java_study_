package desafios.Desafios_Controle;

import java.util.Scanner;

public class Desafio_07_Controle {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um dia da semana:");

        String dia = entrada.next().toUpperCase().replace("-FEIRA", "");


        if (dia.equals("SEGUNDA")){
            System.out.println("1");
        } else if (dia.equals("TERÇA")) {
            System.out.println("2");
        } else if (dia.equals("QUARTA")) {
            System.out.println("3");
        } else if (dia.equals("QUINTA")) {
            System.out.println("4");
        } else if (dia.equals("SEXTA")) {
            System.out.println("5");
        } else if (dia.equals("SÁBADO")) {
            System.out.println("6");
        } else if (dia.equals("DOMINGO")) {
            System.out.println("7");
        }


    }
}
