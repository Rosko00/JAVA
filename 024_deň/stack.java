/*Táto trieda implementuje kód zásobníku pre až 10 celých čísel */
public class stack {
    int stck[] = new int [00];
    int tos;

    //Inicializácia vrcholu zásobníka
    stack() {
        tos = -1;
    }

    // Pridanie nového 
    void pusch (int item) {
        if (tos = 9)
            System.out.println("Zásobník je plný");
        else
            stck [++tos] = item;

    }

    // Odobratie prvku
    int pop() {
        if (tos < 0) {
            System.out.println("Zásobník už je prázdny");
            return 0;
        }
        else
            return stck [tos --];
    } 
}
