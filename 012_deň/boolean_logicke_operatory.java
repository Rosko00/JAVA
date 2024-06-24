public class boolean_logicke_operatory {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logický AND
        boolean resultAnd = a && b;
        System.out.println("a && b = " + resultAnd); // false

        // Logický OR
        boolean resultOr = a || b;
        System.out.println("a || b = " + resultOr); // true

        // Logický NOT
        boolean resultNot = !a;
        System.out.println("!a = " + resultNot); // false

        // Bitový AND
        boolean resultBitwiseAnd = a & b;
        System.out.println("a & b = " + resultBitwiseAnd); // false

        // Bitový OR
        boolean resultBitwiseOr = a | b;
        System.out.println("a | b = " + resultBitwiseOr); // true

        // Bitový XOR
        boolean resultBitwiseXor = a ^ b;
        System.out.println("a ^ b = " + resultBitwiseXor); // true
    }
} 