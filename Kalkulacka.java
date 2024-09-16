import java.util.Scanner;

public class Kalkulacka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte prvé číslo: ");
        double cislo1 = scanner.nextDouble();

        System.out.print("Zadajte operátor (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Zadajte druhé číslo: ");
        double cislo2 = scanner.nextDouble();

        double vysledok = switch (operator) {
            case '+' -> cislo1 + cislo2;
            case '-' -> cislo1 - cislo2;
            case '*' -> cislo1 * cislo2;
            case '/' -> cislo2 != 0 ? cislo1 / cislo2 : Double.NaN;
            default -> Double.NaN;
        };

        if (Double.isNaN(vysledok)) {
            System.out.println("Chyba: Neplatný operátor alebo delenie nulou.");
        } else {
            System.out.println("Výsledok: " + vysledok);
        }

        scanner.close();
    }
}

