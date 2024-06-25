public class stream {
    public static void main(String[] args) {
        // výraz_1 ? výraz_2 : výraz_3

        int i, k;
        
        i = 10;
        k = i < 0 ? -i : i; // Výpočet absolutnej hodnoty i
        System.out.println( i + " je " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.println( i + " je " + k);

        // premenna = výraz;

        int a, b, c;
        a = b = c = 100;
        System.out.println(a + b + c );

        int ab = b + 3;
        System.out.println(ab);
    }
    
}
