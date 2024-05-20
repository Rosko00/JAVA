import java.util.Scanner;
public class dynamikInicializacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dynamická inicializácia pomocou užívateľského vstupu
        System.out.print("Zadajte svoje meno: ");
        String meno = scanner.nextLine(); // Inicializácia reťazcovej premennej na základe užívateľského vstupu

        System.out.print("Zadajte svoj vek: ");
        int vek = scanner.nextInt(); // Inicializácia celočíselnej premennej na základe užívateľského vstupu

        // Dynamická inicializácia pomocou výpočtov
        double pi = Math.PI; // Inicializácia desatinnej premennej pomocou metódy Math.PI
        double polomer = 7.5;
        double obvod = 2 * pi * polomer; // Inicializácia pomocou výpočtu

        // Vypísanie výsledkov
        System.out.println("Meno: " + meno);
        System.out.println("Vek: " + vek);
        System.out.println("Polomer kruhu: " + polomer);
        System.out.println("Obvod kruhu: " + obvod);
    }
}
