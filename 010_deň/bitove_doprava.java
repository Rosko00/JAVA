public class bitove_doprava {
    public static void main(String[] args) {
        // Predpokladajme, že máme 8-bitové celé číslo
        byte a = 0b00101101; // čo je 45 v desiatkovej sústave

        // Použitie operácie posun doprava o 2 bity
        byte result = (byte) (a >> 2);

        // Výstup v binárnej a desiatkovej sústave
        System.out.println("a (binárne): " + String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'));
        System.out.println("a (desiatkovo): " + a);
        System.out.println("a >> 2 (binárne): " + String.format("%8s", Integer.toBinaryString(result & 0xFF)).replace(' ', '0'));
        System.out.println("a >> 2 (desiatkovo): " + result);
    }
}
/* byte a = 0b00101101; - a je 8-bitové celé číslo s hodnotou 45 v desiatkovej sústave a 00101101 v binárnej sústave.
 */
/* byte result = (byte) (a >> 2); - operácia posun doprava (a >> 2) posunie všetky bity čísla a o 2 pozície doprava.
 * Výsledné číslo bude menšie (každý posun doprava delí hodnotu čísla dvoma). Pretože výsledok operácie je typu int, 
 * musíme ho pretypovať späť na byte. 
 */
/* String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0') 
 * - tento kód formátuje výstup na 8-bitové binárne číslo. a & 0xFF zabezpečí, 
 * že pracujeme iba so spodnými 8 bitmi čísla a. String.format("%8s", ...) 
 * vypíše číslo ako 8-bitové binárne číslo a replace(' ', '0') zabezpečí, že medzery sú nahradené nulami. 
 */
/* System.out.println - tieto príkazy vypisujú hodnoty a a výsledok operácie a >> 2 v binárnej a desiatkovej sústave. 
 */