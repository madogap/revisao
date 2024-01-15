public class SistemaMedidas {
    public static void main(String[] args) {
        String sigla = "m";

        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "m":
                System.out.println("minino");
                break;
            case "M":
                System.out.println("Medio");
                break;
        
            default:
                System.out.println("Medida nao encotrada");
                break;
        }
    }
}
