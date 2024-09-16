public class prikladThis {

    public static void main(String[] args) {
        // Vytvorenie objektu triedy Krabica22
        Krabica22 krabica = new Krabica22(10, 20, 30);

        System.out.println("Šírka: " + krabica.sirka);
        System.out.println("Výška: " + krabica.vyska);
        System.out.println("Hĺbka: " + krabica.hlbka);
    }
}

class Krabica22 {
    double sirka;
    double vyska;
    double hlbka;

    // Konštruktor
    Krabica22(double w, double h, double d) {
        this.sirka = w;
        this.vyska = h;
        this.hlbka = d;
    }
}
