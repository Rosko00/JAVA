class Zamestnanec {
    String meno;
    String pozicia;
    double plat;

    // Parametrizovaný konštruktor
    Zamestnanec(String meno, String pozicia, double plat) {
        this.meno = meno;
        this.pozicia = pozicia;
        this.plat = plat;
    }

    void zobrazInfo() {
        System.out.println("Zamestnanec: " + meno + ", Pozícia: " + pozicia + ", Plat: " + plat);
    }
}

public class ZamestnanecDemo {
    public static void main(String[] args) {
        Zamestnanec zamestnanec1 = new Zamestnanec("Eva", "Manažér", 2500.0);
        zamestnanec1.zobrazInfo();
    }
}
