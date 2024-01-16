package topico_classe_metodos.metodo_toString;

public class UsuarioTeste {
    public static void main(String[] args) {
        Usuario usuarioPadrao  = new Usuario("Arthur");
        //! com toString()
        System.out.println(usuarioPadrao);
        //! acessando atributo
        System.out.println(usuarioPadrao.nomeUsuario);
    }
}
