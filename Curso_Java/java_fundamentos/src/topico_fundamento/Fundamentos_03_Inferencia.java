package topico_fundamento;

public class Fundamentos_03_Inferencia {
    public static void main(String[] args) {
        double a;  // !variavel declarada
        a = 4.5; // !variavel incializada

        // a = 5 - funciona conversão 5.0
        // a =  "texto" - erro de inferência


        // utilizando var a variável deve ser incializada e declarada na mesma linha
        var b = 5.2; // var incorre uma inferência de acordo com o tipo do valor atribuido
        // b = "texto" - erro de inferência do tipo

        var c = "string";
        // c = 4 - erro de inferência do tipo
    }
}
