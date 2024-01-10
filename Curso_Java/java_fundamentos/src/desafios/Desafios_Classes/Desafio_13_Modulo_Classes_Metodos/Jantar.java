package desafios.Desafios_Classes.Desafio_13_Modulo_Classes_Metodos;

import java.util.Scanner;

public class Jantar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Pessoa p = new Pessoa("Arthur", 74);

        boolean comendo = true;



        while (comendo){
            System.out.println("O que você está comendo?: ");
            String nomeComida = entrada.next();

            System.out.println("Qual a quantidade em Kg?: ");
            double pesoComida = entrada.nextDouble();

            Comida c = new Comida(nomeComida,pesoComida);

            System.out.println(c.nomeComida + "\n" + c.pesoComida + "Kg");
            // sout(comida.nome e comida.peso)

            // peso pessoa += peso comida
            p.pesoPessoa = p.calcPesoPessoa(pesoComida);
            // sout(seu peso atual é peso.pessoa)
            System.out.printf("Seu peso após comer é: %.2f ",p.pesoPessoa);

            System.out.println("Gostaria de comer algo mais?: S/N");
            //gostaria de continuar comendo s/n
            String resposta = entrada.next();

            if (resposta.equalsIgnoreCase("s")){
                // se s continue // não é preciso usar um continue aqui, o bloco encerrara e continua a próxima iteração
                System.out.println("Continuando o jantar...");
            }else{
                System.out.println("Encerrando o jantar...");
                comendo = false;
            }
            // se não comendo = false
        }

    }
}
