package escola;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa(String cpf, String nome ){
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
  
    public void setEndereco(String newEndereco) {
        this.endereco = newEndereco;
    }
}
