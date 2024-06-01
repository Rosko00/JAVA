/* Zložené aritmetické operátory */
public class aritmeticke_operacie_3 {
    public static void main(String[] args) {

        // Inkremetácia (++);
        int number = 5;
        number++; // inkrementácia o 1
            System.out.println("Hodnota po inkrementácii je : " + number);

        // Zložený prírastok (+=);
        int total = 10;
        int increment = 5;
        total += increment; // total = total + increment
            System.out.println("Hodnota po zloženom príraste je : " + total);

        // Zložený delenie s priradením (/=)
        int number_3 = 20;
        int divisor = 4;
        number_3 /= divisor; // number = number / divisor
            System.out.println("Hodnota po zloženom delení je : " + number_3);
    }
}
