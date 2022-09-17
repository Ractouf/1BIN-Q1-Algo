/**
 *
 * @author Vandeputte François
 *
 */
public class SommesNegatifsEtPositifs {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int sommePositifs = 0;
        int sommeNegatifs = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Entrez l'entier numéro " + i + " : ");
            int entier = scanner.nextInt();
            if (entier < 0) {
                sommeNegatifs = sommeNegatifs + entier;
            }else{
                sommePositifs = sommePositifs + entier;
            }
        }
        System.out.println("La somme des nombres positifs est égale a: " + sommePositifs);
        System.out.println("La somme des nombres négatifs est égale a: " + sommeNegatifs);
    }
}
