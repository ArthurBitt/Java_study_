package oop.pilares.Heranca;

public class Heroi extends Jogador{

    //Deixando pré setado que heroi inicia em 0,1
    public Heroi(){
        this(0,1); // chama construtor Heroi(int x, int y){super(x,y);} - altera ou sobreescreve o padrao
    }

    public Heroi(int x, int y){ // recebe parametros e preenche os valores de argumentos da super
         super(x, y);    // chama pelo construtor da classe genérica e passa paraemtros recebidos
    }

    // um método reescrito não pode fazer downgree de visibilidade, ou aumenta, ou mantém
    @Override
    public boolean atacar(Jogador atacado) {
        // aumenta o dano para 20 - duplica ataque
       boolean atacar1 = super.atacar(atacado);
       boolean atacar2 = super.atacar(atacado);
       return  atacar1 || atacar2;

    }
}
