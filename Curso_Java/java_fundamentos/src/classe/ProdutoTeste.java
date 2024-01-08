package classe;

import java.util.Scanner;

public class ProdutoTeste {
    // classe de teste recebe main para testar os objetos criados a partir da classe original
    // dentro de um mesmo pacote não é necessário importar uma classe
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Produto p1 = new Produto(); // instância da classe produto - p1 é a variável de referência que guarda o objeto
        p1.nome = "Notebook";
        p1.preco = 4328.00;
        p1.desconto = 0.25;


        var p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 13.00;
        p2.desconto = 0.25;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal = p1.preco * (1- p1.desconto);
        double precoFinal2 = p2.preco * (1- p2.desconto);
        double  mediaCarrinho = (precoFinal2 + precoFinal)/2;
        System.out.printf("\nPreço com desconto: %s %.2f", p1.nome , precoFinal);
        System.out.printf("\nPreço com desconto p2 %s %.2f", p2.nome,  precoFinal2);
        System.out.printf("\nMédia de Preço da Compra %.2f", mediaCarrinho);


    }
}
