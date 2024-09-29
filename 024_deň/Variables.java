package ITnetwork;
import java.util.Scanner;
public class Variables {
    public static void  main(String[] args) {
        // Dátové typy
        String Znaky;
        int CeleCisla;
        double DesatinneCislo;
        boolean PravdaNepravda;

        Znaky = "Toto je String"; // Vypíše náhodné znkay, to že dávajú význam je irelevantné
        System.out.println(Znaky);

        CeleCisla = 42; // Java predpokladá celé číslo bez desatinnej čiarky
        System.out.println(CeleCisla);

        DesatinneCislo = 42;
        System.out.println(DesatinneCislo);

        PravdaNepravda = 10>5;
        System.out.println(PravdaNepravda);

        // Pre vstup použijeme Scanner
        Scanner scanner = new Scanner(System.in);

        // Pokiaľ očakávam reťazec
        System.out.println("Zadaj svoje meno: ");
        Znaky = scanner.nextLine();
        System.out.println("Tvoje meno je: " + Znaky);

        // Pokiaľ očakávame celé číslo
        System.out.println("Zadaj svoj vek: ");
        CeleCisla = scanner.nextInt();
        System.out.println("Tvoj vek je: " + CeleCisla);

        // Pokiaš očakávame desatinné číslo
        System.out.println("Zadaj ľubovoľné číslo: ");
        DesatinneCislo = scanner.nextDouble();
        System.out.println("Zadané číslo je: " + DesatinneCislo);

        System.out.println("Zadaj true alebo false");
        PravdaNepravda = scanner.nextBoolean();
        System.out.println("Uhádnem čo ste zadali:  " + PravdaNepravda);

        // Parsovanie je pretipovanie
        String text = "123";
        int cislo = Integer.parseInt(text);
        System.out.println("Výsledné číslo je: " + cislo);

        // Textové reťazce a práca s nimi

        // startWItch (Kontola začiatku reťazca)
        String meno = "Marián Gálik";
        boolean vysledok = meno.startsWith("Marián");
        System.out.println("Začína premená menom Marián :" + vysledok);

        String meno1 = "Marián Gálik";
        boolean vysledok1 = meno1.startsWith("Gálik", 7);
        System.out.println("Začína premená menom Marián :" + vysledok1);

        int dlzka = meno.length();
        System.out.println("Počet znakov je: " + dlzka + "v tvojom mene.");

        //Podmienky

        // vstup od užívateľa pre výšku
        System.out.println("Zadaj svoju výšku");
        int vyska = scanner.nextInt();

        //vstup od uzivatela pre váhu
        System.out.println("Zadaj svoju váhu");
        int vaha = scanner.nextInt();

        if ((vyska >= 120) ^ (vaha >= 50))  {
            System.out.println("Splnil si aspoň jednu podmienku a môžeš ísť na kolotoč. ");
        }
        else
            System.out.println("Nespĺňaš ani jedno pravidlo pre vstup na kolotoč");

        //Vnorené podmienky

        // vstup od užívateľa pre výšku
        System.out.println("Zadaj svoju výšku");
        int vyska1 = scanner.nextInt();

        //vstup od uzivatela pre váhu
        System.out.println("Zadaj svoju váhu");
        int vaha1 = scanner.nextInt();

        if (vyska1 >= 120) {
            if (vaha1 >= 50) {
                System.out.println("Spnil si obe podmienky a môžeš ísť na kolotoč");
            }
            else {
                System.out.println("Splnil si podmienku výšky ale nie váhy")
            }
        }
        else {
            if (vaha1 >= 50) {
                System.out.println("Spnil si podmienku váhy ale nie výšky");
            }
            else {
                System.out.println("Nespĺňaš ani jednu podmienku");
            }
        }
    }
}