package oop.pilares.Heranca;

public class MainJogo {
    public static void main(String[] args) {

        // Instância de subclasses da classe genérica Jogador
        Monstro j1 = new Monstro(); // vem por padrao 0,0
        Heroi j2 = new Heroi();// vem por padrao com 0,1

//        Jogador j1 = new Jogador();
//        Jogador j2 = new Jogador();


//        j2.andar(Direcao.NORTE);

        System.out.println(j1.hp);
        j2.atacar(j1);
        j2.atacar(j1);
        System.out.println(j1.hp);





    }
}
