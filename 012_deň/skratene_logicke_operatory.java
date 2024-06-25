public class skratene_logicke_operatory {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Skrátený logický AND
        // Ak je 'a' false, 'b' sa nevyhodnocuje
        boolean resultAnd = a && b;
        System.out.println("a && b = " + resultAnd); // false

        // Skrátený logický OR
        // Ak je 'a' true, 'b' sa nevyhodnocuje
        boolean resultOr = a || b;
        System.out.println("a || b = " + resultOr); // true

        // Demonštrácia krátkeho vyhodnocovania
        boolean c = false;
        boolean d = true;

        // Skrátený logický AND - 'd' sa nevyhodnocuje, pretože 'c' je false
        boolean shortCircuitAnd = c && (d = false);
        System.out.println("c && (d = false) = " + shortCircuitAnd); // false
        System.out.println("d po skrátenom AND = " + d); // true

        // Skrátený logický OR - 'd' sa nevyhodnocuje, pretože 'c' je true
        boolean shortCircuitOr = c || (d = false);
        System.out.println("c || (d = false) = " + shortCircuitOr); // true
        System.out.println("d po skrátenom OR = " + d); // false

    }
}
/* Skrátený logický AND (&&): Vyhodnocuje druhý operand (b) len v prípade, 
 * že prvý operand (a) je true. Ak je a false, celý výraz je automaticky 
 * false bez ohľadu na hodnotu b. 
 */
/* Skrátený logický OR (||): Vyhodnocuje druhý operand (b) len v prípade, 
 * že prvý operand (a) je false. Ak je a true, celý výraz je automaticky 
 * true bez ohľadu na hodnotu b 
 */

