/* Pretypovanie z 'int' na 'double' (automatické pretypovanie): */
public class pretipovanie_2 {
    public static void main(String[] args) {
        int i = 10;
        double d = i; // automatické pretypovanie z int na double
        System.out.println("Hodnota d: " + d); 
    }    
}
/* Automatické pretypovanie ('int' na 'double'):
 * int je užší dátový typ ako double. Java automaticky pretypuje užší typ na širší typ, 
 * pretože tento proces je bezpečný a nedochádza pri ňom k strate údajov.
*/