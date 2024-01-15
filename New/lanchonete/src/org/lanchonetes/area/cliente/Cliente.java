package org.lanchonetes.area.cliente;

public class Cliente {
    
    public void escolherPedido() {
        number pedido = 1;
        System.out.println("ESCOLHENDO O PEDIDO");
         switch (pedido) {
            case 1:
                System.out.println("FAZENDO O PEDIDO ENROLADINHO");
                break;
            case 2:
                System.out.println("FAZENDO O PEDIDO HAMBURGUER");
                break;
            case 3:
                System.out.println("FAZENDO O PEDIDO SUCO");
                break;

            case 4:
                System.out.println("FAZENDO O PEDIDO DO PASTEL");
                break;

            case 5:
                System.out.println("FAZENDO O PEDIDO DA COXINHA");
                break;
        
            default:
                break;
        }
    }

    public void fazerPedido() {
        
        System.out.println("FAZENDO O PEDIDO");
       
    }

    public void pagarConta() {
        System.out.println("CONSULTADO O APLICATIVO PARA PAGAR CONTA");
    }

    private void consultandoSaldoAplicativo() {
        System.out.println("CONSULTANDO SALDO");
    }

}
