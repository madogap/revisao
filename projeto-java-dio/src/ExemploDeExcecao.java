import java.text.ParseException;
import java.text.NumberFormat;
public class ExemploDeExcecao {
    public static void main(String[] args) {
        // Number valor = Double.valueOf("a1.75");
        // NumberFormatException
        //Number valor;
        try{
        Number valor = NumberFormat.getInstance().parse("a1.75");
        System.out.println(valor);

        }catch(ParseException e){
            e.printStackTrace();
        }

    }
}
