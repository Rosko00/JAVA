package 010_deň;

public class bitove_not {
    public static void main(String[] args) {
         // Predpokladajme, že máme 8-bitové celé číslo
        byte a = 0b00101101; // čo je 45 v desiatkovej sústave

        // Použitie operácie NOT
        byte notA = (byte) ~a;

        // Výstup v binárnej a desiatkovej sústave
        System.out.println("a (binárne): " + String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0'));
        System.out.println("a (desiatkovo): " + a);
        System.out.println("~a (binárne): " + String.format("%8s", Integer.toBinaryString(notA & 0xFF)).replace(' ', '0'));
        System.out.println("~a (desiatkovo): " + notA);
    }
    
}
