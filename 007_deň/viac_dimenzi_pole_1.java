public class viac_dimenzi_pole_1 {
    public static void main(String[] args) {
        // Deklarácia 2D poľa s rôznymi dĺžkami vnútorných polí
        int al_pola [][] = new int [4][];
        al_pola [0] = new int [1]; // Pole s dĺžkou 1
        al_pola [1] = new int [2]; // Pole s dĺžkou 2
        al_pola [2] = new int [3]; // Pole s dĺžkou 3
        al_pola [3] = new int [4]; // Pole s dĺžkou 4

        int i, j, k = 0;

        // Naplnenie poľa hodnotami
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                al_pola[i][j] = k;
                k++;
            }
        }
        
        // Vypísanie poľa
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(al_pola[i][j] + " ");
            }
            System.out.println();
        }
    }
}
