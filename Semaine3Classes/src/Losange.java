/**
 *
 * @author Vandeputte François
 *
 */
import java.util.Scanner;

public class Losange {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entrez la taille (n) : ");
        int n = scanner.nextInt();
        int nbrEspaces = 0;
        int nbrCroix = n;
        for (int i = n; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("X");
            }
            for (int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= nbrEspaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= nbrCroix; j++){
                System.out.print("X");
            }
            System.out.println();
            nbrEspaces++;
            nbrCroix--;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
