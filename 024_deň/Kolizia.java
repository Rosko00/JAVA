public class Kolizia {

    public static void main(String[] args) {
        // Vytvorenie objektu triedy Krabica22
        Krabica30 krabicaA = new Krabica30(10, 20, 30);

        // Výpis hodnôt
        System.out.println("Šírka: " + krabicaA.getSirka());
        System.out.println("Výška: " + krabicaA.getVyska());
        System.out.println("Hĺbka: " + krabicaA.getHlbka());
    }
}

class Krabica30 {
    private double sirka;
    private double vyska;
    private double hlbka;

    // Konštruktor
    public Krabica30(double sirka, double vyska, double hlbka) {
        this.sirka = sirka;
        this.vyska = vyska;
        this.hlbka = hlbka;
    }

    // Gettery na prístup k hodnotám premenných
    public double getSirka() {
        return sirka;
    }

    public double getVyska() {
        return vyska;
    }

    public double getHlbka() {
        return hlbka;
    }
}
