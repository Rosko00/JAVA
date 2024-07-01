import java.util.Scanner;

public class den {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Požiada používateľa o zadanie čísla dňa
        System.out.println("Zadajte číslo dňa v týždni (1-7): ");
        int day = scanner.nextInt();

        // Switch príkaz na základe hodnoty dňa
        switch (day) {
            case 1:
                System.out.println("Pondelok");
                break;
            case 2:
                System.out.println("Utorok");
                break;
            case 3:
                System.out.println("Streda");
                break;
            case 4:
                System.out.println("Štvrtok");
                break;
            case 5:
                System.out.println("Piatok");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Nedeľa");
                break;
            default:
                System.out.println("Neplatné číslo dňa.");
                break;
        }
        scanner.close();
    }
}
