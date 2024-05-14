/*
 * výpočet vzdialenosti svetla za definovaný čas.
 * Použité sú premenné long.
 */
public class svetlo {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // približná rýchlosť svetla je: 299792

        days = 1000; // počet dní

        seconds = days - 24 * 60 * 60; //prevod dní na sekundy

        distance = lightspeed * seconds //výpočet vzdialenosti

        System.out.print("Za" + days);
        System.out.print("dní svetlo prejde zhruba");
        System.out.println(distance + "kilometrov.");
    }
}
