package desafios.oop;

public class Chevrolet extends Carro{

    // Padrao da classe
    public Chevrolet(){
        this(8,210);
    }

    // Chama super
    public Chevrolet(int aceleraConst, int velMax){
        super(aceleraConst, velMax);
    }

    @Override
    public int getVelocidadeAtual() {
        return super.getVelocidadeAtual();
    }
}
