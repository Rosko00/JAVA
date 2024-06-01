/* Povyšovanie z 'char' na 'int' */
public class povysovanie_2 {
    public static void main(String[] args) {
        char c = 'A';
        int i = c; // povýšenie z char na int
        System.out.println("Hodnota i: " + i); 
    }
}
/* V tomto príklade sa hodnota premennej c typu char automaticky pretypuje na typ int a uloží sa do premennej i.
 * Znak A má ASCII hodnotu 65, ktorá sa automaticky prevedie na int. 
 * */