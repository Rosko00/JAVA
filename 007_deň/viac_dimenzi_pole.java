/* Ukazka dvoj dimenzionalneho pola */
public class viac_dimenzi_pole {
    public static void main(String[] args) {
        int dve_polia [][] = new int [4][5];
        int i, j ,k = 0;

        for (i=0; i<4; i++)
            for (j=0; j<5; j++) {
                dve_polia[i][j] = k;
                k++;
        }

        for (i=0; i<4; i++) {
            for (j=0; j<5; j++)
                System.out.println(dve_polia[i][j] + " ");
        }
    }
    
}
