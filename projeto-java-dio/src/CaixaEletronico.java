public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 20;
        double valorSolicitado = 12;

        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        System.out.println(saldo);

    }

}
