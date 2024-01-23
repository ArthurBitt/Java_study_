package oop.classes_abstratas;

// classe inacabada(Não é instanciada) em termos de implementação - pode ter métodos abstratos
public abstract class Animal {

    public String respirar(){
        return "CO2";
    }

    // método abstrato não tem corpo, é como se a classe não estivesse pronta
    public abstract String mover();

}
