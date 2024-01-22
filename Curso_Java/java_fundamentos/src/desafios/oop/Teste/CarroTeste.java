package desafios.oop.Teste;

import desafios.oop.Carro;
import desafios.oop.Chevrolet;
import desafios.oop.Ford;

public class CarroTeste {
    public static void main(String[] args) {

        // antes de acelerar
        Chevrolet chevrolet = new Chevrolet();
        Ford ford = new Ford();

        System.out.println(ford.parado());
        System.out.println(chevrolet.parado());

        ford.frear();
        chevrolet.frear();

        ford.acelerar();
        // CarroTeste não extends de carro
        System.out.println(ford.getVelocidadeAtual());

        chevrolet.acelerar();
        System.out.println(chevrolet.getVelocidadeAtual());

        // depois de acelerar
        System.out.println(ford.parado());
        System.out.println(chevrolet.parado());

        //Freando

        ford.frear();
        chevrolet.frear();

        // depois de frear
        System.out.println(ford.parado());
        System.out.println(chevrolet.parado());


    }
}
