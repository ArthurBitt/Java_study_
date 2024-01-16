package oop.relacionamento_1_1;

public class Motor {

    boolean ligado = false;
    double fatorInjecao = 1;
    Carro carro; // ! Motor possui um Carro


    // ! ao construir um Motor, um carro deve ser passado como argumento.
    //! Todavia, o objeto carro é construído antes. Dessa forma, já termemos um motor para esse carro e um carro
    //! associado a esse motor. Para tanto, a composição reuni em uma relação 1 carro para 1 motor
    Motor(Carro carroConstrutor){
        this.carro = carroConstrutor; //! motor recebe carro como arg, carro cria um motor que recebeu ele próprio
        // !como arg
    }
    
    int girosMotor(){
        if (ligado ){
            return (int) fatorInjecao * 3000;
        }else{
            return 0;
        }

    }




}
