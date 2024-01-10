package topico_classe_metodos;

public class AreaCircunf {
    double raio;
    final static double PI = 3.14;

    AreaCircunf(double raioConstrutor){
        this.raio = raioConstrutor;
    }

    double calcArea(){
        return PI * Math.pow(raio,2) ; // pow é um método da classe, ou static. A própria classe o chama.
    }

    // métodos estáticos pertencem a classe bem como membros estáticos. Quem chama um membro ou método estático é
    // classe, não a instância
    static double CalcArea(double raio){
        return PI * Math.pow(raio,2);
    }

}
