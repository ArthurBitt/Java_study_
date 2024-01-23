package topico_lambdas.InterfacesFuncionaisJavaUtil;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {
    public static void main(String[] args) {
        // recebe um objeto e retorna um objeto do mesmo tipo
        UnaryOperator<Double> unary = (x) -> x + 10.0;
    }

}
