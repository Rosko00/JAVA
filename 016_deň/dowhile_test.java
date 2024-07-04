import java.util.Scanner;
public class dowhile_test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choice;
        boolean isValidChoice;

        do {
            System.out.println("Zadajte voľbu (A, B, C):");
            choice = scanner.nextLine().toUpperCase();

            isValidChoice = choice.equals("A") || choice.equals("B") || choice.equals("C");

            if (!isValidChoice) {
                System.out.println("Neplatná voľba. Skúste znova.");
            }
        } while (!isValidChoice);

        System.out.println("Zadali ste platnú voľbu: " + choice);
    }
}

  
 