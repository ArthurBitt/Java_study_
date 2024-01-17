package oop.reuso_composicao.relacionamento_1_n;

import java.util.ArrayList;

public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<>(); // ! 1 objeto compra possui vários itens - um array de itens pode
    // ! pertencer a 1 única compra



    // ! Um objeto compra construído pode adicionar vários itens que quando gerados, recebem o objeto compra que os
    // !chama como argumento this -  assim muitos itens adicionado tem uma compra enquanto uma compra tem muitos itens


    // ! basta chamar o método e passar os atributos como argumento
    void comprar(String nome, int quantidade, double preco){
        this.comprar(new Item(nome, quantidade,preco));
    }

    // ! obrigado a instanciar um objeto que pedira os atributos como argumento para add no array
    void comprar(Item item){
        this.itens.add(item); // ! array adiciona objeto Item do parâmetro
        item.compra = this; // ! Objeto do Parâmetro.compra assimila o objeto que chama o método comprar
        // ! um array itens de compra adiciona um item que assimila uma compra em item.compra = this;
    }

    double obterValorTotal(){
        double total = 0;



        for(Item item: this.itens){
            total+= item.quantidadeItem * item.precoItem;

        }

        return total;
    }
}
