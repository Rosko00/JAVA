public class zlozenie_artitmeticke_operacie_priradenia_3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;

        System.out.println("Hodnota a je :" + a); // 1 + 5 = 6
        System.out.println("Hodnota b je :" + b); // 2 * 4 = 8
        System.out.println("Hodnota c je :" + c); // 3 + (6 * 8) = 3 + 48 = 51
    }
}
