package desafios.composicao;

import java.util.ArrayList;
import java.util.List;

    // obrigatório quanto foi gasto na loja pelo cliente método
public class Cliente {
    String nome;
    Compra compra;

    Cliente(String nome){
        this.nome = nome;

    }

        @Override
        public String toString() {
            return this.nome;
        }

        double calculaTotalCompra(){
        double total = 0;
        //! total += // quantidade do item * valor do produto
        return total;
        }

    }
