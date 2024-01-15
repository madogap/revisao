public class ForArray {
    public static void main(String[] args) {
        String alunos[] = { "Marcus", "Jonas", "Sasa", "Ana" };

        for (int i = 0; i < alunos.length; i++) {
            System.out.println(i + " Aluno " + " e " + alunos[i]);
        }

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                break;
            System.out.println(numero);

        }

    }
}
