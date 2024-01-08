package controle;

import javax.swing.*;

public class Controle_if_else {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Digite um número: ");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0 ){
            System.out.printf("%d é um número par", numero);

        }else{
            System.out.printf("%d é um número ímpar", numero);
        }
    }
}
