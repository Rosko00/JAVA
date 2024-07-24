public class break_4 {
    public static void main(String[] args) {
        boolean t = true;

        first : {
            second : {
                third : {
                    System.out.println("Pred príkazom break.");
                    if (t) break second; // opustenie bloku kódu
                    System.out.println("Tento príkaz sa neprevedie.");
                }
                System.out.println("Tento príkaz sa neprevedie");
            }
            System.out.println("Toto je príkaz, nasledujúci po bloku second.");
        }
    }
}
