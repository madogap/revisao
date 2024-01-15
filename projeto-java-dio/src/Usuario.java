public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("TV qual canal? " + smartTv.canal);

        smartTv.mudarCanal(20);
        System.out.println("TV qual canal? " + smartTv.canal);
        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

    }

}
