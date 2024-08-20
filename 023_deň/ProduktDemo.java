
class Produkt {
    String nazov;
    double cena;
    int mnozstvo;

    // Parametrizovaný konštruktor
    Produkt(String nazov, double cena, int mnozstvo) {
        this.nazov = nazov;
        this.cena = cena;
        this.mnozstvo = mnozstvo;
    }

    void zobrazInfo() {
        System.out.println("Produkt: " + nazov + ", Cena: " + cena + ", Množstvo: " + mnozstvo);
    }
}

public class ProduktDemo {
    public static void main(String[] args) {
        Produkt produkt1 = new Produkt("Notebook", 999.99, 5);
        produkt1.zobrazInfo();
    }
}
