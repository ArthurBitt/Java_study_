package desafios.reuso_composicao;

import oop.relacionamento_composicao.relacionamento_1_1.Carro;

public class TesteMain {
    public static void main(String[] args) {

        Produto produto = new Produto("Pilha", 2.5);// implementação de produto


        Item item = new Item(new Produto("Pilha", 2.5), 10);// implementação de Item.
        Item item2 = new Item(new Produto("Lápis", 4), 10);// implementação de Item.


        Cliente cliente = new Cliente("Arthur"); // implementação de cliente

        Compra compra = new Compra(cliente,item); // implementação de compra

        compra.adicionaItemCompra(item2);// adicionando mais um item ao array itensList da compra

        System.out.println(item.precoItem()); // teste calculando o valor de um item
        System.out.println(compra.calculaTotalCompra());// teste calculando o valor do array itensList da compra

        cliente.minhaCompra();


    }
}
