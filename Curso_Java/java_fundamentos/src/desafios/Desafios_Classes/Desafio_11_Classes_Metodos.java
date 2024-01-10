package desafios.Desafios_Classes;
// corrigir o print a, com a fora do main
public class Desafio_11_Classes_Metodos {

    int a =3;
    // um método de classe(estático) só acessa um atributo de instância se uma instância for feita antes ou
    // transformando membro de instância em um membro de classe
    public static void main(String[] args) {

        Desafio_11_Classes_Metodos instancia = new Desafio_11_Classes_Metodos();
        System.out.println(instancia.a);
    }
}
