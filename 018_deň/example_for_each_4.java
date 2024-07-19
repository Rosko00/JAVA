// Použitie príkazu break spolu so slučkou for-each
public class example_for_each_4 {
    public static void main(String[] args) {
        int sum = 0;
        int [] nums = {1,2,3,4,5,6,7,8,9};

        for (int x : nums) {
            System.out.println("Hodnota je " + x);
            sum += x;
            if (x == 5) break;
        }
        System.out.println("Celkový súčet prvých 5 prvkov je: " + sum);
    }
}
