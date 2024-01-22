package oop.pilares.Encapsulamento.modificadoresAcesso.CasaA;

public class Ana {

    private String privado = "visível, somente, na classe";
     String pacote = "visível, somente, entre classes do memso pacote";
    protected String protegido = "visível, entre classes do mesmo pacote e herança";
    public String publico = "visível por todos";
}
