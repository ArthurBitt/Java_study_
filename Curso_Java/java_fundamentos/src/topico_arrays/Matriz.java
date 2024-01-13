package topico_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
        public static void main(String[] args) {
            // quantas notas você quer informar
            // array com tamanho notas
            // em 2 laços for - pegar aas notas e armazenar no array no primeiro/ no segundo usar foreach que soma todas
            // notas e tira media


            Scanner entrada = new Scanner(System.in);

            System.out.println("quantos alunos?: ");
            int quantAlunos = entrada.nextInt();
            System.out.print("quantas notas você quer informar?: ");
            int quantNotas = entrada.nextInt();


            double arrayNotasTurma[][] = new double[quantAlunos][quantNotas]; // linhas(alunos) x colunas(notas)

/*                      | Nota 1 | Nota 2 | Nota 3 | Nota 4 |
                        |--------|--------|--------|--------|
                        |        |        |        |        |  <-- Aluno 1
                        |        |        |        |        |  <-- Aluno 2
                        |        |        |        |        |  <-- Aluno 3
*/


            double total = 0;
            for (int i = 0; i< arrayNotasTurma.length; i++){ // roda em cima da quantidade de alunos// itera as linhas
                for(int j = 0; j < arrayNotasTurma[i].length; j++){ // roda em cima da quantidade de notas, das colunas
                    System.out.printf("informe a nota: %d° do  %d°aluno : ", j + 1, i + 1);
                    arrayNotasTurma[i][j] = entrada.nextDouble(); // Leitura: armazena valor nas colunas da matriz
                    // linha um, j =1/ coluna 1 - entrada recebe a 1° nota

                    total += arrayNotasTurma[i][j];
                    // total recebe total mais nota recebida em j
                }


            }

            System.out.printf("Média da turma: %.2f ", total/(quantAlunos * quantNotas));
            System.out.println();
            // em um array bidimensional, o foreach só aceita como variável temporária um array linear// uma linha
            // basicamente le os valores da linha dentro do array bidimensional
            for(double[] arrayNotasAluno : arrayNotasTurma){
                //pra exibir tem que ser o array de valor - a variável temporária
                System.out.println(Arrays.toString(arrayNotasAluno));
            }

            entrada.close();
        }

    }


