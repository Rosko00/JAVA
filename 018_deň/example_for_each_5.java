// Iteračný program slučky for-each je iba pre čítanie
public class example_for_each_5 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Prvý for-each cyklus: ukáže hodnoty a pokus o zmenu
        for (int x : nums) {
            System.out.print(x + " ");
            x = x * 10; // Toto nebude mať žiadny vplyv na pole
        }

        System.out.println();

        // Druhý for-each cyklus: ukáže, že pole ostalo nezmenené
        for (int x : nums) {
            System.out.print(x + " ");
        }

        System.out.println();

    }
}
