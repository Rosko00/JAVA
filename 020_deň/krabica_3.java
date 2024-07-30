class krabica_3 {
    double width;
    double height;
    double depth;

    // vytvorenie objektu krabica
    static krabica_3 mojakrabica = new krabica_3();

    public static void main(String[] args) {
        // pridarenie hodnoty šírke
        mojakrabica.width = 100;
 
        // Výpis hodnoty šírky
        System.out.println("Šírka je: " + mojakrabica.width);

    }
}
