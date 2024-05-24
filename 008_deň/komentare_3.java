/* Dokumentačné komentáre */
public class komentare_3 {
    private String name;
    private int age;

    /**
     * Konštruktor pre triedu Person.
     * 
     * @param name Meno osoby.
     * @param age Vek osoby.
     */
    public komentare_3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Získa meno osoby.
     * 
     * @return Meno osoby.
     */
    public String getName() {
        return name;
    }

    /**
     * Získa vek osoby.
     * 
     * @return Vek osoby.
     */
    public int getAge() {
        return age;
    }
}
