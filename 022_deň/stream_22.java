// Motoda objem ()vracia objem krabica

class krabica {
    double sirka;
    double vyska;
    double hlbka;

    //vypocet objemu krabica
    double objem () {
        return sirka * vyska * hlbka;
    }
}

class krabicaDemo4 {
    public static void main(String[] args) {
        krabica mojakrabica1 = new krabica ();
        krabica mojakrabica2 = new krabica ();
        double obj;

        // priradenie hodnoty mojakrabica1
        mojakrabica1.sirka = 10;
        mojakrabica1.vyska = 20;
        mojakrabica1.hlbka = 15;

        // priradenie hodnoty mojakrabica2
        mojakrabica2.sirka = 3;
        mojakrabica2.vyska = 6;
        mojakrabica2.hlbka = 9;

        // nacitanie objemu prvej krabice
        obj = mojakrabica1.objem();
        System.out.println("Moja krabica 1 je " + obj);

        // nacitanie objemu druha krabica
        obj = mojakrabica2.objem();
        System.out.println("Moja krabica 2 je " + obj);
    }
}