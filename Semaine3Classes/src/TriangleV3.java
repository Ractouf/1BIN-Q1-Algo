/**
 *
 * @author Vandeputte François
 *
 */
import java.util.Scanner;

public class TriangleV3 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entrez la taille (n) : ");
        int n = scanner.nextInt();
        int nbrEspaces = n;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < nbrEspaces; j++) {
                System.out.print("X");
            }
            nbrEspaces = nbrEspaces - 1;
            System.out.println();
        }

    }
}
