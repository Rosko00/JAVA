public class example_for_each_3 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9};
        int sum = 0;

        // Použitie for-each štílu slučky for pre zobrazenie
        // jednotlivých hodôt a výpočtu celkového súčtu
        for (int x : nums) {
            System.out.println("Hodnota je: " + x);
            sum += x;
        }
        System.out.println("Celkový súčet je " + sum);
    }
}
