// Definícia rozhrania s identifikátorom "Animal"
public interface identifikator_5 {
    // Deklarácia metódy v rozhraní s identifikátorom "makeSound"
    void makeSound();
}

// Implementácia rozhrania Animal v triede Dog
public class Dog implements identifikator_5 {
    // Implementácia metódy s identifikátorom "makeSound"
    @Override
    public void makeSound() {
        System.out.println("Hav, hav!");
    }
}
