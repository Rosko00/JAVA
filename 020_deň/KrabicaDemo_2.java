class krabica {
    double width;
    double height;
    double depth;
}
class KrabicaDemo_2 {
    public static void main(String[] args) {
        krabica mojakrabica_1 = new krabica ();
        krabica mojakrabica_2 = new krabica ();
        double objem;

        // priradenie hodnoty inštancie krabica_1
        mojakrabica_1.width = 10;
        mojakrabica_1.height = 20;
        mojakrabica_1.depth = 15;

        // prioradenie hodnoty inštancie krabica_2
        mojakrabica_2.width = 3;
        mojakrabica_2.height = 6;
        mojakrabica_2.depth = 9;

        // Výpočet objemu krabica_1
        objem = mojakrabica_1.width * mojakrabica_1.height * mojakrabica_1.depth;
        System.out.println ("Objem krabice 1 je: " + objem);

        // Výpočet objemu krabica_2
        objem = mojakrabica_2.width * mojakrabica_2.height * mojakrabica_2.depth;
        System.out.println ("Objem krabice 2 je: " + objem);
         
    }
}