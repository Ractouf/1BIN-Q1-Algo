/**
 *
 * @author Vandeputte François
 *
 */
public class Multiplication3Essais {

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
	
		System.out.println("Entrainement aux multiplications. Voici une multiplication :");
		System.out.println("Tu as droit a 3 essais");
		int premierNombre = unEntierAuHasardEntre (0, 10);
		int secondNombre = unEntierAuHasardEntre (0, 10);
		int entreeUtilisateur, nombreEssais = 3;

		do {
			System.out.print("Calculez : " + premierNombre + " x " + secondNombre + " = ");
			entreeUtilisateur = scanner.nextInt();

			if (entreeUtilisateur != premierNombre * secondNombre) {
				nombreEssais--;
				System.out.println("C'est faux! plus que " + nombreEssais + " essai(s)");
			}
		}while(entreeUtilisateur != premierNombre * secondNombre && nombreEssais > 0);

		if (nombreEssais == 0)
			System.out.println("Vous n'avez plus d'essais, la bonne réponse était: " + (premierNombre*secondNombre));
		else
			System.out.println("Bravo!");
	}

	public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
		double nombreReel;
		int resultat;

		nombreReel = Math.random();
		resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
		return resultat;
	}
	
}
