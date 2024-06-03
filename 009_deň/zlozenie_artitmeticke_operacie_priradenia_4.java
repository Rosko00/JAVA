public class zlozenie_artitmeticke_operacie_priradenia_4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c ;
        int d ;

        c = ++b;
        d = a++;
        c ++;
        System.out.println("Hodnota a je =" + a); // Premenna A je 1
        System.out.println("Hodnota b je =" + b); // Premenna B je 2 
        System.out.println("Hodnota c je =" + c); // Premenna C je ( b + b) = (2 + 2) = 4
        System.out.println("Hodnota d je =" + d); // Premenne D je (a) = 1
    }
    
}
