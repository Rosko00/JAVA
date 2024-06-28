import java.util.Scanner;
public class if_11 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadajte váš vek: ");
        int vek = scanner.nextInt();

        if (vek >= 65) {
            System.out.println("Máš právo hlasovať a tiež si dôchodca.");
        } else if (vek >= 18) {
            System.out.println("Máš právo hlasovať.");
        } else {
            System.out.println("Nemáš právo hlasovať.");
        }
   } 
}
