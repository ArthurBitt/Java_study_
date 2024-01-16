package desafios.composicao;

import java.util.ArrayList;
import java.util.List;

// ! 1 compra contém vários itens - mas um item deve conter uma única compra

public class Compra {

    List<Item> itensList = new ArrayList<>();
    List <Cliente> clienteList = new ArrayList<>();

    // * Compra(Cliente cliente (new Produto(Nome, preco), quantidade)) - estrutura do objeto
    Compra(Cliente cliente, Item item){
        // ! Compra possui muitos itens e Clientes, portanto um array para guarda-los
        //! mas Cliente e Item possui cada uma única referência para conta por objeto
        this.clienteList.add(cliente);
        this.itensList.add(item);

        // ! todo cliente possui uma compra. Uma compra possui muitos clientes, então um cliente possui referência
        //  para uma istância específica de compra
        cliente.compra = (this); // Cliente passado -> Ref Compra
        // ! Compras possuem muitos Items, mas items possuem uma só referência para compra, isto é , a ref atual
        item.compra = (this); // Item passado -> Ref Compra
        // objeto
        // que o
        // construtor gerou

    }

    void exibeItens() {
        for (Item item : itensList) {

            item.exibeItem(); // ! Aqui a função que exibeitem() é retornada
        }
    }


}
