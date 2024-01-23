package oop.interfaces;

public class Carro {

    protected int velociadadeAtual = 0;
    protected int aceleraConst;
    public final int VELMAX;

    // * Construtor todos Carros recebem argumento na construção

    protected Carro(int aceleraConst, int velMax) {
        this.aceleraConst = aceleraConst;
        this.VELMAX = velMax;
    }

   public void acelerar(){
        if(estaNaVelMax()){
            velociadadeAtual = VELMAX;
            System.out.println("Já esta na velocidade Máx");
        }else{
            velociadadeAtual += aceleraConst;
        }
    }

    public boolean estaNaVelMax(){
        if (velociadadeAtual + aceleraConst >= VELMAX){
            return true;
        }else{
            return false;
        }
    }

    public boolean parado(){
       if(this.velociadadeAtual == 0) {
            return true;
        }else{
            return false;
        }
    }

    public void frear(){
        if (!parado() && velociadadeAtual >=5){
            velociadadeAtual -= aceleraConst;

        }else{
            System.out.println("Carro já esta parado");
        }

    }

    public int getVelocidadeAtual(){
        return this.velociadadeAtual;
    }
}
