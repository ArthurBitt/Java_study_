package oop.relacionamento_1_1;

import java.util.Scanner;

public class Carro {

    Scanner entrada = new Scanner(System.in);
    Motor motor; //! carro possui um Motor

    //! ao construir um carro, um objeto motor é gerado. Um objeto motor pede como argumento de construção um carro.
    //! this é o próprio objeto carro passado como argumento na construção para Motor
    //! quando um carro é criado, é associado a um motor - que quando criado, já tem um carro associado
    // ! Isso é chamado composição, quando um primeiro objeto reuni um outro objeto. Basta criar um objeto carro para
    //! que se tenha um motor

    Carro(){
        this.motor  = new Motor(this); //!motor recebe novo objeto motor que recebe objeto carro que chama o método como arg
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

