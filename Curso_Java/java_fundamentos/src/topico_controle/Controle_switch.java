package topico_controle;

import java.util.Scanner;

public class Controle_switch {
    public static void main(String[] args) {
        // switch com break

        Scanner entrada = new Scanner(System.in);
        String conceito = new String("");

        System.out.println("Digite uma nota: ");
        int nota =  entrada.nextInt();

        switch (nota){
            case 10: case 9:
                conceito = "A";
                break;
            case 7: case 6:
                conceito = "B";
                break;
            case 5: case 4:
                conceito = "C";
                break;

            case 3: case 2:
                conceito = "D";
                break;
            case 1: case 0:
                conceito = "E";
                break;
            default:
                System.out.println("Conceito não informado");
        }

        System.out.println("Conceita: " + conceito);


        // switch sem break - acumulativo
        // roxa - contém verde e laranja
        // preta - contém todas
        String faixa = "preta";

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Faixa Preta");
            case "marrom":
                System.out.println("Faixa Marrom");

            case "roxa":
                System.out.println("Faixa Roxa");

            case "verde":
                System.out.println("Faixa Verde");

            case "Laranja":
                System.out.println("Faixa Laranja");
                break;

            default:
                System.out.println("Faixa Branca");
                break;
        }
    }
}
