/**
 *
 * @author Vandeputte François
 *
 */
public class RecitationTableMultiplication {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int tableDeMultiplication = unEntierAuHasardEntre(1,10);
        int multiplication = 1;
        int resultat;
        int reponseUtlisateur;
        System.out.println("Tu vas me donner la table de multiplication par " + tableDeMultiplication);
        do{
            System.out.print(multiplication + "x" + tableDeMultiplication + " = ");
            reponseUtlisateur = scanner.nextInt();
            resultat = multiplication * tableDeMultiplication;
            multiplication ++;

        }while(resultat < (tableDeMultiplication * 10) && reponseUtlisateur == resultat);

        if (reponseUtlisateur != resultat) {
            System.out.println("Non c'est faux, la bonne réponse est: " + resultat);
        }else
            System.out.println("Félécitation!");
    }

    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        double nombreReel;
        int resultat;

        nombreReel = Math.random();
        resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
        return resultat;
    }
}
