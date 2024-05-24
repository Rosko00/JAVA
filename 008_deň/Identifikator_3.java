/* Identifikátor triedy */
public class Identifikator_3 {
    // Deklarácia atribútov s identifikátormi "name" a "age"
    String name;
    int age;

    // Konštruktor s identifikátorom "Identifikator3"
    public Identifikator_3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        // Vytvorenie objektu triedy Identifikator3 s identifikátormi "john" a "25"
        Identifikator_3 osoba = new Identifikator_3("Marián", 42);
        System.out.println("Meno: " + osoba.name);
        System.out.println("Vek: " + osoba.age);
    }
}
/* Identifikátor 'Identifikator_3' je použitý na pomenovanie triedy, a 'name' a 'age'
 * identifikátory atribútov.
*/
