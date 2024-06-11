public class bitove_or {
    public static void main(String[] args) {
        // Predpokladajme, že máme dve 8-bitové celé čísla
        byte a = 0b00101101; // čo je 45 v desiatkovej sústave
        byte b = 0b00001111; // čo je 15 v desiatkovej sústave

        // Použitie operácie OR
        byte result = (byte) (a | b);

        // Výstup v binárnej a desiatkovej sústave
        System.out.println("a (binárne): " + String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'));
        System.out.println("a (desiatkovo): " + a);
        System.out.println("b (binárne): " + String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'));
        System.out.println("b (desiatkovo): " + b);
        System.out.println("a | b (binárne): " + String.format("%8s", Integer.toBinaryString(result & 0xFF)).replace(' ', '0'));
        System.out.println("a | b (desiatkovo): " + result);
    }
    
}
/* byte a = 0b00101101; - a je 8-bitové celé číslo s hodnotou 45 v desiatkovej sústave a 00101101 v binárnej sústave.
 */
/* byte b = 0b00001111; - b je 8-bitové celé číslo s hodnotou 15 v desiatkovej sústave a 00001111 v binárnej sústave.
 */
/* byte result = (byte) (a | b); - operácia OR (a | b) vykoná bitovú disjunkciu medzi číslami a a b. To znamená, 
 * že každý bit výsledku bude 1, ak aspoň jeden z príslušných bitov v a alebo b je rovný 1, inak bude bit výsledku 0. 
 */
/* String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0') 
 * - tento kód formátuje výstup na 8-bitové binárne číslo. a & 0xFF zabezpečí, že pracujeme iba so spodnými 8 bitmi čísla a. 
 * String.format("%8s", ...) vypíše číslo ako 8-bitové binárne číslo a replace(' ', '0') zabezpečí, že medzery sú nahradené nulami. 
 */
/* System.out.println - tieto príkazy vypisujú hodnoty a, b a výsledok operácie a | b v binárnej a desiatkovej sústave.
 */