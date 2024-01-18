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

    void exibeCompra(){

        for (Item item:itensList
             ) {
            item.exibeItem();
        }
        System.out.println("Total: "+ this.calculaTotalCompra());
    }
    // calcula o valor total Compra(((nome, preco), quantidade), cliente) - percorre array pegando preco dos itens
    double calculaTotalCompra(){
        double totalCompra = 0;
        for (Item item:itensList
             ) {
            totalCompra+= item.precoItem();
        }
        return totalCompra;
    }

   void adicionaItemCompra(Item item){
        this.itensList.add(item);

    }

    List<Item> verifcaCarrinho(){
        return itensList;
    }

}
