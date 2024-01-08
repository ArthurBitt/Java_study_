package fundamento;

import javax.swing.*;

public class Fundamentos_16_Operadores_Ternarios {
    public static void main(String[] args) {

        String media = JOptionPane.showInputDialog("Qual a média do aluno: ");
        // Double media = 4.0;
        Double media_num = Double.parseDouble(media);
        // ? simbolo do operador ternário, condição ? "true" : "false"
        String verifica = media_num <= 5 ? "Reprovado" : "Recuperação";
        String resultado = media_num >= 7.0 ? "Aprovado" : verifica;
        System.out.println("O aluno está: " +  resultado.toUpperCase());

    }
}
