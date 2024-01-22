package oop.pilares.Encapsulamento.modificadoresAcesso.CasaB;

import oop.pilares.Encapsulamento.modificadoresAcesso.CasaA.Ana;

public class Julia {
        // Não herde de Ana e não esta no mesmo pacote
    void testeAcesso() {
        Ana mae = new Ana();
        //ERROSystem.out.println(esposa.privado);// privado apenas dentro da classe
        //ERROSystem.out.println(pacote);// default classes do memso pacote
        //ERROSystem.out.println(super.protegido);// pacote default + herança
        System.out.println(mae.publico);// todas as classes do sistema
    }
}
