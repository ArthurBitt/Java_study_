package topico_collections;


//! COLLECTION - HASHSETS
//! Heterogêneo - não indexado - não aceita repetição de objetos - pode ser oredenado - pode ser homogêneo
//! comporta dados diferentes, não é acessível por índices - valores não se repetem
// ! métodos .add() .size() .remove() .contains .retainAll(intersecção) .clear()

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class Hash_Set {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {

        //! HashSet é classe enquanto Set é interface - subconjuntos de interfaces deixam o código mais específico

        //!Instância com HashSet()
        HashSet conjunto = new HashSet();
        //! instância com Set e HashSet()
        Set conjunto2 = new HashSet();
        //! HashSet homogêneo - especifica que só recebe objetos do tipo explicitado - como String objects
        Set<String> conjuntoHomegeneo = new HashSet<String>();
        //! Set ordenado = Treeset; set mantém a ordem de inserção ou qualquer outra ordem, mantendo a não duplicidade
        Set <String> conjuntoOrdenado = new TreeSet<>();
        //!SortedSet<String> conjuntoOrdenado = new TreeSet<>(); - mais específico,utiliza subconjunto de interface

        //! adiciona valores no set -
        //conjunto.add(); - automaticamente, um primitivo é convertido em objeto wrapper - AutoBox primitivo em wrapper
        conjunto.add(1.2);
        conjunto.add(12);
        conjunto2.add(1.2);
        conjunto2.add("S");
        conjunto2.add(true);
        conjunto2.add(1);
        conjuntoHomegeneo.add("Arthur");
        conjuntoHomegeneo.add("Carlos");
        conjuntoHomegeneo.add("Ana");
        //conjuntoHomegeneo.add(1); não aceita valores de objeto que não sejam strings


        System.out.println(conjunto2);
        //! verifica tamanho do set
        System.out.println(conjunto2.size());
        //! remove um valor
        System.out.println(conjunto2.remove("S"));
        //! verica o tamanho após valore ser removido
        System.out.println(conjunto2.size());
        //! verifica se o valor foi removido
        System.out.println(conjunto2.contains("S"));

        System.out.println(conjunto);
        conjunto.retainAll(conjunto2);
        //! Conjunto mantém apena a intersecção entre ele e o parâmtro
        System.out.println(conjunto);
        //! conjunto é limpo
        conjunto.clear();
        System.out.println(conjunto);

        //! iterando um set
        for (String candidatos:
             conjuntoHomegeneo) {
            System.out.println(candidatos);
        }

    }
}
