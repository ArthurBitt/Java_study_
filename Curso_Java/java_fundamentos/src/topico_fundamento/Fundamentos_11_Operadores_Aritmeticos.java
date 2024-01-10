package topico_fundamento;

public class Fundamentos_11_Operadores_Aritmeticos {
    public static void main(String[] args) {
        // Binários (infix) x operador y

        var x = 3.2;
        double c = 3.2;

        System.out.println(x + c);
        System.out.println(x - c);
        System.out.println(x * c);
        System.out.println(x / c);

        int a = 2;
        int b = 8;

        System.out.println(a/ (double) b ); // com double
        System.out.println(a/b); // sem o double
        System.out.println(a%b); // resto
        System.out.println(b%a); // resto


    }
}
