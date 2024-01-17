package desafios.reuso_composicao;

public class Produto {
    String nome;
    double preco;
    Item item;


    // Produto(Nome, preco) - estrutura do objeto
    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }


}
