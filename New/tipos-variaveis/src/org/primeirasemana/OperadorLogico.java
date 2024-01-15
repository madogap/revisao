package org.primeirasemana;

public class OperadorLogico {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = false;
        if (condicao1 && condicao2) {
            System.out.println("AS DUAS CONDICOES SAO VERDADEIRAS");
        }
        if (condicao1 || condicao2) {
            System.out.println("UMA DAS DUAS CONDICOES SAO VERDADEIRAS");
        }
        System.out.println("FIM");
        if (condicao1 && (7 > 5)) {
            System.out.println("AS DUAS CONDICOES SAO VERDADEIRAS");
        }
    }

}
