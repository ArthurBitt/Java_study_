package topico_arrays;


// !array é uma estrutura estática, homogênea, linear e indexada. É preciso definir seu tamanho na instância
public class Array {
    public static void main(String[] args) {

        double arrayDouble[] = {0,1,2,3,4,5}; // passando diretamente os valores
        final double valor = 1;
        // tipo nome = objeto tipo[tamanho]
        int[] arrayInt = new int[6];
        // 0 1 2 3 4 5

        // passando uma variavel de mesmo tipo para um array
        arrayDouble[0] = valor;

        arrayInt[2] = 1; // atribuição indexada
        // arrayInt[6] = 2; - não existe index 6, começa do 0 - ERRO OUT OF BOUNDS -

        System.out.println(arrayInt[2]);
        System.out.println(arrayInt.length - 1);// puxa o último elemento
        System.out.println(arrayDouble[0]);

        /*  double[][][] arrayDouble = new double[1][1][1]; // array tridimensional
        arrayDouble[0][0][0] = 2;
        System.out.println(arrayDouble[0][0][0]); */


    }
}
