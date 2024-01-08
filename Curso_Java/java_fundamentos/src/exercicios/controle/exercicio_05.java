package exercicios.controle;

import java.util.Scanner;

        public class exercicio_05 {
            public static void main(String[] args) {
                // 4. Criar um programa que receba um número e diga se ele é um número primo.
                // divisível por um e ele mesmo, se o número dividido por sua metade tiver resto 0 não é primo

                int contadorDeDivisores = 0;
                Scanner scanner = new Scanner(System.in);

                System.out.println("\nDigite um numero para verificar se é primo:");
                int numero = scanner.nextInt();

                for (int i = 2; i < numero; i++) {
                    if (numero % i == 0) {
                        contadorDeDivisores++;
                    }
                }
                switch (contadorDeDivisores) {

                    case 0 :
                        System.out.println("\nO numero " + numero + " é primo.");
                        break;
                    default:
                        System.out.println("\nO numero " + numero + " não é primo.");
                    }

                    scanner.close();
                }
            }
