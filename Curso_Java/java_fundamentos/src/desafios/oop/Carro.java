package desafios.oop;

public class Carro {

    int velociadadeAtual = 0;
    int aceleraConst;
    final int VELMAX;

    // * Construtor todos Carros recebem argumento na construção

    Carro(int aceleraConst, int velMax) {
        this.aceleraConst = aceleraConst;
        this.VELMAX = velMax;
    }

   void acelerar(){
        if(estaNaVelMax()){
            velociadadeAtual = VELMAX;
            System.out.println("Já esta na velocidade Máx");
        }else{
            velociadadeAtual += aceleraConst;
        }
    }


    boolean estaNaVelMax(){
        if (velociadadeAtual + aceleraConst >= VELMAX){
            return true;
        }else{
            return false;
        }
    }

    boolean parado(){
       if(this.velociadadeAtual == 0) {
            return true;
        }else{
            return false;
        }
    }

    void frear(){
        if (!parado() && velociadadeAtual >=5){
            velociadadeAtual -= aceleraConst;

        }else{
            System.out.println("Carro já esta parado");
        }

    }
}
