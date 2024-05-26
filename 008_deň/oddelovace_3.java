/* Použitie bodiek a zátvoriek */
public class oddelovace_3 {
       public static void main(String[] args) {
        // Vytvorenie objektu triedy String a použitie bodky na volanie metód
        String text = "Ahoj, svet!";
        int length = text.length(); // Použitie bodky na volanie metódy length()
        
        // Použitie zátvoriek na volanie metódy a prístup k prvku poľa
        char firstChar = text.charAt(0); // Použitie okrúhlych zátvoriek ()
        
        System.out.println("Text: " + text);
        System.out.println("Dĺžka textu: " + length);
        System.out.println("Prvý znak: " + firstChar);
    } 
}
/* Bodky ('.') sa používajú na prístup k členom objektov (atribútom a metódam), zaťiaľ čo okrúhle zátvorky ('()')
 * sa používajú na volanie metód a hranaté zátvorky ('[]') sa používajú na prístup k prvkom v poli.
 */