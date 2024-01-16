package topico_classe_metodos.metodo_equals_hashcode;

public class Usuario {
    String nome;
    String email;


    // definindo o critério do equals


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario) { // se o argumento passado for do tipo usuario faça:

            Usuario usuarioPadrao = (Usuario) obj;//casting do Objeto obj para Usuário- Object é especializado emUsuário
            boolean nomeIgual = usuarioPadrao.nome.equals(this.nome); // verifica se nome do (obj) é igual nome
            boolean emailIgual = usuarioPadrao.email.equals(this.email);// verifica se email do argumento é igual
            // então retorna o valor bool do equals com base na verificação de atributos e não em referência
            return nomeIgual && emailIgual;

        }else{
            return false;
        }
    }
}
