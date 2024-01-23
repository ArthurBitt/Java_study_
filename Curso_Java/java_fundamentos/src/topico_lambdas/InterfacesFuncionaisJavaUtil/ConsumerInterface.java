package topico_lambdas.InterfacesFuncionaisJavaUtil;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        // recebe um objeto de <argumento>, parametro(Tipo argumento) e retorna nada

        Consumer<Produto> cons = (p) -> System.out.println(p.nome);
        Produto p1 = new Produto("Notebook", 2000);
        Produto p2 = new Produto("Mouse", 200);
        Produto p3 = new Produto("Teclado", 200);

        // consumer utiliza accept()
        cons.accept(p1);

        List<Produto> produtos = Arrays.asList(p1,p2,p3);

        produtos.forEach(cons);
        produtos.forEach(p-> System.out.println(p.preco));

    }
}
