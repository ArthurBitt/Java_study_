package desafios;

public class Desafio_03_Operadores {
    public static void main(String[] args) {

        double first_block = Math.pow(6 * (3+2),2) /(3*2);
        double second_block = Math.pow((1-5)*(2-7)/(2),2);
        double cube_of_first_minus_second = Math.pow((first_block - second_block),3);
        double third_block = Math.pow(10,3);
        System.out.println(cube_of_first_minus_second/third_block);
    }
}
