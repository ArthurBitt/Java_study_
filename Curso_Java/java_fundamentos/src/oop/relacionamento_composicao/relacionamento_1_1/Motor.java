package oop.relacionamento_composicao.relacionamento_1_1;

public class Motor {

    boolean ligado; // por valor default = false
    double fatorInjecao = 1;
    //Carro carro; //-  Motor possui um Carro

    /*Quando Carro tem Motor e Motor tem um Carro.
     Relação bidirecional.*/

    // construtor onde Motor recebe 1 instância carro
// !   Motor(Carro Carro){
// !       this.carro = Carro;
// !   }

    /* para menor complexidade e facilidade de manutenção, ´recomendado utiliza relações unidirecionais em composições 1 para 1.
    assim: */

    Motor(){

    }

    int girosMotor(){
        if (ligado){// implicitamente se ligado = true
            return (int) fatorInjecao * 3000;
        }else{
            return 0;
        }

    }




}
