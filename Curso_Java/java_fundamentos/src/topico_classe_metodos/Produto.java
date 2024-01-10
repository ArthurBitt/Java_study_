package topico_classe_metodos;

public class Produto {
    String nome;
    double preco;
    // membro static é um valor único da classe e o mesmo para todas as instâncias
    static double desconto = 0.25;

    // Método construtor default
    Produto(){

    }

    // Método construtor não possui retorno e o nome da classe define - tipo = nome da classe
    Produto(String nomeConstrutor){

        this.nome = nomeConstrutor;
    }

    Produto(String nomeConstrutor, double precoConstrutor){
        this.nome = nomeConstrutor;
        this.preco = precoConstrutor;
    }



    // métodos
    // nome do método mais seus parâmetros, definem a sua identidade
    // tipo do método define seu retorno

    double totalCarrinho(double preco){


        return this.preco + preco;
    }



    double precoComDesconto() {
        // instância acessa o valor da classe
        this.preco = preco * (1- desconto);
        return this.preco;
    }

    // métodos com mesmo nome, mas quantidade de parâmetros diferentes - portanto, assinaturas diferentes
    double precoComDesconto(double descontoDoGerente) {
         this.preco = preco * (1- desconto + descontoDoGerente);
         return this.preco;
    }


}
