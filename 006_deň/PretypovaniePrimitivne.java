public class PretypovaniePrimitivne {
    public static void main(String[] args) {
        byte b = 10;
        int i = b; // byte -> int, implicitná konverzia
        byte c = (byte) i; // int -> byte, explicitné pretypovanie
        System.out.println("Hodnota c: " + c);

        float f = 5.5f;
        double d = f; // float -> double, implicitná konverzia
        float g = (float) d; // double -> float, explicitné pretypovanie
        System.out.println("Hodnota g: " + g);
    }
}
