public class App {
    public static void main(String[] args) throws Exception {
        final int FI = 23000000;
        System.out.println(FI);
        int _ano = 20021;
        int $somaAno = _ano + _ano;

        boolean verdadeira = true;
        boolean contraVerdade = !verdadeira;
        System.out.println(contraVerdade);

        System.out.println(_ano);

        System.out.println($somaAno);
        String $namePrimeiro = "Marcus";
        String segundoName = "Mado Gap";
        String nameCompleto = nomeCompleto($namePrimeiro, segundoName);
        System.out.println(nameCompleto);
    }

    public static String nomeCompleto(String $namePrimeiro, String segundoName) {
        return "Resultado da \nconcatenacao de \nstrings em Java\n" + $namePrimeiro.concat(" ").concat(segundoName);
    };
}
