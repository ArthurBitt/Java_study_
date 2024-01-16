package topico_classe_metodos.metodo_construtor;

import java.util.Scanner;

public class ConstrutorTeste {
    // !classe de teste recebe main para testar os objetos criados a partir da classe original
    // !dentro de um mesmo pacote não é necessário importar uma classe
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Contrutor p1 = new Contrutor("Notebook",4328);
        // !instância da classe produto - p1 é a variável de referência que guarda o objeto
        //p1.nome = "Notebook";
        //p1.preco = 4328.00;

        var p2 = new Contrutor();
        p2.nome = "Caneta";
        p2.preco = 13.00;


        System.out.println(p1.nome);
        System.out.println(p2.nome);

        //double precoFinal = p1.preco * (1- p1.desconto);
        //double precoFinal2 = p2.preco * (1- p2.desconto);

        double precoFinal = p1.precoComDesconto();
        System.out.printf("\nPreço com desconto: %s %.2f", p1.nome , precoFinal);
        double precoFinal2 = p2.precoComDesconto(0.1);// passando um parâmetro adicional
        System.out.printf("\nPreço com desconto p2 %s %.2f", p2.nome,  precoFinal2);

        double totalCarrinho = p1.totalCarrinho(p2.preco);
        System.out.println("Total carrinho: " + totalCarrinho);

        double  mediaCarrinho = (totalCarrinho)/2;

        System.out.printf("\nMédia de Preço da Compra %.2f", mediaCarrinho);


    }
}
