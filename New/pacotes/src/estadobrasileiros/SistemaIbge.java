package estadobrasileiros;

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla()+ "-" + e.getNome());
        }
        EstadoBrasileiro eb = EstadoBrasileiro.PERNAMBUCO;
        System.out.println(eb);
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaisculo());
        System.out.println("O númermo do Estado de " + eb.getNome() + " de acordo com o IBGE é " +eb.getIbge());
        System.out.println(eb.getSiglaMinusculo());
    }
}
