/**
 *
 * @author Vandeputte François
 *
 */
public class NombreNegatifsParmi10 {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int nombreEntiersNegatifs = 0;
        int nombreEntiersPositifs = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Entrez l'entier numéro " + i + " : ");
            int entier = scanner.nextInt();
            if (entier < 0) {
                nombreEntiersNegatifs ++;
            }else
                nombreEntiersPositifs ++;
        }
        System.out.println("Il y a " + nombreEntiersNegatifs + " nombre(s) négatif(s) et " + nombreEntiersPositifs + " nombre(s) positif(s)");
    }
}
