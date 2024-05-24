/* Ukazka prace s trojdimenzionalnym polom */
public class viac_dimenzi_pole_3 {
    public static void main(String[] args) {
        int troj_pole [][][] = new int [3][4][5];
        int i, j, k;

        for (i=0; i<3; i++)
            for (j=0; j<4; j++)
                for (k=0; k<5; k++)
                    troj_pole [i][j][k] = i +j + k;
                        
                        for (i=0; i<3; i++){
                            for (j=0; j<4; j++){
                                for (k=0; k<5; k++){
                                    System.out.print (troj_pole [i][j][k] + " ");
                                System.out.println();
                                }
                            System.out.println();
                            }
                        }
    }    
}
