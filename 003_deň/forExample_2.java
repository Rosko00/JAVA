public class forExample_2 {
    public static void main(String[] args) {
        // Vytvorenie poľa celých čísel
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Premenná pre uchovanie súčtu
        int sum = 0;
        
        // For cyklus na iteráciu cez prvky poľa a výpočet súčtu
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // Pridanie aktuálneho prvku k súčtu
        }
        
        // Výpis súčtu
        System.out.println("Súčet prvkov poľa je: " + sum);
    }
}    

