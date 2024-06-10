public class bitove_not {
    public static void main(String[] args) {
         // Predpokladajme, že máme 8-bitové celé číslo
        byte a = 0b00101101; // čo je 45 v desiatkovej sústave

        // Použitie operácie NOT
        byte notA = (byte) ~a;

        // Výstup v binárnej a desiatkovej sústave
        System.out.println("a (binárne): " + String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'));
        System.out.println("a (desiatkovo): " + a);
        System.out.println("~a (binárne): " + String.format("%8s", Integer.toBinaryString(notA & 0xFF)).replace(' ', '0'));
        System.out.println("~a (desiatkovo): " + notA);
    } 
}

/* byte a = 0b00101101; - a je 8-bitové celé číslo s hodnotou 45 v desiatkovej sústave a 00101101 v binárnej sústave.
 */

/* byte notA = (byte) ~a; - operácia NOT (~a) inverzuje všetky bity čísla a. Všetky bity 0 sa zmenia na 1 a všetky bity 1 sa zmenia na 0.
 * Pretože výsledok operácie NOT je typovo int, musíme ho pretypovať späť na byte.
 */

/* String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0') - tento kód formátuje výstup na 8-bitové binárne číslo. 
 * a & 0xFF zabezpečí, že pracujeme iba so spodnými 8 bitmi čísla a. String.format("%8s", ...) 
 * vypíše číslo ako 8-bitové binárne číslo a replace(' ', '0') zabezpečí, že medzery sú nahradené nulami.
 */

/* System.out.println - tieto príkazy vypisujú hodnoty a a ~a v binárnej a desiatkovej sústave.
 */