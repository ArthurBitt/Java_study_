package topico_collections;

import java.util.LinkedList;
import java.util.Queue;

// ! FIFO - Sempre o primeiro adicionado é o primeiro a ser removido, ou pego
public class Queue_ {
    public static void main(String[] args) {

        Queue <String> fila = new LinkedList<>();

        // * dois métodos de adição,
        // * comportamento muda se a fila estiver cheia
        //* - offer retorna exceção - add retorna false
        fila.add("Arthur");
        fila.offer("Bittencourt");

        //* peek e element retornam o próximo elemento da fila
        //* comportamento muda quando a lista esta vazia
        // * peek retorna false - element retorna exceção
        System.out.println(fila.peek());
        System.out.println(fila.element());


        // .size(); .isEmpty(); .clear()

        //* pool e remove retorna o primeiro elemento da fila enquanto remove
        // * quando a fila esta vazia comportamento muda
        // * remove traz exceção enquanto pool retorna false
        System.out.println(fila.poll());
        System.out.println(fila.remove());

            //! começa pelo primeiro
//        for (String nomes: fila
//        ) {
//            System.out.println(nomes);
//        }

    }
}
