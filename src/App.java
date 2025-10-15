public class App {
    public static void main(String[] args) throws Exception {
        
        String typeCake = "";
        String typeChoc = "";
        Boolean nata = false;
        Boolean name = false;
        String ans = "";
        float cakePrice = 0;
        float xtranata = 0;
        float xtrname = 0;

        System.out.print("De que sabor quieres la tarta(manzana, fresa o chocolate): ");
        typeCake = System.console().readLine();

        switch (typeCake.toLowerCase()) {
            case "manzana":
                cakePrice = 18.0f;
                break;
            case "fresa":
                cakePrice = 16.0f;
                break;
            case "chocolate":
                System.out.print("Que tipo de chocolate quieres en la tarta(negro o blanco): ");
                typeChoc = System.console().readLine();
                break;
            default:
                break;
        }

    }
}

