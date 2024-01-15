package org.primeirasemana.primeiroprojeto;

public class Usuario {
    public static void main(String[] args) {

        Smart smart = new Smart();

        System.out.println(smart.ligada);
        System.out.println(smart.canal);
        System.out.println(smart.volume);

        smart.ligar();
        System.out.println(smart.ligada);
        smart.desligar();
        System.out.println(smart.ligada);

        smart.mudarCanal(13);
        System.out.println(smart.canal);
        smart.aumentarCanal();
        System.out.println(smart.canal);
        smart.dimunirCanal();
        System.out.println(smart.canal);
    }
    
}
