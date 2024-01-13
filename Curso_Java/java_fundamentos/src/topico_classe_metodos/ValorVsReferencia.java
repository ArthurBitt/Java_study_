package topico_classe_metodos;
import desafios.Classes.Desafio_10_Classe_Data.Desafio_10_Classes_Data;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a =2;
        double b = a; // atribução por valor - tipo primitivo

        a++;
        b--;

        System.out.println( a + " " + b);


        Desafio_10_Classes_Data dt = new Desafio_10_Classes_Data(1,6,2024);
        Desafio_10_Classes_Data dt_referencia = dt; // atribuição por referência de atributo - membro de classe
        System.out.println("dt: " + dt + " \ndt_referencia: " + dt_referencia);
        System.out.printf("Mesma posição na memória: %b" ,dt == dt_referencia);

    }
}
