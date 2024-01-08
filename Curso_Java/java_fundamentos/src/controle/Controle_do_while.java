package controle;
import java.util.Scanner;

public class Controle_do_while {
    public static void main(String[] args) {
        // if (...) sentença; ou {}
        // while (...) sentença; ou {}
        // for (..;..;..) sentaça; ou {}
        // do sentença; ou {} while (...); - único bloco de código que termina com sentença ;



       Scanner entrada = new Scanner(System.in);
       String texto ="";
       do {
           System.out.println("Qual é a palavra secreta? : ");
           texto = entrada.nextLine();
       } while (!texto.equalsIgnoreCase("Lobo"));

       entrada.close();
    }
}
