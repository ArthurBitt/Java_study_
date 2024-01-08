package fundamento;

public class Fundamentos_14_Operadores_Atribuicao {
    public static void main(String[] args) {
        int a = 1; // atribuição =
        int b = 1;
        var c = a + b;

        System.out.println(c);

        c = a + c;
        System.out.println(c);

        c = c + a;// c recebe valor de c + valor de a
        System.out.println(c);
        c -= a;// c recebe valor de c - valor de a
        System.out.println(c);
        c *= a;// c recebe valor de c * valor de a
        System.out.println(c);
        c /= a;// c recebe valor de c / valor de a
        System.out.println(c);
        c%=a;
        System.out.println(c);
    }
}
