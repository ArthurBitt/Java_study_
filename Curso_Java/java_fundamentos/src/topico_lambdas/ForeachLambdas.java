package topico_lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ! foreach esperam receber uma implementação de  consumer
public class ForeachLambdas {
        static void imprimirNome(String nome){
            System.out.println("Meu nome é: " + nome );
        }
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Arthur", "Bittencourt","Dos Santos");

        // para cada nome em aprovados - print nome

        System.out.println("Foreach Padrão: ");
        for (String nome : aprovados){
            System.out.println(nome);
        }

        System.out.println("Foreach Lambda: ");
        // nome é o valor buscado -
        // func = param -> operação (return implícito)
        aprovados.forEach(nome -> System.out.println(nome));

        // como static
        aprovados.forEach(nome -> imprimirNome(nome));


        System.out.println("Foreach Method Reference: ");
        aprovados.forEach(System.out::println);
        // com static
        aprovados.forEach(ForeachLambdas::imprimirNome);


        /**
         * Quando você usa uma referência de método como System.out::println, você está essencialmente passando a funcionalidade do método println como um argumento para o método forEach.
         *
         * Aqui está o que acontece passo a passo:
         *
         * O método forEach começa a iterar sobre cada elemento na lista aprovados.
         * Para cada elemento, ele chama a função que foi passada como argumento. Neste caso, a função é System.out::println.
         * System.out::println é uma referência ao método println da classe System.out. Este método aceita um argumento e imprime esse argumento na saída padrão (geralmente o console).
         * Então, para cada elemento na lista aprovados, o método println é chamado com esse elemento como argumento. Isso é possível porque println é um método que aceita um argumento, e forEach fornece esse argumento automaticamente durante a iteração.
         * Portanto, embora não vejamos explicitamente o argumento sendo capturado como vemos em uma expressão lambda (por exemplo, nome -> System.out.println(nome)), o argumento ainda está sendo passado para o método println. Isso é feito automaticamente pelo método forEach.
         *
         **/

    }

}





