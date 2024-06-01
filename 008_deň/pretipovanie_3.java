/* Pretypovanie medzi objektmi ('Object' na 'String'): */
public class pretipovanie_3 {
   public static void main(String[] args) {
    Object obj = "Toto je reťazec";
    String str = (String) obj; // pretypovanie z Object na String
    System.out.println("Hodnota str: " + str); // Výstup: Hodnota str: Toto je reťazec
   } 
}
/* Pretypovanie medzi objektmi (Object na String):
 * V tomto prípade musíme explicitne pretypovať objekt, pretože Java nedokáže automaticky určiť, 
 * že objekt je typu String. 
 */