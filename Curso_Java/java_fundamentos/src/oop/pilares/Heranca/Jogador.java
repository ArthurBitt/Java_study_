package oop.pilares.Heranca;

public class Jogador {

    int pos_y;
    int pos_x;
    int hp = 100;

    boolean atacar(Jogador atacado){
        int deltax = (Math.abs(this.pos_x - atacado.pos_x));
        int deltay = (Math.abs(this.pos_y - atacado.pos_y));

        if (deltax == 0 && deltay == 1){
            atacado.hp -=10;
            return true;
        }else if(deltax == 1 && deltay ==0){
            atacado.hp -=10;
            return true;
        }else{
            return false;
        }
    }


    // Passando Enum como Arg
    boolean andar(Direcao direcao) {

        switch (direcao) {
            case NORTE:
                pos_y++;
                break;
            case SUL:
                pos_y--;
                break;
            case LESTE:
                pos_x++;
                break;
            case OESTE:
                pos_x--;
                break;
            default:
                System.out.println("Posição informada inválida");


        }

        return true;

    }
}