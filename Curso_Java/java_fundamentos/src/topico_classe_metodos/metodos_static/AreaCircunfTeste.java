package topico_classe_metodos.metodos_static;

public class AreaCircunfTeste {
    public static void main(String[] args) {
        AreaCircunf circ1 = new AreaCircunf(2);

        System.out.println(circ1.calcArea());

        System.out.println(AreaCircunf.CalcArea(2));
    }
}
