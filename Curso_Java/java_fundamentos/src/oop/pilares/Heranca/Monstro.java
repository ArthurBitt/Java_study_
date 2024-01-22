package oop.pilares.Heranca;

public class Monstro extends Jogador{

    public Monstro(){ // chama pelo construtor padrão(o que nao tiver parâmtros) da classe jogador;
        super();
    }
    @Override
    public boolean atacar(Jogador atacado) {
        boolean atacar = super.atacar(atacado);
        return atacar;
    }
}
