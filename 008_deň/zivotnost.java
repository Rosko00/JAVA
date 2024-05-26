/* Životnosť premenných */
public class zivotnost {
       // Globálna premenná (statická premenná triedy)
    static int globalCounter = 0;

    public static void main(String[] args) {
        // Lokálna premenná metódy main
        int localMainCounter = 0;

        // Blokový rozsah v metóde main
        for (int i = 0; i < 3; i++) {
            // Bloková premenná v cykle for
            int blockCounter = i;
            System.out.println("Bloková premenná (iterácia " + i + "): " + blockCounter);
        }
        // System.out.println(blockCounter); // Chyba: Premenná nie je definovaná v tomto rozsahu

        // Volanie metódy
        incrementCounters();

        // Výpis hodnôt globálnej a lokálnej premennej
        System.out.println("Globálna premenná po volaní metódy: " + globalCounter);
        System.out.println("Lokálna premenná main po volaní metódy: " + localMainCounter);
    }

    public static void incrementCounters() {
        // Lokálna premenná metódy incrementCounters
        int localMethodCounter = 0;

        // Inkrementácia globálnej premennej
        globalCounter++;
        localMethodCounter++;

        // Výpis hodnôt globálnej a lokálnej premennej
        System.out.println("Globálna premenná v incrementCounters: " + globalCounter);
        System.out.println("Lokálna premenná v incrementCounters: " + localMethodCounter);
    } 
}
/* Globálna premenná (statická premenná triedy):
 * - static int globalCounter = 0;
 * - Životnosť tejto premennej je po celú dobu behu programu. Je vytvorená pri načítaní triedy a zaniká pri ukončení programu.
 */
/* Lokálna premenná metódy main:
 * - int localMainCounter = 0;
 * - Životnosť tejto premennej je obmedzená na dobu vykonávania metódy main. Premenná je vytvorená pri vstupe do metódy a zaniká pri jej ukončení.
 */
/* Bloková premenná v cykle for:
 * - int blockCounter = i;
 * - Životnosť tejto premennej je obmedzená na jeden cyklus bloku for. Premenná je vytvorená pri každej iterácii cyklu a zaniká na konci tejto iterácie.
 */
/* Lokálna premenná metódy incrementCounters:
 * - int localMethodCounter = 0;
 * - Životnosť tejto premennej je obmedzená na dobu vykonávania metódy incrementCounters. Premenná je vytvorená pri vstupe do metódy a zaniká pri jej ukončení.
 */

/* Zhrnutie životnosti: 
 * - Globálne premenné (statické premenné triedy): Majú najdlhšiu životnosť, sú vytvorené pri načítaní triedy a zanikajú pri ukončení programu.
 * - Lokálne premenné (v metódach): Životnosť je obmedzená na dobu vykonávania metódy. Premenná je vytvorená pri vstupe do metódy a zaniká pri jej ukončení.
 * - Blokové premenné: Životnosť je obmedzená na dobu vykonávania bloku. Premenná je vytvorená pri vstupe do bloku (napr. cyklus, podmienkový blok) a zaniká pri jeho ukončení.
*/