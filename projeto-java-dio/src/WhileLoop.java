import java.util.concurrent.ThreadLocalRandom;

public class WhileLoop {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
                System.out.println("Doce do valor " + valorDoce);
                mesada = mesada - valorDoce;
            }
            System.out.println("Mesada " + mesada);
            System.out.println("Joaoa gastou toda a mesada");
        }


    }

    private static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
