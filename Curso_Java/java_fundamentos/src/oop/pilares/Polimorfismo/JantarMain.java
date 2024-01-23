package oop.pilares.Polimorfismo;

public class JantarMain {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(99);

        // Comidas feijao = new Comidas(0.2); // polimorfismo com classe Comidas - com a definição de Abstract deixa de funcionar
        Comidas feijao = new Feijao(0.2);
        Comidas arroz = new Arroz(0.2);// polimorfismo com classe Comidas/ Arroz
        Comidas sorvete = new Sorvete(0.2);

        p1.comer(arroz);
        p1.comer(feijao);
        p1.comer(sorvete);

        System.out.println(p1.getPeso());


    }



}
