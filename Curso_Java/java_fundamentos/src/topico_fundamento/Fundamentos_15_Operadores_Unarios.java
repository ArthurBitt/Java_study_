package topico_fundamento;

public class Fundamentos_15_Operadores_Unarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        ++b;
        System.out.println(b);
        --b;
        System.out.println(b);

        a++;
        System.out.println(a);
        a--;
        System.out.println(a);

        System.out.println(++a   == b--);// !precedência ++a > a--. ele incrementa e compara antes de decrementar b

        System.out.println(++a == b);
    }
}
