package desafios.Classes.Desafio_12_Modulo_Classes_Metodos;

public class Pessoa {
    String nomePessoa;
    double pesoPessoa;


    Pessoa() {

    }

    Pessoa(String nomePessoaConstrutor, double pesoPessoaConstrutor){
        this.nomePessoa = nomePessoaConstrutor;
        this.pesoPessoa = pesoPessoaConstrutor;
    }



    double calcPesoPessoa(double pesoComidaParametro){

        double pesoFinal = pesoPessoa + pesoComidaParametro;

        return pesoFinal;
    }
}

