import java.time.LocalDate;
import java.util.Scanner;
public class vek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Získanie dátumu narodenia od používateľa
        System.out.println("Zadajte dátum narodenia vo formáte RRRR-MM-DD:");
        String dobString = scanner.nextLine();
        LocalDate dob = LocalDate.parse(dobString);

        // Vypočítanie veku z dátumu narodenia
        LocalDate today = LocalDate.now();
        int age = today.getYear() - dob.getYear();

        // Overenie, či používateľ dosiahol 18 rokov
        if (age >= 18) {
            System.out.println("Vitajte! Ste dosť starý na to, aby ste sa registrovali.");
        } else {
            System.out.println("Prepáčte, musíte mať aspoň 18 rokov na to, aby ste sa mohli zaregistrovať.");
            System.out.println("Váš vek je " + age + " rokov.");
        }
        
        scanner.close();
    }
}