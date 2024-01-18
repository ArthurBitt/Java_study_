package oop.pilares.Heranca;

public class MainJogo {
    public static void main(String[] args) {

        // Instância de subclasses da classe genérica Jogador
        Monstro j1 = new Monstro();
        Heroi j2 = new Heroi();

//        Jogador j1 = new Jogador();
//        Jogador j2 = new Jogador();


//        j2.andar(Direcao.NORTE);


        j1.pos_x = 0;
        j1.pos_y = 0;

        j2.pos_x = 0;   // j1-|-j2
        j2.pos_y =0;

        System.out.println(j2.hp);
        j1.atacar(j2);
        System.out.println(j2.hp);





    }
}
