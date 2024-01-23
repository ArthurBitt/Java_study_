package oop.interfaces.Teste;

import oop.interfaces.Chevrolet;
import oop.interfaces.Ferrari;
import oop.interfaces.Ford;

public class CarroTeste {
    public static void main(String[] args) {
    // ! testando implementação da interface e adaptação da unção acelerar
        Ferrari ferrari = new Ferrari();

//        ferrari.ligarTurbo();
//        ferrari.desligarAr();
//        ferrari.ligarAr();
        ferrari.acelerar();
        System.out.println(ferrari.getVelocidadeAtual());

    }
}
