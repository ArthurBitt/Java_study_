package topico_arrays;

import java.util.Arrays;

public class Matriz_ExibeMatriz {
    public static void main(String[] args) {
        double arrayNotasTurma[][] = {
                {1, 2, 3},
                {1, 2, 3, 4}
        };

        /*                      | 1 | 2 | 3 | 4 |
                        |--------|--------|--------|--------|
                        |        |        |        |        |  <-- 1
                        |        |        |        |        |  <-- 2
                        |        |        |        |        |  <-- 3
*/


        for (int i = 0; i < arrayNotasTurma.length; i++) {

            //length do array externo
            for (int j = 0; j < arrayNotasTurma[i].length; j++) {
                System.out.print(arrayNotasTurma[i][j] + " ");
                // adicionando uma entrada em [j] -> as colunas seriam preenchidas de 0 a 3 index/ linha por linha

            }
            System.out.println();
        }


    }
}