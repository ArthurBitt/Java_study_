package desafios;

import java.util.Scanner;

public class Desafio_08_while {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean quebra = true;
        int quantNotas = 0;
        var total = 0.0;
        while (quebra == true){

            System.out.println("Digite uma nota: ");
            double nota = entrada.nextDouble();

            if (nota<=10 && nota >=0){
                total+=nota;
                quantNotas ++;
            }else{
                System.out.println("Nota inválida");
            }


            System.out.println("Deseja sair ? S/N");
            String resposta = entrada.next().toUpperCase().replace("IM","");
            if (resposta.equalsIgnoreCase("s")){
                quebra = false;
            }else{
                quebra = true;
            }

        }
        System.out.println("Média: " + total/quantNotas);
        entrada.close();
    }
}
