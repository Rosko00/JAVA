/* Vysvetlenie zložitosti logiky */
public class komentare_4 {
    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Faktoriál čísla " + number + " je " + result);
    }

    /**
     * Vypočíta faktoriál daného čísla.
     * 
     * @param n Číslo, ktorého faktoriál sa má vypočítať.
     * @return Faktoriál čísla n.
     */
    public static int factorial(int n) {
        // Ak je n menšie alebo rovné 1, faktoriál je 1
        if (n <= 1) {
            return 1;
        } else {
            // Rekurzívne volanie na výpočet faktoriálu
            return n * factorial(n - 1);
        }
    }
}
/* Komentáre vysvetľujú logiku výpočtu faktoriálu, vrátane podmienok a rekurzie */
