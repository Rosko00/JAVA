public class BlokovePremenne {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int blokVar = i * 2; // Bloková premenná
            System.out.println("blokVar: " + blokVar);
        }
        // System.out.println(blokVar); // Chyba: blokVar nie je viditeľná mimo for-cyklu
    }
}
