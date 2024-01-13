package topico_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Notas_Array {
    public static void main(String[] args) {

        double arrayNotasAlunoA[] = new double[3];
        System.out.println(Arrays.toString(arrayNotasAlunoA));

        arrayNotasAlunoA[0] = 7.9;
        arrayNotasAlunoA[1] = 8;
        arrayNotasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(arrayNotasAlunoA));

        // iterando um array com for e calculando média
        // atributo length passa o um int que é o tamanho do array

        double total = 0;
        for (int i = 0; i< arrayNotasAlunoA.length; i++){
            System.out.printf("Nota: %.2f - índice: %d \n", arrayNotasAlunoA[i], i);
            total += arrayNotasAlunoA[i];

        }
        System.out.printf("\nmédia das notas: %.2f", total/arrayNotasAlunoA.length);

        // iterando mesmo array com foreach e calculando a media
        for (double nota:
             arrayNotasAlunoA) {
            total+=nota;

        }
        System.out.printf("\nmédia das notas: %.2f", total/arrayNotasAlunoA.length);

    }
}
