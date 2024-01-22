package oop.pilares.Encapsulamento.getters_setters;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Arthur","Bittencourt",26);
        System.out.println(p1.getIdade());
        System.out.println(p1.getNome());
        System.out.println(p1.getSobrenome());

        System.out.println();
        System.out.print(p1);

    }
}
