package exercicios.fundamentos;

import javax.swing.*;

public class Exercicio_02 {
    public static void main(String[] args) {
        // Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
        var entrada = JOptionPane.showInputDialog("Digite quantos graus celsius: ").replace(",",".");
        double celsius = Double.parseDouble(entrada);
        double farenheit = celsius * (9/5) + 32;
        System.out.printf("%.1f F°", farenheit);

    }
}
