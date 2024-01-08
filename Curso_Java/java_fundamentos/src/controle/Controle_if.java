package controle;

import java.util.Scanner;

public class Controle_if {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe média: ");
        double media = entrada.nextDouble();


        // BLOCO IF
        if (media >=7 && media <=10){
            System.out.println("Aprovado");
            System.out.println("Parabéns");

        }

        if (media < 7 && media >=4.5){
            System.out.println("Recuperação");
        }


        if (media < 4.5 && media >=0){
            System.out.println("Reprovado");
        }

        // BLOCO IF VERIFICANDO UM VALOR BOOLEANO
        boolean criterioDeReprovacao = media>= 0  && media < 4.5;
        if (criterioDeReprovacao){
            System.out.println("Reprovado");
        }


        // BLOCO IF COM VERIFICAÇÃO DE UM OPERADOR TERNÁRIO
        String aprovado = media >=7 ? "Aprovado":"Reprovado";
        if (aprovado.toUpperCase().equals("APROVADO")){
            System.out.println("Aprovado");
        }


        entrada.close();

    }
}
