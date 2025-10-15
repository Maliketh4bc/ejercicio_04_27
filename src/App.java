public class App {
    public static void main(String[] args) throws Exception {
        
        String typeCake = "";
        String typeChoc = "";
        Boolean nata = false;
        Boolean name = false;
        String ans = "";
        float cakePrice = 0;
        float xtranata = 2.50f;
        float xtrname = 2.75f;
        float total = 0f;

        //seleccionar tarta
        System.out.print("De que sabor quieres la tarta(manzana, fresa o chocolate): ");
        typeCake = System.console().readLine();

        switch (typeCake.toLowerCase()) {
            case "manzana":
                cakePrice = 18.0f;
                total = cakePrice;
                break;
            case "fresa":
                cakePrice = 16.0f;
                total = cakePrice;
                break;
            case "chocolate":
                System.out.print("Que tipo de chocolate quieres en la tarta(negro o blanco): ");
                typeChoc = System.console().readLine();
                if(typeChoc.toLowerCase().equals("negro")){
                    cakePrice = 14.0f;
                    total = cakePrice;
                }else{
                    cakePrice = 15.0f;
                    total = cakePrice;
                }
                break;
            default:
                break;
        }

        //seleccionar extra de nata
        System.out.print("¿Quieres nata? (si o no): ");
        ans = System.console().readLine();
        if(ans.toLowerCase().equals("si")){
            nata = true;
            total = total + xtranata;
        }

        //seleccionar extra de nombre
        System.out.print("¿Quieres un nombre personalizado? (si o no): ");
        ans = System.console().readLine();
        if(ans.toLowerCase().equals("si")){
            name = true;
            total = total + xtrname;
        }

        //salida final
        System.out.printf("""
                
        Tarta de %s: %.2f

        """, typeCake);
    }
}

