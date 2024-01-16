package desafios.composicao;

import java.util.ArrayList;
import java.util.List;

public class Item {
    //! um Item contém um ou vários Produtos - relação 1 para n,mas nao bidirecional, uma vez que produto independe
    // !de item.
    //! Criando um Item se cria um ou vários Produtos

    // atributos
    List<Produto> produtoList = new ArrayList<>(); //! um item contém vários produtos
    int quantidade;
    Compra compra; //! um item contém uma única compra



    // * Item(new Produto(nome, preco), quantidade) - estrutura do objeto
    // Construtor

    Item(){

    }

    Item(Produto produto, int quantidade){
        this.produtoList.add(produto); // ! isso é um Arraylist Produto
        this.quantidade = quantidade; // ! isso é um atributo e esta fora do array - acessado por item

    }

    void exibeItem(){
        for (Produto produto:
             produtoList) {
            System.out.println("-----ITEM---- ");
            System.out.println("Produto: " + produto.nome);
            System.out.println("Produto: " + produto.preco);
            System.out.println("Quantidade" + this.quantidade);
        }
    }
}
