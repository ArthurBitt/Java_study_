package oop.relacionamento_composicao.relacionamento_1_n;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();

        compra1.cliente = "Arthur Bittencour";
        compra1.itens.add(new Item("Notebook", 1, 4000));
        compra1.itens.add(new Item("Tablet", 2, 1500));

        System.out.println(compra1.obterValorTotal());

        compra1.comprar("Mouse",1,20); // 1° construtor Compra()
        compra1.comprar(new Item("Caneta",2,10)); // 2° construtor Compra()


        System.out.println( compra1.itens.size());
    }

}
