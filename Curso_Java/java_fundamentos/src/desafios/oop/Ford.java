package desafios.oop;

public class Ford extends Carro{

    //Padrao da classe
    Ford(){
        this(10,230);
    }

    //Chama Super
    Ford(int aceleraConst, int velMax){
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
