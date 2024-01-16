package topico_classe_metodos.metodo_construtor;

public class Contrutor {
    public String nome;
    public double preco;
    //! membro static é um valor único da classe e o mesmo para todas as instâncias
    static double desconto = 0.25;

    // !Método construtor default
    public Contrutor(){

    }

    // !Método construtor não possui retorno e o nome da classe define - tipo = nome da classe
    Contrutor(String nomeConstrutor){

        this.nome = nomeConstrutor;
    }

    public Contrutor(String nomeConstrutor, double precoConstrutor){
        this.nome = nomeConstrutor;
        this.preco = precoConstrutor;
    }



    // !métodos
    // !nome do método mais seus parâmetros, definem a sua identidade
    // !tipo do método define seu retorno

    public double totalCarrinho(double preco){


        return this.preco + preco;
    }



    public double precoComDesconto() {
        // !instância acessa o valor da classe
        this.preco = preco * (1- desconto);
        return this.preco;
    }

    // !métodos com mesmo nome, mas quantidade de parâmetros diferentes - portanto, assinaturas diferentes
    public double precoComDesconto(double descontoDoGerente) {
         this.preco = preco * (1- desconto + descontoDoGerente);
         return this.preco;
    }


}
