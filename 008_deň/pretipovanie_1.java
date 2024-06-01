/* Pretypovanie z 'double' na 'int' (násilné pretypovanie)*/
public class pretipovanie_1 {
   public static void main(String[] args) {
    double d = 9.78;
    int i = (int) d; // pretypovanie z double na int
    System.out.println("Hodnota i: " + i); 
   } 
}
/* 'double' je širší dátový typ ako 'int'. 
 * Pri pretypovaní na 'int' sa desatinná časť stratí, čo môže viesť k strate presnosti
*/
