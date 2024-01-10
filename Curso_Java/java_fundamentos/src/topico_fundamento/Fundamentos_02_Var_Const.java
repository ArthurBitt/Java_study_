package topico_fundamento;

public class Fundamentos_02_Var_Const {
    public static void main(String[] args) {
        // tipo nome = valor
        double raio = 3.4;
        final double PI = 3.14; // final seta a variável como uma constante - constantes maiúsculas
        double area  = PI * raio * raio;
        // double pi = 2; descomente para ver o erro
        System.out.println(area);


        raio = 20.1;
        area  = PI * raio * raio;
        System.out.println("Área: " + area);

    }
}
