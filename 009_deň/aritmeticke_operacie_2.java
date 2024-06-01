/* Operátor modulo v Jave */
public class aritmeticke_operacie_2 {
    public static void main(String[] args) {
        
        // Zistenie párnosti a nepárnosti čásla
        int number = 7;
        int remainder = number % 2;
        if (remainder == 0) {
            System.out.println(number + " je párne číslo.");
        } 
        else {
            System.out.println(number + " je nepárne číslo.");
        }

        // Rozdelenie dvojciferného čísla na jeho zložky
        int number_1 = 57;
        int units = number_1 % 10; // získanie jednotiek
        int tens = number_1 / 10; // získanie desiatok
            System.out.println("Desiatky: " + tens + ", Jednotky: " + units);

        // Zistenie či je číslo deliteľné iným číslom
        int number_2 = 25;
        int divisor = 5;
        if (number_2 % divisor == 0) {
            System.out.println(number_2 + " je deliteľné číslom " + divisor + " bez zvyšku.");
        } 
        else {
            System.out.println(number_2 + " nie je deliteľné číslom " + divisor + " bez zvyšku.");
        }
    }
}
