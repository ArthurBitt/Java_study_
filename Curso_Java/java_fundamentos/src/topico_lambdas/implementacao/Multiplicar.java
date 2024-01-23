package topico_lambdas.implementacao;

public class Multiplicar implements Calculo{
    @Override
    public double executar(double a, double b) {
        return a * b;
    }
}
