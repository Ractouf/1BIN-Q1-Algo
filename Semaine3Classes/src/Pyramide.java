/**
 *
 * @author Vandeputte François
 *
 */
import java.util.Scanner;

public class Pyramide {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entrez la taille (n) : ");
        int n = scanner.nextInt();
        int nbrEspaces = n;
        int nbrX = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < nbrEspaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < nbrX; j++) {
                System.out.print("X");
            }
            nbrX = nbrX + 2;
            nbrEspaces = nbrEspaces - 1;
            System.out.println();
        }

    }
}
