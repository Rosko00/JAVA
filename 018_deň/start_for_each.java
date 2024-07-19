import java.util.Arrays;
import java.util.List;

public class start_for_each {
    public static void main(String[] args) {
        
        // Prechádzanie cez pole čísel
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }        

        // Prechádzanie cez zoznam reťazcov
        List<String> names = Arrays.asList("Marián", "Hanka", "Maroš");
        for (String name : names) {
        System.out.println(name);
        }

    }
}