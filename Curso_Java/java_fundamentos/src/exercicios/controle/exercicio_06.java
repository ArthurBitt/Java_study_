package exercicios.controle;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        // 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.


        Scanner entrada = new Scanner(System.in);


        int tentativas = 10;
        int numero_secreto = 100;

        while (tentativas > 0){
            System.out.println("\nQual o número secreto ?: ");
            String resposta = entrada.next();
            int resposta_convertida = Integer.parseInt(resposta);
            if (numero_secreto == resposta_convertida){
                System.out.printf("Parabéns, o número secreto era %d", numero_secreto);
                break;
            }else{
                tentativas--;
                if (tentativas > 0){

                    System.out.printf("tente mais uma vez, você ainda possui %d tentativas", tentativas);
                }else{
                    System.out.println("Você não possui mais nenhuma tentativa");

                }
            }
        }



    }
}
