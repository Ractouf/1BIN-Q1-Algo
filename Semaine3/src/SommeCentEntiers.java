/**
 *
 * @author Vandeputte François
 *
 */
public class SommeCentEntiers {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int somme= 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print("Entrez l'entier numéro " + i + " : ");
            int entier = scanner.nextInt();
            somme = somme + entier;
        }
        System.out.println("La somme des entiers est: " + somme);
    }
}
