/* Povyšovanie z 'int' na 'float' */
public class povysovanie_3 {
    public static void main(String[] args) {
        int i = 50;
        float f = i; // povýšenie z int na float
        System.out.println("Hodnota f: " + f);
    }
}
/* V tomto príklade sa hodnota premennej i typu int automaticky pretypuje na typ float a uloží sa do premennej f. 
 * Typ float je širší dátový typ ako int, takže tento proces je bezpečný a nedochádza k strate údajov. 
 */
