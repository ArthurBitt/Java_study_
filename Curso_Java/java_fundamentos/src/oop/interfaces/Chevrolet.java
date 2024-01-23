package oop.interfaces;

public class Chevrolet extends Carro {

    // Padrao da classe
    public Chevrolet(){
        this(8,210);
    }

    // Chama super
    public Chevrolet(int aceleraConst, int velMax){
        super(aceleraConst, velMax);
    }


}
