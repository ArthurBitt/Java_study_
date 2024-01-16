package oop.relacionamento_1_1;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();


        System.out.println(carro.estaLigado());
        carro.ligarMotor();
        System.out.println(carro.estaLigado());

        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        System.out.println(carro.motor.girosMotor());

    }
}
