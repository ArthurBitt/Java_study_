package desafios.Fundamentos;

public class Desafio_01_Var_Const {
    public static void main(String[] args) {

        double f = 0;
        double c = 0;
        final double FATOR = 5.0/9.0;
        final int AJUSTE = 32;

        f = 90;
        c =  (f - AJUSTE) * FATOR;

        System.out.println("Graus Celsius " + c);


    }
}
