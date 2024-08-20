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
    
}