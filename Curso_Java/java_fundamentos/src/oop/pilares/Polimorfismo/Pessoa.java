package oop.pilares.Polimorfismo;

public class Pessoa {
    private double peso;


    public Pessoa(double peso) {
        setPeso(peso) ;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comer(Comidas comida){
        this.peso+= comida.getPeso();
    }


}
