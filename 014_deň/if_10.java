import java.util.Scanner;
public class if_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadajte písmeno: ");
        char znak = scanner.next().charAt(0);

        if (znak == 'a' || znak == 'e' || znak == 'i' || znak == 'o' || znak == 'u' ||
            znak == 'A' || znak == 'E' || znak == 'I' || znak == 'O' || znak == 'U') {
            if (Character.isUpperCase(znak)) {
                System.out.println("Znak je veľká samohláska.");
            } 
            else {
                System.out.println("Znak je malá samohláska.");
            }
        } else {
            if (Character.isUpperCase(znak)) {
                System.out.println("Znak je veľká spoluhláska.");
            } 
            else {
                System.out.println("Znak je malá spoluhláska.");
            }
        }
    }
}
