import java.util.Scanner;

class Krabica {
    double width;
    double height;
    double depth;

    // Metóda na výpočet objemu
    double vypocitajObjem() {
        return width * height * depth;
    }
}

class KrabicaDemo_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Vytvorenie dvoch objektov krabica
        Krabica mojakrabica_1 = new Krabica();
        Krabica mojakrabica_2 = new Krabica();

        // Zadanie hodnôt pre mojakrabica_1
        System.out.println("Zadajte šírku prvej krabice:");
        mojakrabica_1.width = sc.nextDouble();
        System.out.println("Zadajte výšku prvej krabice:");
        mojakrabica_1.height = sc.nextDouble();
        System.out.println("Zadajte hĺbku prvej krabice:");
        mojakrabica_1.depth = sc.nextDouble();

        // Vymazanie bufferu Scanner
        sc.nextLine(); // Toto je užitočné pre čítanie ďalšieho riadku

        // Zadanie hodnôt pre mojakrabica_2
        System.out.println("Zadajte šírku druhej krabice:");
        mojakrabica_2.width = sc.nextDouble();
        System.out.println("Zadajte výšku druhej krabice:");
        mojakrabica_2.height = sc.nextDouble();
        System.out.println("Zadajte hĺbku druhej krabice:");
        mojakrabica_2.depth = sc.nextDouble();

        // Výpočet objemu pre mojakrabica_1
        double objem1 = mojakrabica_1.vypocitajObjem();
        System.out.println("Objem prvej krabice je: " + objem1);

        // Výpočet objemu pre mojakrabica_2
        double objem2 = mojakrabica_2.vypocitajObjem();
        System.out.println("Objem druhej krabice je: " + objem2);

        sc.close();
    }
}
    
        