public class break_5 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i ++) {
            System.out.print("Prechod " + i + ":");
            for (int j = 0; j < 100; j ++) {
                if (j == 10) break outer;
                System.out.print (j + " ");
            }
            System.out.println("Toto sa nevypíše");
        }
        System.out.println(" Slučky dokončené");
    }
}
