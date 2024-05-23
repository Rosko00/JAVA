public class priemer_pole {
    public static void main(String[] args) {
        double cislo [] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;

        for (i=0; i <5; i++)
            result = result + cislo[i];
        System.out.println ("Priemerna hodnota je: " + result / 5);

    }

}
