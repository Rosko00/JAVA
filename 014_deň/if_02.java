import java.util.Scanner;
public record if_02() {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadajte číslo: ");
        int cislo = scanner.nextInt();

        if (cislo >= 0) {
            System.out.println("Číslo nie je nezáporné.");
        } 
        else {
            System.out.println("Číslo je záporné.");
        }

    }   
}
