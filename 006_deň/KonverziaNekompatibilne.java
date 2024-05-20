public class KonverziaNekompatibilne {
    public static void main(String[] args) {
        // String na int
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println("Hodnota num: " + num);

        // int na String
        int num2 = 456;
        String str2 = Integer.toString(num2);
        System.out.println("Hodnota str2: " + str2);

        // String na double
        String str3 = "3.14";
        double d = Double.parseDouble(str3);
        System.out.println("Hodnota d: " + d);

        // double na String
        double d2 = 1.618;
        String str4 = Double.toString(d2);
        System.out.println("Hodnota str4: " + str4);
    }
}
