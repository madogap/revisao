package escola;

public class SistemaCadastro {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("12322229","Marcus");

        pessoa.setEndereco("Rua das Papoulas");

        System.out.println( pessoa.getNome()+ " - " + "seu cpf é: " +pessoa.getCpf());

    }

}
