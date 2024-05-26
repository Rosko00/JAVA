/* V Jave existujú dva dátové typy pre desatinné čísla: float a double */
public class datove_typy_desatinne_cisla {
        public static void main(String[] args) {
        // Deklarácia a inicializácia premenných rôznych desatinných dátových typov

        // float: 32-bitový desatinný dátový typ
        float floatValue = 3.1415927f; // Musí byť zakončené písmenom 'f' alebo 'F'
        System.out.println("Hodnota float: " + floatValue);

        // double: 64-bitový desatinný dátový typ
        double doubleValue = 3.141592653589793; // Predvolený typ pre desatinné čísla
        System.out.println("Hodnota double: " + doubleValue);

        // Operácie s desatinnými dátovými typmi
        float floatSum = floatValue + 1.2345678f;
        double doubleSum = doubleValue + 1.234567890123456;

        System.out.println("Súčet float: " + floatSum);
        System.out.println("Súčet double: " + doubleSum);

        // Porovnanie presnosti float a double
        float floatPrecision = 0.123456789f;
        double doublePrecision = 0.1234567890123456789;

        System.out.println("Presnosť float: " + floatPrecision);
        System.out.println("Presnosť double: " + doublePrecision);
    }
}
/* Deklarácia a inicializácia desatinných dátových typov:
 * - float: 32-bitový desatinný dátový typ. Hodnoty typu float musia byť zakončené písmenom f alebo F.
 * - double: 64-bitový desatinný dátový typ. Hodnoty typu double sú predvolené pre desatinné čísla a nemusia byť zakončené písmenom d alebo D.
 */

/* Výpis hodnôt premenných na konzolu:
 * - Použitie System.out.println na výpis hodnôt premenných floatValue a doubleValue.
 */

/* Operácie s desatinnými dátovými typmi:
 * - Príklad sčítania premenných typu float a double a výpis výsledných súčtov na konzolu.
 */

 /* Porovnanie presnosti float a double:
  * - Deklarácia premenných floatPrecision a doublePrecision na porovnanie presnosti oboch typov.
  * - Výpis presnosti premenných floatPrecision a doublePrecision na konzolu.
  */