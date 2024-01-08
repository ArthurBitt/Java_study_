package fundamento;

import java.util.Scanner;

public class Fundamentos_06_Tipo_String {
    public static void main(String[] args) {

        // igualdade com strings



        System.out.println("2" == "2"); // true
        String s1 = "2"; //
        System.out.println("2" == s1); // true
        Scanner sc = new Scanner(System.in);
        String s2 = sc.nextLine();
        System.out.println("2" == s2); // se a entrada tiver espaços, retornará false
        System.out.println("2".equals(s1.trim())); // sempre usar .equals para comparar as strings, o .trim() remove espaços em branco


        // string methods
        System.out.println("Hello World".charAt(6));
        System.out.println("Hello World".concat("!!"));
        System.out.println("Hello World" + "!!");
        System.out.println("Hello World".toUpperCase());
        System.out.println("Hello World".toLowerCase().startsWith("hello"));
        System.out.println("Hello World".toLowerCase().endsWith("hello"));
        System.out.println("Hello World".length());
        System.out.println("Hello World".equals("Hello Hello"));
        System.out.println("Hello World".equalsIgnoreCase("hello world"));
        System.out.println("Hello World".contains("Hello"));
        System.out.println("Hello World".indexOf("Hello"));
        System.out.println("Hello World".substring(2,7));

        var nome = "Arthur";
        var sobrenome = "Bittencourt";
        var idade = 26;
        var salario = 1500.00F;

        //printf
        System.out.printf("\nNome: %s %s \nIdade: %d \nSalário: R$ %.2f", nome, sobrenome, idade, salario );
        // String.format()
        String s = String.format("\nNome: %s %s \nIdade: %d \nSalário: R$ %.2f", nome, sobrenome, idade, salario );
        System.out.println(s);
    }
}
