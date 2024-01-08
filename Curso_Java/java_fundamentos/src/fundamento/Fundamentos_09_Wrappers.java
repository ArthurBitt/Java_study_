package fundamento;

public class Fundamentos_09_Wrappers {
    public static void main(String[] args) {
        Byte b = 1;
        Short s = 10;
        Integer i = 100;
        Long l = 1000L; // literal é int - classe long define como long, é preciso declarar como long o literal para não haver perda de informação

        // entrada = Integer.parseInt(entrada.next)
        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l/3);

        Boolean bool = Boolean.parseBoolean("true");
        System.out.println(bool);
        System.out.println(bool.toString().toUpperCase());
        System.out.println(("" + bool).toUpperCase());

        Character c = '*';
        System.out.println(c);

        Float f = 123.0f;
        System.out.println(f);

        Double d = 12.0;

    }
}
