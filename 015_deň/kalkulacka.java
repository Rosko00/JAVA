import java.util.Scanner;
public class kalkulacka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Načítanie dvoch čísel od používateľa
        System.out.println("Zadajte prvé číslo: ");
        double num1 = scanner.nextDouble();

        System.out.println("Zadajte druhé číslo: ");
        double num2 = scanner.nextDouble();

        // Načítanie operátora od používateľa
        System.out.println("Zadajte operátor (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        // Switch príkaz na základe operátora
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Výsledok: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Výsledok: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Výsledok: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Výsledok: " + result);
                } else {
                    System.out.println("Delenie nulou nie je povolené.");
                }
                break;
            default:
                System.out.println("Neplatný operátor.");
                break;
        }
        scanner.close();
    }
}
