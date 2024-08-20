
class Obdlznik {
    double sirka;
    double vyska;

    // Parametrizovaný konštruktor
    Obdlznik(double sirka, double vyska) {
        this.sirka = sirka;
        this.vyska = vyska;
    }

    double plocha() {
        return sirka * vyska;
    }

    void zobrazInfo() {
        System.out.println("Obdĺžnik: Šírka: " + sirka + ", Výška: " + vyska + ", Plocha: " + plocha());
    }
}

public class ObdlznikDemo {
    public static void main(String[] args) {
        Obdlznik obdlznik1 = new Obdlznik(5.0, 7.0);
        obdlznik1.zobrazInfo();
    }
}
