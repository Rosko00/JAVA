import java.util.Scanner;
public class if_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadajte číslo: ");
        int cislo = scanner.nextInt();

        if (cislo >= 0) {
            if (cislo == 0) {
                System.out.println("Číslo je nula.");
            } 
            else {
                System.out.println("Číslo nie je záporné.");
            }
        } 
        else {
            System.out.println("Číslo je záporné.");
        } 
    }
}
