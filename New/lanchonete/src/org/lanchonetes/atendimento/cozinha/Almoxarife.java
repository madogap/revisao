package org.lanchonetes.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada() {
        System.out.println("CONTROLAR A ENTRADA DE ITENS");
    }

    private void controlarSaida() {
        System.out.println("CONTROLANDO SAIDA DOS ITENS");
    }

    // Default
    void entregarIngredientes() {
        System.out.println("ENTREGANDO INGREDIENTES AO SETOR DE COZINHA");
        // algoritmo para controlar entrada e saida
        controlarSaida();
    }

    void trocarGas() {
        System.out.println("TROCANDO O GAZ DO SETOR DE COZINHA");
    }

}
