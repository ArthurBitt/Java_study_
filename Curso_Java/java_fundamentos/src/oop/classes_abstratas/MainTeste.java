package oop.classes_abstratas;

public class MainTeste {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro(); // classe concreta
        Mamifero c3 = new Cachorro(); // note que emplementa os métodos abstratos e o metodo concreto de animal
        Animal c2 = new Cachorro(); // note que não tem mamar()
        System.out.println(c1.mamar());
        System.out.println(c1.mover());
        System.out.println(c1.respirar());
    }
}
