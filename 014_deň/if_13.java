import java.util.Scanner;
public class if_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadajte číslo: ");
        int cislo = scanner.nextInt();

        if (cislo % 2 == 0 && cislo > 100) {
            System.out.println("Číslo je párne a veľké.");
        } else if (cislo % 2 == 0) {
            System.out.println("Číslo je párne.");
        } else if (cislo % 2 != 0 && cislo > 100) {
            System.out.println("Číslo je nepárne a veľké.");
        } else {
            System.out.println("Číslo je nepárne.");
        }
    }
}
