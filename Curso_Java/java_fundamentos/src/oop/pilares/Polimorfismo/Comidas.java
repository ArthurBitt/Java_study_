package oop.pilares.Polimorfismo;

public abstract class Comidas {
    private double peso;

    Comidas(Double peso){
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }



}
