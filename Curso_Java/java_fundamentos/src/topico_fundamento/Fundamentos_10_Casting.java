package topico_fundamento;

import javax.swing.*;

public class Fundamentos_10_Casting {
    public static void main(String[] args) {
        double a = 1; // implícito
        System.out.println(a);

        float b = (float) 1.12345678; // não printa todo o valor
        double bb = 1.12345678; // cabe todo o valor em double
        System.out.println(b);
        System.out.println(bb);

        int c = 340; // um inteiro
        byte d = (byte) c; // casting para byte joga em um range de -128 até 127

        System.out.println(c);
        System.out.println(d);


        double e = 1.999; // double traz todas as casas decimais
        int f = (int) e; // int perde as casas decimais - perde informação

        System.out.println(e);
        System.out.println(f);


    // CASTING NÚMERO PARA STRING

        Integer i = 10000;
        // usando classe integer
        System.out.println(i.toString());

        int ii = 10000;
        // usando o tipo primitvo int
        System.out.println(Integer.toString(ii));
        // concatenando
        System.out.println(("" + ii).length());

    // CASTING STRING PARA NÚMERO

        String num1 = JOptionPane.showInputDialog("Digite um número:");
        String num2 = JOptionPane.showInputDialog("Digite um número:");

        // Classe Double chamando método parse
        double d1 = Double.parseDouble(num1);
        double d2 = Double.parseDouble(num2);

        System.out.println(d1 + d2);
        System.out.println((d1 + d2)/2);


    }


}
