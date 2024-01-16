package topico_classe_metodos.metodos_static;

public class AreaCircunf {
    double raio;
    final static double PI = 3.14; // ! Constante pi - em maiúscula pois é um final

    AreaCircunf(double raioConstrutor){
        this.raio = raioConstrutor;
    }

    double calcArea(){
        return PI * Math.pow(raio,2) ; // pow é um método da classe, ou static. A própria classe o chama.
    }

    // !métodos estáticos pertencem a classe bem como membros estáticos. Quem chama um membro ou método estático é a
    // !classe, não a instância
    static double CalcArea(double raio){
        return PI * Math.pow(raio,2);
    }

}
