package topico_classe_metodos.metodo_toString;

public class Usuario {

    public String nomeUsuario;


    Usuario(String nome){
        this.nomeUsuario = nome;
    }

    // ! Método to string reordena como um objeto é impresso. sout(Objetct obj) != sout(obj.atributo)
    @Override
    public String toString() {
        return "Sou: " + this.nomeUsuario;
    }
}
