package topico_arrays;

public class Foreach {
    public static void main(String[] args) {
        // foreach é uma estrutura de controle, todavia, por ser utilizado no contexto de arrays, estou deixando
        // neste packge

        double arrayNotas[] = {9.9, 8.7, 7.2, 9.4};

        // LEITURA: para cada nota em arrayNotas
        for(double nota: arrayNotas) {
            System.out.print(nota + " ");
        }
        System.out.println();
        // for padrão
        for(int i = 0; i<arrayNotas.length; i++){
            System.out.print(arrayNotas[i] + " ");
        }
    }
}
