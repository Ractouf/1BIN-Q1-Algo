/**
 *
 * @author Vandeputte François
 *
 */
public class NombreMystere {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int nombreDeviner = unEntierAuHasardEntre(1,100);
        int entreeUtilisateur, nombreEssais = 0;

        System.out.println("J'ai un chiffre en tête entre 1 et 100, essaye de le deviner!");
        do {
            entreeUtilisateur = scanner.nextInt();
            if (entreeUtilisateur == nombreDeviner) {

            } else
                if (entreeUtilisateur > nombreDeviner) {
                    System.out.println("C'est plus petit!");
                } else{
                        System.out.println("C'est plus grand!");
                    }
            nombreEssais++;
        }while(entreeUtilisateur != nombreDeviner);
        System.out.println("Tu as réussi a deviner le chiffre en seulement " + nombreEssais + " essai(s)!");
    }
    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        double nombreReel;
        int resultat;

        nombreReel = Math.random();
        resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
        return resultat;
    }
}
