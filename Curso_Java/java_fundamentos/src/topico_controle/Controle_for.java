package topico_controle;

public class Controle_for {
    public static void main(String[] args) {
//        // estrutura com quantidade de loops determinadas
//        for (int i = 0; i <=10; i++){
//            System.out.println(i);
//        }
//        // passando apenas um dos argumentos
//        int x = 0;
//        for (; x<=10;){
//            System.out.println(x);
//            x++;
//        }
//        // loop infinito
//        for (;true;){
//            System.out.println(".infinito");
//        }
        // for aninhado

        for (int i = 0; i<10; i++){
            for(int j = 0; j<10;j++){
                System.out.printf("[%d %d]", i,j);
            }
            System.out.println('\n');
        }
    }
}
