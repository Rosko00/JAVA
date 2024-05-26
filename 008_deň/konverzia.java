/* Existujú dva hlavné typy konverzie: implicitná (automatická) a explicitná (nútená alebo kasting). */
public class konverzia {
        public static void main(String[] args) {
        // Implicitná konverzia (rozširujúca konverzia)
        int intValue = 42;
        long longValue = intValue; // Automatická konverzia z int na long
        double doubleValue = longValue; // Automatická konverzia z long na double

        System.out.println("Int hodnota: " + intValue);
        System.out.println("Long hodnota: " + longValue);
        System.out.println("Double hodnota: " + doubleValue);

        // Explicitná konverzia (zužujúca konverzia)
        double originalDouble = 42.58;
        int narrowedInt = (int) originalDouble; // Nútená konverzia z double na int

        System.out.println("Pôvodná double hodnota: " + originalDouble);
        System.out.println("Zúžená int hodnota: " + narrowedInt);

        // String konverzia
        String stringValue = "123";
        int parsedInt = Integer.parseInt(stringValue); // Konverzia String na int
        double parsedDouble = Double.parseDouble(stringValue); // Konverzia String na double

        System.out.println("String hodnota: " + stringValue);
        System.out.println("Parsovaná int hodnota: " + parsedInt);
        System.out.println("Parsovaná double hodnota: " + parsedDouble);

        // Konverzia int na String
        int anotherInt = 456;
        String intToString = Integer.toString(anotherInt);

        System.out.println("Int hodnota: " + anotherInt);
        System.out.println("String hodnota: " + intToString);
    }
}
/* Implicitná konverzia:
 * - int intValue = 42; - Deklarácia a inicializácia premennej int.
 * - long longValue = intValue; - Automatická konverzia z int na long, pretože long má väčší rozsah než int.
 * - double doubleValue = longValue; - Automatická konverzia z long na double, pretože double má väčší rozsah než long.
 */
/* Explicitná konverzia (kasting):
 * - double originalDouble = 42.58; - Deklarácia a inicializácia premennej double.
 * - int narrowedInt = (int) originalDouble; - Nútená konverzia z double na int, kde sa desatinná časť odstráni.
 */
/* Konverzia String na primitívne typy:
 * - String stringValue = "123"; - Deklarácia a inicializácia premennej String.
 * - int parsedInt = Integer.parseInt(stringValue); - Konverzia String na int pomocou metódy parseInt.
 * - double parsedDouble = Double.parseDouble(stringValue); - Konverzia String na double pomocou metódy parseDouble.
 */
/* Konverzia int na String:
 * - int anotherInt = 456; - Deklarácia a inicializácia premennej int.
 * - String intToString = Integer.toString(anotherInt); - Konverzia int na String pomocou metódy toString.
 */