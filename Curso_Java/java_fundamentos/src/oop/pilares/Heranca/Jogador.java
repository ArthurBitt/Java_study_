package oop.pilares.Heranca;

public class Jogador {

    public int pos_y;
    public int pos_x;
    public int hp = 100;

    // viabiliza um valor padrão pra as subclasses
   protected Jogador() {
       this(0, 0); // this sempre chama outro construtor da classe
   }

   // construtores das subclasses quando chamam super podem inserir argumentos
    Jogador(int x, int y){
        this.pos_x = x;
        this.pos_y = y;
    }





    protected boolean atacar(Jogador atacado){
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