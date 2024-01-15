package org.tratamentoexcecoes;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("53070073");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Digite os oito digitos do cep sem ponto e nem traço");

        }
    }   
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length()!=8) throw new CepInvalidoException();
            return "53.070-070";
        
    }
}
