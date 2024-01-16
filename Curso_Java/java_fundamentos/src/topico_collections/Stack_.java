package topico_collections;

import java.util.ArrayDeque;
import java.util.Deque;

//!LIFO
public class Stack_ {
    public static void main(String[] args) {
        Deque <String> pilhaLivros = new ArrayDeque<>();

        pilhaLivros.add("Pequeno Príncipe");
        pilhaLivros.push("O Hobbit");

//        // * LIFO - o peek puxa o último que entrou
//        //* FIFO - o peek puxa o primeiro que entrou
//        System.out.println(pilhaLivros.peek());
//        System.out.println(pilhaLivros.element());
//
//        // * LIFO remove o próximo dpois do último - penúltimo
//        //* FIFO  remove o próximo depois do primeiro - segundo
//        System.out.println(pilhaLivros.poll());
//        System.out.println(pilhaLivros.remove());
//        System.out.println(pilhaLivros.pop());

        //! .size(); .contains(); isEmpty(); .clear()

        // ! inicia pelo último
        for (String livros: pilhaLivros
             ) {
            System.out.println(livros);
        }
    }
}
