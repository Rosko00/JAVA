public class svetlo {
    public static void main(String[] args) {
        int rychlostSvetla = 299792; // přibližná rychlost světla v km/s
        long dni = 1000; // počet dní
        long sekundy = dni * 24 * 60 * 60; // převést dny na sekundy
        long vzdialenost = rychlostSvetla * sekundy; // vypočítať vzdialenosť

        System.out.print("Za " + dni + " dní svetlo prejde zhruba ");
        System.out.println(vzdialenost + " kilometrov.");
    }
}
