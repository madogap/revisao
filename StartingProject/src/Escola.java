
public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Mado");
        aluno.setIdade(35);
        aluno.setSexo("Masculino");
        aluno.setCpf("32222222222");

        System.out.println(
                " O aluno " + aluno.getNome() + " Tem " + aluno.getIdade() + " E seu sexo é " + aluno.getSexo());
        System.out.println("O CPF É" + aluno.getCpf());
    }
}
