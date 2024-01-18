package desafios.reuso_composicao;

// obrigatório quanto foi gasto na loja pelo cliente método
public class Cliente {
    String nome;
    Compra compra;

    Cliente(String nome){
        this.nome = nome;

    }

        @Override
        public String toString() {
            return "Cliente: " + this.nome;
        }

        void minhaCompra(){
            System.out.println("Carrinho Cliente: " + this.nome);
            this.compra.exibeCompra();
        }




    }
