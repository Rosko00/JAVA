/* V Jave sú dva hlavné znakové dátové typy: char a String */
public class znakove_datove_typy {
       public static void main(String[] args) {
        // Deklarácia a inicializácia char premennej
        char charValue = 'A'; // Jednoduchý znak, uzavretý v jednoduchých úvodzovkách
        System.out.println("Hodnota char: " + charValue);

        // Deklarácia a inicializácia String premennej
        String stringValue = "Ahoj, svet!"; // Reťazec znakov, uzavretý v dvojitých úvodzovkách
        System.out.println("Hodnota String: " + stringValue);

        // Operácie s char a String
        char nextChar = (char) (charValue + 1); // Inkrementácia char premennej
        System.out.println("Nasledujúci znak: " + nextChar);

        String greeting = "Ahoj";
        String target = "svet";
        String combinedString = greeting + ", " + target + "!"; // Konkatenácia reťazcov
        System.out.println("Spojený reťazec: " + combinedString);

        // Prístup k jednotlivým znakom v reťazci
        char firstChar = stringValue.charAt(0); // Prvý znak reťazca
        System.out.println("Prvý znak reťazca: " + firstChar);

        // Zistenie dĺžky reťazca
        int stringLength = stringValue.length(); // Dĺžka reťazca
        System.out.println("Dĺžka reťazca: " + stringLength);

        // Porovnanie reťazcov
        boolean areEqual = greeting.equals(target); // Porovnanie dvoch reťazcov
        System.out.println("Sú reťazce rovnaké? " + areEqual);
    } 
}
/* Deklarácia a inicializácia char a String premenných:
 * - char: Jednoduchý znak reprezentovaný v jednoduchých úvodzovkách, napríklad 'A'.
 * - String: Reťazec znakov reprezentovaný v dvojitých úvodzovkách, napríklad "Ahoj, svet!".
 */
/* Výpis hodnôt premenných na konzolu:
 * - Použitie System.out.println na výpis hodnôt premenných charValue a stringValue.
 */
/* Operácie s char a String:
 * - Inkrementácia char premennej: Príklad ukazuje, ako možno inkrementovať hodnotu char premennej pomocou aritmetických operácií.
 * - Konkatenácia reťazcov: Spojenie dvoch alebo viacerých reťazcov pomocou operátora +.
 * - Prístup k jednotlivým znakom v reťazci: Použitie metódy charAt() na získanie konkrétneho znaku v reťazci.
 * - Zistenie dĺžky reťazca: Použitie metódy length() na získanie počtu znakov v reťazci.
 * - Porovnanie reťazcov: Použitie metódy equals() na porovnanie dvoch reťazcov.
 */