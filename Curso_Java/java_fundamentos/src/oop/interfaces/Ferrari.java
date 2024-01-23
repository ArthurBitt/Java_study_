package oop.interfaces;

public class Ferrari extends Carro implements luxo,esportivo{
    boolean ligarTurbo;
    boolean ligarAr;

    public Ferrari(){
        this(15,320);
    }


    public Ferrari(int aceleraConst, int velMax) {
        super(aceleraConst, velMax);
    }


    @Override
    public void acelerar() {
        if(ligarTurbo && !ligarAr){
            aceleraConst = 35;
        } else if (ligarTurbo && ligarAr) {
            aceleraConst = 25;

        }else if(!ligarTurbo && ligarAr){
            aceleraConst = 20;
        }else{
            System.out.println("Ar off | Turbo off");
        }

        super.acelerar();
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }


}
