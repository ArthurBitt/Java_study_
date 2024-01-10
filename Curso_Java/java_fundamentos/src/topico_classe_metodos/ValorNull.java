package topico_classe_metodos;

public class ValorNull {
    public static void main(String[] args) {
        // String vazia
        String s1 = "";
        System.out.println(s1.concat("!!!"));

        // String não declarada
        String s2;
        //System.out.println(s2.concat("!!!")); - erro de compilação

        // String nula
        String s3 = null;
        //System.out.println(s3.concat("!!!")); - erro de execução - valor null em objeto não acessa método
    }

}
