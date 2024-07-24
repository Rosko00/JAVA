public class break_3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i ++) {
            System.out.println(" Prechod " + i + " :");
            for (int j = 0; j< 100; j++){
                if ( j == 10) break; // Ukončenie slučky
                System.out.print( j + " ");
            }
            System.out.println();
        }
        System.out.println("Všetky slučky ukončené.");
    }
}
