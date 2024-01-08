package exercicios.fundamentos;

import javax.swing.*;

public class Exercicio_01 {
    //Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius. (32 °F − 32) × 5/9 = 0 °C

    public static void main(String[] args) {
        var entrada = JOptionPane.showInputDialog("Digite quantos graus farenheit: ").replace(",",".");
        double farenheit = Double.parseDouble(entrada);
        double celsius = (farenheit - 32) / 1.8;
        System.out.printf("%.1f C°", celsius);
    }
}
