package topico_classe_metodos.metodo_equals_hashcode;

public class EqualsHashcode {

    //! Equal e hashcode São métodos comparativos, utilizados para filtrar objetos dentro das estruturas de dado.
    //! enquanto o equals pode ser especificado para comparar atributos e não referências de memória
    //! o hashcode percorre rapidamente a estrutura separando o que não possui o valor especificado
    //TODO:  hash   code filtra e o equals compara.

    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();

        u1.nome = "Arhur";
        u2.nome = "Arthur";
        u1.email = "arthur@hotmail.com";
        u2.email = "arthur@hotmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2)); // metodo equals compara objetos java

    }
}
