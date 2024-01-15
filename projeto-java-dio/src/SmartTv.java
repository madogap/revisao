/**
 * SmartTv
 */
public class SmartTv {

    boolean ligada = true;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;

    }

    public void aumetarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume aumento " + volume);

    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume diminuiu " + volume);
    }

}