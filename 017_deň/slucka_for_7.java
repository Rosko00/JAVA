public class slucka_for_7 {
    public static void main(String[] args) {
        int cislo = 5;
        int faktorial = 1;

        // Vypočítanie faktoriálu čísla
        for (int i = 1; i <= cislo; i++) {
            faktorial *= i;
        }

        System.out.println("Faktoriál čísla " + cislo + " je: " + faktorial); 
    }
}
