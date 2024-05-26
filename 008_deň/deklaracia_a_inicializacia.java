/* Deklarácia a inicializácia premenných */
public class deklaracia_a_inicializacia {
        public static void main(String[] args) {
        // Deklarácia primitívnych typov
        int age; // Deklarácia int premennej bez inicializácie
        age = 42; // Inicializácia premennej age

        float height = 1.78f; // Deklarácia a inicializácia float premennej
        char initial = 'M'; // Deklarácia a inicializácia char premennej
        boolean isStudent = true; // Deklarácia a inicializácia boolean premennej

        // Deklarácia referenčných typov (objektov)
        String name = "Marián Gálik"; // Deklarácia a inicializácia String objektu

        // Výpis hodnôt premenných na konzolu
        System.out.println("Vek: " + age);
        System.out.println("Výška: " + height + "m");
        System.out.println("Iniciála: " + initial);
        System.out.println("Som programátor: " + isStudent);
        System.out.println("Meno: " + name);

        // Príklad deklarácie a inicializácie poľa
        int[] numbers = {1, 2, 3, 4, 5}; // Deklarácia a inicializácia poľa int

        // Výpis hodnôt poľa na konzolu
        System.out.print("Pole čísel: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
/* Deklarácia primitívnych typov:
 * - int age; - Deklarácia premennej typu int s názvom age bez inicializácie.
 * - age = 25; - Inicializácia premennej age hodnotou 25.
 * - float height = 1.75f; - Deklarácia a inicializácia premennej typu float s hodnotou 1.75. Hodnoty typu float musia byť zakončené písmenom f.
 * - char initial = 'J'; - Deklarácia a inicializácia premennej typu char s hodnotou 'J'.
 * - boolean isStudent = true; - Deklarácia a inicializácia premennej typu boolean s hodnotou true.
 */
/* Deklarácia referenčných typov:
 * - String name = "John Doe"; - Deklarácia a inicializácia premennej typu String s hodnotou "John Doe". String je trieda v Jave používaná na reprezentáciu reťazcov znakov.
 */
/* Výpis hodnôt premenných na konzolu:
 * - Použitie System.out.println na výpis hodnôt jednotlivých premenných.
 */
/* Deklarácia a inicializácia poľa:
 * - int[] numbers = {1, 2, 3, 4, 5}; - Deklarácia a inicializácia poľa typu int s hodnotami {1, 2, 3, 4, 5}.
 * - Použitie cyklu for na výpis hodnôt poľa na konzolu.
 */