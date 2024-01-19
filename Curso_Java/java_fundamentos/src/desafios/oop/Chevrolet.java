package desafios.oop;

public class Chevrolet extends Carro{

    // Padrao da classe
    Chevrolet(){
        this(8,210);
    }

    // Chama super
    Chevrolet(int aceleraConst, int velMax){
        super(aceleraConst, velMax);
    }

    @Override
    void acelerar() {

        super.acelerar();
    }
    @Override
    void frear() {

        super.frear();
    }
}
