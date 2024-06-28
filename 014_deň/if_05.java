import java.util.Scanner;
public class if_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadajte znak: ");
        char znak = scanner.next().charAt(0);

        if (znak == 'a' || znak == 'e' || znak == 'i' || znak == 'o' || znak == 'u' ||
            znak == 'A' || znak == 'E' || znak == 'I' || znak == 'O' || znak == 'U') {
            System.out.println("Znak je samohláska.");
        } 
        else {
            System.out.println("Znak je spoluhláska.");
        }
    }
}
