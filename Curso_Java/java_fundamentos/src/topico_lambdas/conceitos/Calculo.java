package topico_lambdas.conceitos;

//! interfaces funcionais são utilizadas por lambdas , possuem apenas um método abstrato

@FunctionalInterface
public interface Calculo {
    double excecutar(double a, double b);
    // double teste(); - os lambdas que implementam essa interface deixariam de funcionar

    default String exibir(){
        return "métodos default não atrapalham implementação das lambdas";
    }

    static String metodoStatic(){
        return "métodos static não atrapalham implementação das lambdas";
    }

}
