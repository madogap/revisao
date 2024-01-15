public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("21313123213asfdasdf");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("kisa20saaksp-1s");
        z400.ligar();

        Veiculo coringa = jeep;
        coringa.ligar();
    }
}