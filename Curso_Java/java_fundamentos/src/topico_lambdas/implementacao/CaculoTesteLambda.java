package topico_lambdas.implementacao;

public class CaculoTesteLambda {
    public static void main(String[] args) {


        Calculo calculo = (x,y) -> {return x + y;}; // {} retorno explícito
        System.out.println(calculo.executar(2,3));

        calculo = (x,y) ->  x * y; // retorno implícito
        System.out.println(calculo.executar(2,3));

        calculo = (x,y) ->
        {
            System.out.println("Divisão");
            double divisao = x/y;
            return divisao;
        };

        System.out.println(calculo.executar(10,5));
    }
}
