package desafios.composicao;

import java.awt.*;

public class TesteMain {
    public static void main(String[] args) {

        Produto produto = new Produto("Pilha", 2.5);// implementação de produto
        Item item = new Item(new Produto("Pilha", 2.5), 10);// implementação de Item.
        Cliente cliente = new Cliente("Arthur"); // implementação de cliente
        Compra compra = new Compra(cliente,item); // implementação de compra

        cliente.compra.exibeItens(); // ! cliente só acessa compra pois existe uma ref desse objeto compra para esseé o mesmo que dizer que esse cliente comprou esses produtos


    }
}
