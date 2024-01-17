package desafios.reuso_composicao;

public class TesteMain {
    public static void main(String[] args) {

        Produto produto = new Produto("Pilha", 2.5);// implementação de produto


        Item item = new Item(new Produto("Pilha", 2.5), 10);// implementação de Item.
        Item item2 = new Item(new Produto("Pilha", 2.5), 10);// implementação de Item.


        Cliente cliente = new Cliente("Arthur"); // implementação de cliente

        Compra compra = new Compra(cliente,item); // implementação de compra

        compra.adicionaItem(item2);// adicionando mais um item ao array itensList da compra
        compra.adicionaItem(item2);// adicionando mais um item ao array itensList da compra


        System.out.println(compra.calculaTotalCompra());// calculando o valor do array itensList da compra

        cliente.compra.exibeCompra();//!Não retorna a partir do segundo item dentro do array itensList de compra


    }
}
