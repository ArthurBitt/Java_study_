package oop.classes_abstratas;

public abstract class Mamifero extends Animal{


    // implementando mover na subclasse mamífero desobriga a implementação na classe cachorro.
    // se não tivesse sido implementado aqui, seria obrigatório na próxima classe concreta
    @Override
    public String mover() {
        return "Se move";
    }

    public abstract String mamar();
}
