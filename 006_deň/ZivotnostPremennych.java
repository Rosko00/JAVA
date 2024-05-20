public class ZivotnostPremennych {
    static int statickaPremenna = 100; // Statická premenná

    int triednaPremenna; // Členská premenná

    public ZivotnostPremennych(int hodnota) {
        triednaPremenna = hodnota;
    }

    public void zobrazLokalePremenne() {
        int lokalnaPremenna = 50; // Lokálna premenná
        System.out.println("Lokálna premenná: " + lokalnaPremenna);
    }

    public static void main(String[] args) {
        ZivotnostPremennych obj = new ZivotnostPremennych(10);
        obj.zobrazLokalePremenne();
        System.out.println("Členská premenná: " + obj.triednaPremenna);
        System.out.println("Statická premenná: " + statickaPremenna);
    }
}
