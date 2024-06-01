/* Povyšovanie z 'int' na 'long' */
public class povysovanie_1 {
   public static void main(String[] args) {
    int i = 100;
    long l = i; // povýšenie z int na long
    System.out.println("Hodnota l: " + l);     
   } 
}
/* V tomto príklade sa hodnota premennej i typu int automaticky pretypuje na typ long a uloží sa do premennej l. 
 * Typ long je širší dátový typ ako int, takže tento proces je bezpečný a nedochádza k strate údajov. 
*/