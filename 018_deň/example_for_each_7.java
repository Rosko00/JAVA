public class example_for_each_7 {
    public static void main(String[] args) {
        int [] nums = {6,8,3,7,5,6,1,4};
        int val = 5;
        boolean found = false;

        // Použitie for-each verzie slučky for k vyhľadávaniu
        for (int x : nums) {
            if (x == val){
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Hodnota nájdená");
    }
}
