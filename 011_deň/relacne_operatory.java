public class relacne_operatory {
    public static void main(String[] args) {
        // Rovnosť (==)
        int a = 5;
        int b = 10;
        boolean result = (a == b); // result bude false
        System.out.println("Výsledok rovnosti je : " + result);

        // Nerovnosť (!=)
        int c = 5;
        int d = 10;
        boolean result_1 = (c != d); // result bude true
        System.out.println("Výsledok nerovnosti je : " + result_1);

        // Menší než (<)
        int e = 5;
        int f = 10;
        boolean result_3 = (e < f); // result bude true
        System.out.println("Výsledok nerovnosti je : " + result_3);

        // Väčší než (>)
        int g = 5;
        int h = 10;
        boolean result_4 = (g > h); // result bude false
        System.out.println("Výsledok nerovnosti je : " + result_4);

        // Menší alebo rovný (<=) a Väčší alebo rovný (>=)
        int i = 5;
        int j = 10;
        boolean result_5 = (i <= j); // result1 bude true
        boolean result_6 = (i >= j); // result2 bude false
        System.out.println("Výsledok nerovnosti je : " + result_5);
        System.out.println("Výsledok nerovnosti je : " + result_6);
    }
}
/* Tieto príklady demonštrujú základné použitie relačných operátorov v Jave. 
 * Kombinovaním týchto operátorov môžete vytvárať komplexnejšie 
 * logické výrazy podľa potrieb vášho programu.  
 */