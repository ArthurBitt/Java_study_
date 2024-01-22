package oop.pilares.Encapsulamento.modificadoresAcesso.CasaA;

public class Paulo {
    // Está no mesmo pacote de Ana
//    privado
//    pacote
//    protegido
//    publico
    void testeAcesso(){
        Ana esposa = new Ana();
        //ERROSystem.out.println(esposa.privado);// privado apenas dentro da classe
        System.out.println(esposa.pacote);// default classes do memso pacote
        System.out.println(esposa.protegido);// pacote default + herança
        System.out.println(esposa.publico);// todas as classes do sistema
    }
}

