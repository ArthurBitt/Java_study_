package desafios.oop;

public class Ford extends Carro{

    //Padrao da classe
    public Ford(){
        this(10,230);
    }

    //Chama Super
    public Ford(int aceleraConst, int velMax){
        super(aceleraConst, velMax);
    }

    public int getVelocidadeAtual(){
        return super.velociadadeAtual;
    }
}
