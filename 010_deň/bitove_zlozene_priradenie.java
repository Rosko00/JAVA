public class bitove_zlozene_priradenie {
    public static void main(String[] args) {
        // Predpokladajme, že máme 8-bitové celé číslo
        byte a = 0b00101101; // čo je 45 v desiatkovej sústave

        // Použitie bitového zloženého operátora AND s priradením
        a &= 0b00001111; // a = a & 0b00001111
        System.out.println("a &= 0b00001111 (binárne): " + String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'));
        System.out.println("a &= 0b00001111 (desiatkovo): " + a);

        // Nastavenie hodnoty a späť na pôvodnú hodnotu
        a = 0b00101101;

        // Použitie bitového zloženého operátora OR s priradením
        a |= 0b00001111; // a = a | 0b00001111
        System.out.println("a |= 0b00001111 (binárne): " + String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'));
        System.out.println("a |= 0b00001111 (desiatkovo): " + a);

        // Nastavenie hodnoty a späť na pôvodnú hodnotu
        a = 0b00101101;

        // Použitie bitového zloženého operátora XOR s priradením
        a ^= 0b00001111; // a = a ^ 0b00001111
        System.out.println("a ^= 0b00001111 (binárne): " + String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'));
        System.out.println("a ^= 0b00001111 (desiatkovo): " + a);

        // Nastavenie hodnoty a späť na pôvodnú hodnotu
        a = 0b00101101;

        // Použitie bitového zloženého operátora posun doľava s priradením
        a <<= 2; // a = a << 2
        System.out.println("a <<= 2 (binárne): " + String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'));
        System.out.println("a <<= 2 (desiatkovo): " + a);

        // Nastavenie hodnoty a späť na pôvodnú hodnotu
        a = 0b00101101;

        // Použitie bitového zloženého operátora posun doprava s priradením
        a >>= 2; // a = a >> 2
        System.out.println("a >>= 2 (binárne): " + String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'));
        System.out.println("a >>= 2 (desiatkovo): " + a);
    }
}
/* byte a = 0b00101101; - a je 8-bitové celé číslo s hodnotou 45 v desiatkovej sústave a 00101101 v binárnej sústave.
 */
/* a &= 0b00001111; - operátor AND s priradením (&=) vykoná bitovú konjunkciu medzi a a 0b00001111 a priradí výsledok späť do a. 
 * Výsledok bude 00001101, čo je 13 v desiatkovej sústave. 
 */
/* a |= 0b00001111; - operátor OR s priradením (|=) vykoná bitovú disjunkciu medzi a a 0b00001111 a priradí výsledok späť do a. 
 * Výsledok bude 00101111, čo je 47 v desiatkovej sústave. 
 */
/* a ^= 0b00001111; - operátor XOR s priradením (^=) vykoná bitovú exkluzívnu disjunkciu medzi a a 0b00001111 a priradí výsledok späť do a. 
 * Výsledok bude 00100010, čo je 34 v desiatkovej sústave. 
 */
/* a <<= 2; - operátor posun doľava s priradením (<<=) posunie všetky bity čísla a o 2 pozície doľava a priradí výsledok späť do a. 
 * Výsledok bude 10110100, čo je 180 v desiatkovej sústave. 
 */
/* a >>= 2; - operátor posun doprava s priradením (>>=) posunie všetky bity čísla a o 2 pozície doprava a priradí výsledok späť do a. 
 * Výsledok bude 00001011, čo je 11 v desiatkovej sústave. 
 */
