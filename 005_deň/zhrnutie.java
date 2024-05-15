public class zhrnutie {
        public static void main(String[] args) {
            // Celočíselné datové typy
            byte malyCislo = 10;
            short kratsieCislo = 500;
            int celeCislo = 1000;
            long dlheCislo = 100000L; // Sufix L označuje dlhé celé číslo
    
            // Desatinné datové typy
            float desatinneCislo = 3.14f; // Sufix f označuje float
            double dvojitaPresnost = 2.71828; // Double je implicitný datový typ pre desatinné čísla
    
            // Znakový datový typ
            char znak = 'A'; // Použitie jednoduchých úvodzoviek pre znak
    
            // Boolean datový typ
            boolean pravda = true;
            boolean nepravda = false;
    
            // Výpis hodnôt jednotlivých datových typov
            System.out.println("Celočíselné datové typy:");
            System.out.println("byte: " + malyCislo);
            System.out.println("short: " + kratsieCislo);
            System.out.println("int: " + celeCislo);
            System.out.println("long: " + dlheCislo);
    
            System.out.println("\nDesatinné datové typy:");
            System.out.println("float: " + desatinneCislo);
            System.out.println("double: " + dvojitaPresnost);
    
            System.out.println("\nZnakový datový typ:");
            System.out.println("char: " + znak);
    
            System.out.println("\nBoolean datový typ:");
            System.out.println("pravda: " + pravda);
            System.out.println("nepravda: " + nepravda);
        
        }
    
}
