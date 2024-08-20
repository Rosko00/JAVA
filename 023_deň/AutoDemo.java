class Auto {
    String znacka;
    String model;
    int rok;

    // Parametrizovaný konštruktor
    Auto(String znacka, String model, int rok) {
        this.znacka = znacka;
        this.model = model;
        this.rok = rok;
    }

    void zobrazInfo() {
        System.out.println("Auto: " + znacka + " " + model + ", Rok: " + rok);
    }
}

public class AutoDemo {
    public static void main(String[] args) {
        Auto mojeAuto = new Auto("Toyota", "Corolla", 2020);
        mojeAuto.zobrazInfo();
    }
}
