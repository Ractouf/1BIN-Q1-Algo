/**
 *
 * @author Vandeputte François
 *
 */
public class NombreMystereInverse {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int nombreDeviner, maxNombre = 0, minNombre= 100, plusGrandOuPlusPetit, ouiOuNon, finDeLaDevinette = 0, nombreEssais = 0;

        System.out.println("Choisis un nombre entre 1 et 100 et je vais essayer de le deviner!");

        do{
            nombreDeviner = unEntierAuHasardEntre(minNombre,maxNombre);
            System.out.print("Ton nombre est-il: " + nombreDeviner + " ? (Y/N): ");
            ouiOuNon = scanner.next().charAt(0);

            if (ouiOuNon == 'N') {
                System.out.print("Zut! \nTon nombre est il plus grand (+), plus petit (-) que: " + nombreDeviner + " ? ");
                plusGrandOuPlusPetit = scanner.next().charAt(0);

                if (plusGrandOuPlusPetit == '+'){
                    maxNombre = nombreDeviner + 1;
                }else
                    if(plusGrandOuPlusPetit == '-'){
                        minNombre = nombreDeviner - 1;
                    }
                if(minNombre + 1 == maxNombre - 1) {
                    System.out.print("Ton nombre n'est pas un entier.");
                    finDeLaDevinette = 2;
                }
            }else
                if (ouiOuNon == 'Y'){
                    finDeLaDevinette = 1;
                }
            System.out.println("");
            nombreEssais++;
        }while(finDeLaDevinette == 0);
        if(finDeLaDevinette == 1) {
            System.out.println("J'ai réussi!! \nTon nombre est " + nombreDeviner);
            System.out.println("J'ai deviné ton nombre en seulement " + nombreEssais + " essai(s)!");
        }else
            System.out.println("Tu ne m'auras pas!");;
    }

    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        double nombreReel;
        int resultat;

        nombreReel = Math.random();
        resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
        return resultat;
    }
}
