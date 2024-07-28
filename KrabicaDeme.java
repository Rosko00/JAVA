/* Program využívajúci triedu krabica */
class Krabica {
    double width;
    double height;
    double depth;
}
// Táto trieda deklaruje objekt typu Krabica.
class KrabicaDemo {
    public static void main(String[] args) {
        Krabica mojakrabica = new Krabica();
        double objem;

        // Priradenie hodnôt premenných inštancie mojakrabica
        mojakrabica.width = 10;
        mojakrabica.height = 20;
        mojakrabica.depth = 15;

        // Výpočet objemu krabica
        objem = mojakrabica.width * mojakrabica.height * mojakrabica.depth;
        System.out.println("Objem je: " + objem);  
    }
}
