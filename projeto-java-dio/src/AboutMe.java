import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {

        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um nome: ");
        String nome = scanner.next();

         System.out.println("Digite um sobrenome: ");
        String sobrenome= scanner.next();

         System.out.println("Digite sua idade: ");
         int idade = scanner.nextInt();

         System.out.println("Digite sua altura: ");
         double altura = scanner.nextDouble();
      
        System.out.println("Ola me chamo" + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho a idade de: " + idade);
        System.out.println("MInha altura e " + altura + " metros");
        scanner.close();
        }catch(InputMismatchException e){
            System.err.println("Os campos idade e altura precisao ser numerios");
        }

    }
}
