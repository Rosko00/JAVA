import java.util.Scanner;
public class test {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vitajte v jednoduchej kalkulačke!");

        // Načítanie prvého čísla
        System.out.print("Zadajte prvé číslo: ");
        double cislo1 = scanner.nextDouble();

        // Načítanie operátora (+, -, *, /)
        System.out.print("Zadajte operátor (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Načítanie druhého čísla
        System.out.print("Zadajte druhé číslo: ");
        double cislo2 = scanner.nextDouble();

        double vysledok;

        // Výpočet podľa operátora
        switch (operator) {
            case '+':
                vysledok = cislo1 + cislo2;
                break;
            case '-':
                vysledok = cislo1 - cislo2;
                break;
            case '*':
                vysledok = cislo1 * cislo2;
                break;
            case '/':
                if (cislo2 != 0) {
                    vysledok = cislo1 / cislo2;
                } else {
                    System.out.println("Chyba: delenie nulou nie je povolené.");
                    return;
                }
                break;
            default:
                System.out.println("Neplatný operátor.");
                return;
        }

        // Výpis výsledku
        System.out.println("Výsledok: " + vysledok);

        scanner.close();
    }
}
