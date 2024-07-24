public class skok_riad_prik_1 {
    public static void main(String[] args) {
        //definovanie názvu (štítku) pre vonkajšiu slučku
        prva_slučka:
        for (int i = 0; i < 5; i ++) {
            for (int j = 0; j < 5; j ++) {
                System.out.println("i: " + i + "j: " + j);
                // Podmienka na opustenie obcho slučiek
                if (i == 2 && j == 3) {
                    // Použitie názvu (štítku) na opustenie vonkajšej slučky
                    break prva_slučka;
                }
            }
        }
        System.out.println("Opustili sme obe slučky.");
    }
}
