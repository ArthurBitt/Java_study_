package oop.relacionamento_composicao.relacionamento_1_n;

public class Item {
        String nomeItem;
        int quantidadeItem;
        double precoItem;
        Compra compra; // ! 1 objeto item possui uma compra - valor default null


        Item(String nome, int quantidade, double preco){
                this.nomeItem = nome;
                this.quantidadeItem = quantidade;
                this.precoItem = preco;
        }


}
