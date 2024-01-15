package org.tratamentoexcecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
            System.out.println("Digite sua altura");
            double height = scanner.nextDouble();

            System.out.println("Digite seu nome");
            String firstName = scanner.next();

            System.out.println("Digite seu sobrenome");
            String lastName = scanner.next();

            System.out.println("Digite sua idade");
            int age = scanner.nextInt();

            System.out.println("Ola, meu nome é: " + firstName + " " + lastName);
            System.out.println("Tenho " + age + " anos");
            System.out.println("Minha altura é " + height + " cm");
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada: Por favor, insira um valor válido.");
            System.err.println("Verifique se o campo de nome e sobrenome se sao letras e os campos de altura e idade sao numeros");
        }
    }
}
