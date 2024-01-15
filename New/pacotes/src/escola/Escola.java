package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Marcus");
        aluno.setIdade(35);
        System.out.println("O aluno " + aluno.getNome() + " tem a idade de " + aluno.getIdade()+ " anos");
    }

}
