package desafios.Fundamentos;

public class Desafio_04_Operadores_Logicos {
    public static void main(String[] args) {
    boolean trab1 = false;
    boolean trab2 = false;


    boolean comprouTv50 = trab1 && trab2;
    boolean comprouTv32 = trab1 ^ trab2;
    boolean comprouSorvete = trab2 || trab1;
    boolean maisSaudavel = !comprouSorvete;


    System.out.println("Comprou TV 50 pol \"" + comprouTv50);
    System.out.println("Comprou TV 32 pol \"" + comprouTv32);
    System.out.println("Comprou sorvete \"" + comprouSorvete);
    System.out.println("Mais saudável \"" + maisSaudavel);
    }
}
