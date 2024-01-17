package desafios.reuso_composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itensList = new ArrayList<>(); // uma compra possui vário itens
    List <Cliente> clienteList = new ArrayList<>(); // uma compra possui vários clientes

    //Compra(Cliente cliente (new Produto(Nome, preco), quantidade)) - estrutura do objeto
    Compra(Cliente cliente, Item item){

        this.clienteList.add(cliente); // um cliente adicionado em array
        cliente.compra = (this); // esse cliente recebe ->  1 Ref Compra
        this.itensList.add(item); // um item adicionado em array
        item.compra = (this); // esse item recebe -> 1 Ref Compra
    }

    // esse método mostra a nota do cliente utilizando um método desenvolvido na classe item.
    void exibeNotaCliente() {
        for (Item item : itensList) {
            item.exibeItem(); // objeto tipo item chama função exibeItem();

        }
    }

    // exibe o cliente - é passado dentro de exibeItem() da classe Item
    void exibeCliente(){
        for(Cliente cliente: clienteList){
            System.out.println(cliente);
        }
    }

    void exibeCompra(){
        for (Item item:itensList
             ) {
            item.exibeItem();
        }
    }

    double calculaTotalCompra(){
        double totalCompra = 0;
        for (Item item:itensList
             ) {
            totalCompra+= item.precoItem() * item.quantidade;
        }
        return totalCompra;
    }

    void adicionaItem(Item item){
        this.itensList.add(item);
    }

}
