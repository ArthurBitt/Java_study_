package desafios.reuso_composicao;

import java.util.ArrayList;
import java.util.List;

public class Item {

    List<Produto> produtoList = new ArrayList<>(); // um item contém vários produtos
    int quantidade;
    Compra compra; // um item contém uma única compra

    // construtor padrão
    Item(){

    }

    // Item(new Produto(nome, preco), quantidade) - estrutura do objeto
    Item(Produto produto, int quantidade){
        this.produtoList.add(produto);
        this.quantidade = quantidade;

    }

    // esse método utiliza recursos da classe Compras
    void exibeItem(){
        for (Produto produto:
             produtoList) {
            System.out.println("-----ITEM---- ");
            //toda compra tem um cliente e uma lista de produtos
            compra.exibeCliente();
            System.out.println("Produto: " + produto.nome);
            System.out.println("Produto: " + produto.preco);
            System.out.println("Quantidade" + this.quantidade);
        }
    }
}
