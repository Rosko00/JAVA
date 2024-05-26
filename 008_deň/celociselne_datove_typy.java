/* V Jave existujú štyri celočíselné dátové typy: byte, short, int, a long. */
public class celociselne_datove_typy {
    public static void main(String[] args) {
        // Deklarácia a inicializácia premenných rôznych celočíselných dátových typov

        // byte: 8-bitový celočíselný dátový typ
        byte byteValue = 127; // Rozsah: -128 až 127
        System.out.println("Hodnota byte: " + byteValue);

        // short: 16-bitový celočíselný dátový typ
        short shortValue = 32767; // Rozsah: -32,768 až 32,767
        System.out.println("Hodnota short: " + shortValue);

        // int: 32-bitový celočíselný dátový typ
        int intValue = 2147483647; // Rozsah: -2^31 až 2^31-1
        System.out.println("Hodnota int: " + intValue);

        // long: 64-bitový celočíselný dátový typ
        long longValue = 9223372036854775807L; // Rozsah: -2^63 až 2^63-1
        System.out.println("Hodnota long: " + longValue);

        // Operácie s celočíselnými dátovými typmi
        byteValue = (byte) (byteValue + 1); // Pretečenie pri prekročení rozsahu
        System.out.println("Hodnota byte po pretečení: " + byteValue);

        int sum = byteValue + shortValue + intValue;
        long total = sum + longValue;

        System.out.println("Súčet byte, short a int: " + sum);
        System.out.println("Celkový súčet vrátane long: " + total);
    }
}
/* Deklarácia a inicializácia celočíselných dátových typov:
 * - byte: 8-bitový dátový typ s rozsahom hodnôt od -128 do 127.
 * - short: 16-bitový dátový typ s rozsahom hodnôt od -32,768 do 32,767.
 * - int: 32-bitový dátový typ s rozsahom hodnôt od -2^31 do 2^31-1.
 * - long: 64-bitový dátový typ s rozsahom hodnôt od -2^63 do 2^63-1. Hodnoty typu long musia byť zakončené písmenom L.
 */

 /* Výpis hodnôt premenných na konzolu:
  * - Použitie System.out.println na výpis hodnôt premenných byteValue, shortValue, intValue, a longValue.
  */

  /* Operácie s celočíselnými dátovými typmi:
   * - Príklad pretečenia (overflow) premennej typu byte. Ak sa hodnota prekročí, začne sa od minimálnej hodnoty.
   * - Výpočet súčtu premenných typu byte, short, a int a ich výsledný súčet s premennou typu long
   */