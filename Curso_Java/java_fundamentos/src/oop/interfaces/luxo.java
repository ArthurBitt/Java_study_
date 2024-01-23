package oop.interfaces;

public interface luxo {

    void ligarAr();
    void desligarAr();

    // É possível deixar um valor padrao em um método da interface
    default int velocidadeAr(){
        return 1;
    }
}
