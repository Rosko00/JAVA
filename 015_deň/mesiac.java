import java.util.Scanner;

public class mesiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Požiada používateľa o zadanie čísla mesiaca
        System.out.println("Zadajte číslo mesiaca (1-12): ");
        int month = scanner.nextInt();

        // Switch príkaz na základe hodnoty mesiaca
        switch (month) {
            case 1:
                System.out.println("Január");
                break;
            case 2:
                System.out.println("Február");
                break;
            case 3:
                System.out.println("Marec");
                break;
            case 4:
                System.out.println("Apríl");
                break;
            case 5:
                System.out.println("Máj");
                break;
            case 6:
                System.out.println("Jún");
                break;
            case 7:
                System.out.println("Júl");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Október");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Neplatné číslo mesiaca.");
                break;
        }
        scanner.close();
    }
}
