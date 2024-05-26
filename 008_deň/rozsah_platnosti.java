/* Rozsah platnosti premenných */
public class rozsah_platnosti {
     // Globálna (triedna) premenná
    static int globalVariable = 10;

    public static void main(String[] args) {
        // Lokálna premenná metódy main
        int localVariableMain = 20;

        // Výpis hodnôt globálnej a lokálnej premennej na konzolu
        System.out.println("Globálna premenná: " + globalVariable);
        System.out.println("Lokálna premenná v main: " + localVariableMain);

        // Volanie metódy
        someMethod();

        // Blokový rozsah
        if (true) {
            // Premenná s blokovým rozsahom
            int blockScopedVariable = 30;
            System.out.println("Premenná s blokovým rozsahom: " + blockScopedVariable);
        }

        // Táto premenná nie je prístupná mimo bloku, kde bola deklarovaná
        // System.out.println(blockScopedVariable); // Chyba: Premenná nie je definovaná v tomto rozsahu
    }

    public static void someMethod() {
        // Lokálna premenná metódy someMethod
        int localVariableMethod = 40;

        // Výpis hodnôt globálnej a lokálnej premennej na konzolu
        System.out.println("Globálna premenná: " + globalVariable);
        System.out.println("Lokálna premenná v someMethod: " + localVariableMethod);

        // Lokálna premenná metódy someMethod má vyšší prioritu ako globálna premenná v tomto rozsahu
        int globalVariable = 50; // Tieňovanie (shadowing)
        System.out.println("Tieňovaná globálna premenná: " + globalVariable);
    }   
}
/* Globálna (triedna) premenná:
 * - static int globalVariable = 10; - Globálna premenná je deklarovaná na úrovni triedy a je prístupná vo všetkých metódach tejto triedy.
 */
/* Lokálna premenná v metóde main:
 * int localVariableMain = 20; - Lokálna premenná je deklarovaná v rámci metódy main a je prístupná iba v tejto metóde.
 */
/* Blokový rozsah:
 * - if (true) { int blockScopedVariable = 30; ... } - Premenná blockScopedVariable je deklarovaná v rámci bloku if a je prístupná iba v tomto bloku. Po opustení bloku už nie je premenná prístupná.
 */
/* Lokálna premenná v metóde someMethod:
 * - int localVariableMethod = 40; - Lokálna premenná je deklarovaná v rámci metódy someMethod a je prístupná iba v tejto metóde.
 */
/* Tieňovanie (shadowing):
 * - int globalVariable = 50; - Lokálna premenná v metóde someMethod s rovnakým názvom ako globálna premenná. V rámci tejto metódy má lokálna premenná prednosť, čím "tieňuje" globálnu premennú.
 */

 /* Zhrnutie:
  * - Globálny (triedny) rozsah: Premenné deklarované na úrovni triedy, prístupné vo všetkých metódach tejto triedy.
  * - Lokálny rozsah: Premenné deklarované v rámci metódy, prístupné iba v tejto metóde.
  * - Blokový rozsah: Premenné deklarované v rámci bloku (napr. if, for, while), prístupné iba v tomto bloku.
  * - Tieňovanie: Keď lokálna premenná má rovnaký názov ako globálna premenná, lokálna premenná "tieňuje" globálnu premennú v rámci svojho rozsahu.
  */