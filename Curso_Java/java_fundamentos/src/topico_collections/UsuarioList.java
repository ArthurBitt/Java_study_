package topico_collections;


public class UsuarioList {
    String nomeUsuario;
    String emailUsuario;

    UsuarioList(String nome) {
        this.nomeUsuario = nome;
    }


    @Override
    public String toString() {
        return "Sou: " + this.nomeUsuario;
    }

    @Override
    public boolean equals(Object obj) {
        UsuarioList usuarioOutro = (UsuarioList) obj;
        return this.nomeUsuario.equals(usuarioOutro.nomeUsuario) ;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
