
public class Fluxo {
    // calcular divia expoeial varaivel de clase
    static double valorParcela = 50.0;
    static double valorMontante = 0.0;


    public static double main(String[] args) {

        for (int x = 1; x <= 7; x++) {
            // Variavel de escl;l
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }
        // escopo de flixo
        return valorMontante;
    }

}
