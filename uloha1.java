public class uloha1 {
        public static void main(String[] args) {
            int num = 10;
            String vstup = String.format("C++ je %d KRÁT lepší", num);
            System.out.println(vstup);

            String bezMedzier = vstup.trim().replaceAll("\\s+", " ");
            System.out.println(bezMedzier);        
        }
    }

