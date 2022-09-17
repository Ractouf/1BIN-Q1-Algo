/**
 *
 * @author Vandeputte François
 *
 */
public class ExercicesMultiplication {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entrainement aux multiplications. Voici 3 exercices :");

        for (int i = 0; i < 3; i++) {
            int nombre1 = unEntierAuHasardEntre (0, 10);
            int nombre2 = unEntierAuHasardEntre (0, 10);
            System.out.print("Calculez : " + nombre1 + " x " + nombre2 + " = ");
            int entree1 = scanner.nextInt();
             if(entree1 == nombre1*nombre2)
                System.out.println("Bravo !");
             else
                System.out.println("La bonne réponse est: " + nombre1*nombre2);
        }
    }

    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        double nombreReel;
        int resultat;

        nombreReel = Math.random();
        resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
        return resultat;



    }
}
