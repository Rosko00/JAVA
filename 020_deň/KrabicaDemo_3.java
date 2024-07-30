import java.util.Scanner;

class Krabica_new {
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
        Krabica_new mojakrabica_3 = new Krabica_new();
        Krabica_new mojakrabica_4 = new Krabica_new();

        // Zadanie hodnôt pre mojakrabica_3
        System.out.println("Zadajte šírku tretej krabice:");
        mojakrabica_3.width = sc.nextDouble();
        System.out.println("Zadajte výšku tretej krabice:");
        mojakrabica_3.height = sc.nextDouble();
        System.out.println("Zadajte hĺbku tretej krabice:");
        mojakrabica_3.depth = sc.nextDouble();

        // Vymazanie bufferu Scanner
        sc.nextLine(); // Toto je užitočné pre čítanie ďalšieho riadku

        // Zadanie hodnôt pre mojakrabica_4
        System.out.println("Zadajte šírku štvrtej krabice:");
        mojakrabica_4.width = sc.nextDouble();
        System.out.println("Zadajte výšku štvrtej krabice:");
        mojakrabica_4.height = sc.nextDouble();
        System.out.println("Zadajte hĺbku štvrtej krabice:");
        mojakrabica_4.depth = sc.nextDouble();

        // Výpočet objemu pre mojakrabica_3
        double objem3 = mojakrabica_3.vypocitajObjem();
        System.out.println("Objem tretej krabice je: " + objem3);

        // Výpočet objemu pre mojakrabica_4
        double objem4 = mojakrabica_4.vypocitajObjem();
        System.out.println("Objem štvrtej krabice je: " + objem4);

        sc.close();
    }
}
