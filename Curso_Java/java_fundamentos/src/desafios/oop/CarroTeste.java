package desafios.oop;

public class CarroTeste {
    public static void main(String[] args) {

        // antes de acelerar
        Carro chevrolet = new Chevrolet();
        Carro ford = new Ford();

        System.out.println(ford.parado());
        System.out.println(chevrolet.parado());

        ford.frear();
        chevrolet.frear();

        ford.acelerar();
        System.out.println(ford.velociadadeAtual);

        chevrolet.acelerar();
        System.out.println(chevrolet.velociadadeAtual);

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
