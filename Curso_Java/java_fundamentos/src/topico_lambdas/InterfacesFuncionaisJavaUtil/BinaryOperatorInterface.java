package topico_lambdas.InterfacesFuncionaisJavaUtil;

import java.util.function.*;

// * implementando interfaces java.util
public class BinaryOperatorInterface {
    public static void main(String[] args) {
        //Recebe dois objetos do mesmo tipo e retorna uma objeto mesmo tipo

        BinaryOperator<Double> calc = (x,y) -> x + y;
        // Não : int -> Double(classe)
        System.out.println(calc.apply(4.0,2.0));

        calc = (x,y) -> x*y;
        System.out.println(calc.apply(4.0,2.0));
    }
}
