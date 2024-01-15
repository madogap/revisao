package org.lanchonetes.atendimento;

public class Atendente {
    public void servindoMesa() {
        System.out.println("SERVINDO MESA");
        pegarLancheCozinha();
    }

    private void pegarLancheCozinha() {
        System.out.println("PEGANDO O LANCHE NA COZINHA");
    }

    private void pegarPedidoBalcao() {
        System.out.println("PEGANDO PEDIDO NO BALCAO");
    }

    void trocarGas() {
        System.out.println("ATENDENTE TROCANDO GAS");
    }

    public void receberPagamento() {
        System.out.println("RECEBENDO PAGAMENTO DO CLIENTE");
    }

}
