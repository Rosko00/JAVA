public class example_for_each_6 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][5]; // Deklarácia dvojrozmerného poľa

        // Vloženie hodnôt do poľa nums
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }

        // Použitie for-each cyklu na zobrazenie hodnôt
        for (int[] x : nums) {
            for (int y : x) {
                System.out.println("Hodnota je " + y);
                sum += y; // Pridanie hodnoty do sum
            }
        }

        System.out.println("Celkový počet je: " + sum);
    }
}
