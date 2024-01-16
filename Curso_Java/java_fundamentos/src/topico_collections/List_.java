package topico_collections;

//! Heterogêneo, aceita duplicidade, idexada, ordenada
// ! lista fornecem ordenção natural, enquanto sets ordenam se especificado, sua prioridade é não duplicação.
// ! Métodos list .add() .get(índex) .remove(obj ou  índex) .contains()
import java.util.ArrayList;

public class List_ {
    public static void main(String[] args) {
        ArrayList<UsuarioList> listaPadrao = new ArrayList<>();
        UsuarioList usuarioPadrao = new UsuarioList("Arthur");


        // .add()
        listaPadrao.add(usuarioPadrao);
        // ! é passado um novo objto diretamente para a lista, ocupando um index que substitui a variável de referência
        listaPadrao.add(new UsuarioList("Bittencourt"));
        listaPadrao.add(new UsuarioList("Maria"));
        listaPadrao.add(new UsuarioList("Carlos"));

//        // .get(index)
        System.out.println(listaPadrao.get(3).nomeUsuario);
        // .remove(obj ou index)
        System.out.println(">>>>>" + listaPadrao.remove(1)); // retorna objeto excluído para index
        System.out.println(listaPadrao.remove(new UsuarioList("Bittencourt"))); // retorna boolean para objeto

//        // .contains()
        System.out.println(listaPadrao.contains(new UsuarioList("Maria"))); //! funciona sem a referencia de memória pois equals e hashcode foram implementados
        System.out.println(listaPadrao.contains(usuarioPadrao));
        // ! retorna true com ou sem hashcode pois tem a referencia de memória

        for (UsuarioList usuario:listaPadrao
             ) {
            System.out.println(usuario.nomeUsuario);

        }

        //
    }
}
