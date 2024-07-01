import java.util.Scanner;
public class start_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Požiada používateľa o zadanie farby
        System.out.println("Zadajte farbu (červená, modrá, zelená): ");
        String color = scanner.nextLine();
        
        // Získanie správy pre zadanú farbu
        String message = getColorMessage(color);
        
        // Vypísanie správy na obrazovku
        System.out.println(message);
        
        scanner.close();
    }
    
    // Metóda, ktorá vracia správu na základe farby
    public static String getColorMessage(String color) {
        switch (color.toLowerCase()) {
            case "červená":
                return "Vybrali ste červenú farbu.";
            case "modrá":
                return "Vybrali ste modrú farbu.";
            case "zelená":
                return "Vybrali ste zelenú farbu.";
            default:
                return "Neznáma farba.";
        }
    }
}