package topico_collections;

import java.util.HashMap;
import java.util.Map;

//! Key, value
public class Map_ {
    public static void main(String[] args) {
        Map <Integer, String> usuario = new HashMap<>();

        // * .size(); .isEmpty(); .clear()

        // * adiciona e substitui
        usuario.put(1, "Arthur");
        usuario.put(2, "Bittencourt");
        usuario.put(40, "Santos");
        //! obs. valores não são ordenado [2,1,40] é um possível cenário


        //* traz apenas os valores - Note como é usado com foreach
        System.out.println(usuario.values());
        //* traz apenas as chaves - Note como é usado com foreach
        System.out.println(usuario.keySet());
        //* traz par de chave e valor - Note como é usado com foreach
        System.out.println(usuario.entrySet());
        //* verifica se o map contem a chave buscada
        System.out.println(usuario.containsKey(20));
        //* verifica se o map contem o valor buscado
        System.out.println(usuario.containsValue("Arthur"));
        //* retorna o valor da chave
        System.out.println(usuario.get(2));

        // ! iterando um map
        for (int chave: usuario.keySet()
             ) {
            System.out.println(chave);
        }

        for (String values: usuario.values()
             ) {
            System.out.println(values);
        }

        for (Map.Entry<Integer, String> valueKey: usuario.entrySet()
             ) {
            System.out.println(valueKey.getKey());
            System.out.println(valueKey.getValue());

        }

        System.out.println(usuario.remove(2));//*remoção por chave
        System.out.println(usuario.remove(2,"Bittencourt"));//*remoção por chave e valor


    }
}
