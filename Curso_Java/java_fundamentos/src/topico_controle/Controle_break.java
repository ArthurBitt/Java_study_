package topico_controle;

public class Controle_break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i );
        }

        System.out.println("fim");
    }
}
