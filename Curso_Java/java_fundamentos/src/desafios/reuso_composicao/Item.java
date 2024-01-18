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

    // Calcula o valor total de um item ((nome, preco), quantidade)
    double precoItem(){
        double total = 0;
        for (Produto produto:produtoList
             ) {
            total += produto.preco * this.quantidade;
        }
        return total;
    }

    // esse método é reutilizando em métodos da classe Compra
    void exibeItem(){

        System.out.println("-----Item---- ");
        for (Produto produto:
             produtoList) {
            System.out.println("Produto: " + produto.nome);
            System.out.println("Produto: " + produto.preco);
            System.out.println("Quantidade: " + this.quantidade);
            System.out.println("------------");
        }
    }


}
