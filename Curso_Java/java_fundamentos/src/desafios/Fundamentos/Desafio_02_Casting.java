package desafios.Fundamentos;

import javax.swing.*;
import java.util.Scanner;

public class Desafio_02_Casting {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        /* System.out.println("Digite o salário");
        s1 = entrada.next().replace(",",".");
        entrada.close();
        */

        String s1 = JOptionPane.showInputDialog("Digite o antepenúltimo salário: ").replace(",",".");
        String s2 = JOptionPane.showInputDialog("Digite o penúltimo salário: ").replace(",",".");
        String s3 = JOptionPane.showInputDialog("Digite o último salário: ").replace(",",".");

        Double d1 = Double.parseDouble(s1);
        Double d2 = Double.parseDouble(s2);
        Double d3 = Double.parseDouble(s3);


        System.out.println("Média " + (d1 + d2 + d3)/3);
    }
}
