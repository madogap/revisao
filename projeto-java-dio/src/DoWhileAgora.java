import java.util.Random;

public class DoWhileAgora {
    public static void main(String[] args) {
        System.out.println("Discando....");
        System.out.println("----------------");


        do {
            System.out.println("Telefone tocando");
        } while (tocando());
        System.out.println("----------------");
        System.out.println("Alo");

    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("----------------");
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;
    }
}
