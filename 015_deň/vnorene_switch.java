import java.util.Scanner;

public class vnorene_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Požiada používateľa o zadanie typu zariadenia
        System.out.println("Zadajte typ zariadenia (počítač, mobil): ");
        String deviceType = scanner.nextLine();

        // Požiada používateľa o zadanie operačného systému
        System.out.println("Zadajte operačný systém (Windows, macOS, Linux, Android, iOS): ");
        String osType = scanner.nextLine();

        // Prvý switch príkaz na základe typu zariadenia
        switch (deviceType.toLowerCase()) {
            case "počítač":
                // Vnorený switch príkaz na základe operačného systému pre počítače
                switch (osType.toLowerCase()) {
                    case "windows":
                        System.out.println("Vybrali ste počítač s Windows.");
                        break;
                    case "macos":
                        System.out.println("Vybrali ste počítač s macOS.");
                        break;
                    case "linux":
                        System.out.println("Vybrali ste počítač s Linux.");
                        break;
                    default:
                        System.out.println("Neznámy operačný systém pre počítač.");
                        break;
                }
                break;

            case "mobil":
                // Vnorený switch príkaz na základe operačného systému pre mobily
                switch (osType.toLowerCase()) {
                    case "android":
                        System.out.println("Vybrali ste mobil s Android.");
                        break;
                    case "ios":
                        System.out.println("Vybrali ste mobil s iOS.");
                        break;
                    default:
                        System.out.println("Neznámy operačný systém pre mobil.");
                        break;
                }
                break;

            default:
                System.out.println("Neznámy typ zariadenia.");
                break;
        }

        scanner.close();
    }
}
