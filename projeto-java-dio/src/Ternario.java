public class Ternario {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 10;
        String resultado = "";
        if (a == b)
            resultado = "True";
        else
            resultado = "false";
        System.out.println(resultado);

        String results = a == b ? "True" : "false";
        System.out.println(results);

    }
}
