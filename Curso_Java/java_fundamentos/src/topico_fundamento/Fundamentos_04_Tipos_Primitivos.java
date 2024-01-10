package topico_fundamento;

public class Fundamentos_04_Tipos_Primitivos {
    public static void main(String[] args) {
        // informações funcionário

        // tipos numéricos inteiros do java
        byte anosEmpresa = 23;
        short numeroVoos = 543;
        int idFuncionario = 56798;
        long pontosAcumulados = 3_123_432_34567L; // tipo literal alternado para long com L

        // tipos numéricos reais
        float salario = 0.00F; // definido como literal float
        double vendasAcumuladas = 2_392_345_243.01;

        // tipo booleano
        boolean estaDeFerias = false;

        // tipo character
        char status = 'A'; // ativo


        // NOTAÇÃO PONTO
        // subtipo String
        String s = "Bom dia ?";
        System.out.println(s // operador .
                .replace("?","Arthur")
                .toUpperCase()
                .concat("!!!"));

        // OBS. Tipos primitivos não acessam métodos, não possuem operador .
    }

}
