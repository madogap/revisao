
public class Cal {
    public static void main(String[] args) throws Exception {
        // char sexo = 'M';
        // boolean doa = true;
        String $texto = "Operadores Unarios (+)(-)(++)(--)(!) sao aplicados\n juntamente com outros operadores aritmeticos\n para realizarem alguns trabalhoscomo incrementar decrementar,\n inverter valores numericos  e boleanos";
        System.out.println($texto);
        int num = 5;
        num = num * (-1 + 1);
        System.out.println(num);
        // double n = 22.9;
        int _num1 = 90;
        int $numDois = 110;
        // double mutiploica = 2 * 9;
        // double s = 10.5 + 2.5;
        // int subtracao = 2 - 1;
        // int modulo = 18 % 3;
        // double result = (10 * 7) + (20 / 4);

        int _resultadoDeDoisNumeros = somarNum(_num1, $numDois);
        System.out.println(_resultadoDeDoisNumeros);

    }

    public static int somarNum(int _num1, int $numDois) throws Exception {
        return _num1 + $numDois;
    }

    public static float dividir(int dividendo, int divisor) throws Exception {
        // Logica aser aplicada
        return dividendo / divisor;
    }

    // Metodo void nao tem return
    public static void imprimir(String texto) {

    }

}
