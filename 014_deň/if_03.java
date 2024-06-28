import java.util.Scanner;
public class if_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadajte číslo: ");
        int cislo = scanner.nextInt();

        if (cislo % 2 == 0) {
            System.out.println("Číslo je párne.");
        } 
        else {
            System.out.println("Číslo je nepárne.");
        }
   } 
}
