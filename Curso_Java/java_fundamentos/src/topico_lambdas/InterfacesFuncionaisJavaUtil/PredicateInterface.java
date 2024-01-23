package topico_lambdas.InterfacesFuncionaisJavaUtil;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {

        Predicate<Produto> isCaro =
                (prod) -> prod.preco>=700;

        Produto p1 = new Produto("Notebook", 2000);
        // predicado utiliza.test()
        System.out.println(isCaro.test(p1));
    }
}
