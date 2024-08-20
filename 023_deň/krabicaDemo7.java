// Trieda krabica teraz používa k inicializácií rozmeru krabice
class krabica10 {
    double sirka;
    double vyska;
    double hlbka;


    // Toto je konštruktor triedy krabica
    krabica10 (double w, double h, double d) {
        System.out.println("Inicializácia krabica");
        sirka = w;
        vyska = h;
        hlbka = d;
    }

    // Výpočet vracajúci objem krabica
    double objem() {
        return sirka * vyska * hlbka;
    }
}    

class krabicaDemo7 {
    public static void main(String[] args) {
        
        // Deklarácia alokácia a inicializácia objektu triedy krabuica
        krabica10 mojakrabica1 = new krabica10(10,20,15);
        krabica10 mojakrabica2 = new krabica10(3,6,9);

        double obj;

        // Načítanie objemu prvý krabica
        obj = mojakrabica1.objem();
        System.out.println("Objem krabica 1 je " + obj);

        // Načítanie objemu druhá krabica
        obj = mojakrabica2.objem();
        System.out.println("Objem krabice 2 je " + obj);
    }   
}