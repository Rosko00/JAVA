// Trieda krabica a použitie konštruktora
class krabica {
    double sirka;
    double vyska;
    double hlbka;


    // Toto je konštruktor triedy krabica
    krabica () {
        System.out.println("Inicializácia krabica");
        sirka = 10;
        vyska = 20;
        hlbka = 15;
    }

    // Výpočet vracajúci objem krabica
    double objem() {
        return sirka * vyska * hlbka;
    }
}    

class krabicaDemo6 {
    public static void main(String[] args) {
        
        // Deklarácia alokácia a inicializácia objektu triedy krabuica
        krabica mojakrabica1 = new krabica();
        krabica mojakrabica2 = new krabica();

        double obj;

        // Načítanie objemu prvý krabica
        obj = mojakrabica1.objem();
        System.out.println("Objem krabica 1 je " + obj);

        // Načítanie objemu druhá krabica
        obj = mojakrabica2.objem();
        System.out.println("Objem krabice 2 je " + obj);
    }   
}