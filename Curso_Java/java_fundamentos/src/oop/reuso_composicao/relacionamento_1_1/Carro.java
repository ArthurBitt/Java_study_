package oop.reuso_composicao.relacionamento_1_1;

// É chamado composição, quando um primeiro objeto reuni um outro objeto. Basta criar um objeto carro para que se tenha um motor

public class Carro {

    Motor motor; // carro possui um Motor

    /* carro não recebe no construtor nenhum argumento. Mas, quando criado gera uma instância Motor que recebe o prórpio new Carro(); como argumento. Deixa de ser uma relação bidimensional quando Motor não recebe uma instância de carro, apenas carro uma de motor.Mas, ainda é uma relação de composição 1 para 1 só que unidirecional
    */
    Carro(){
        this.motor  = new Motor(/*this*/);
    }

    void desligarMotor() {
        motor.ligado = false;
    }

    void ligarMotor() {
        motor.ligado = true;
    }

    void acelerar() {
        if (motor.fatorInjecao < 3.0) {

            this.motor.fatorInjecao += 0.4;
        } else {
            System.out.println("Velocidade Máxima");
        }
    }

    void frear() {
        if (motor.fatorInjecao > 1) {
            this.motor.fatorInjecao -= 0.4;
        } else {
            System.out.println("carro esta parado");
        }
    }

        boolean estaLigado () {
            return motor.ligado;
        }

    }

