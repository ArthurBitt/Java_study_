package desafios.composicao;

public class Produto {
    // ! optei por não fazer com que produto tenha um item - somente item depende de um produto
    String nome;
    double preco;


    //* Produto(Nome, preco) - estrutura do objeto
    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }


}
