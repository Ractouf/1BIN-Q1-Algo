/**
 *
 * @author Vandeputte François
 *
 */
public class Multiplication4 {
	
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Tu vas faire des multiplications de nombres compris entre 0 et 10");
		System.out.println("Tu peux choisir le nombre d'essais que tu auras pour chaque multiplication");
		System.out.println("Ce nombre sera le meme pour toutes les multiplications");
		System.out.println("Tu recevras la reponse, si tu ne l'as toujours pas trouvee au terme du nombre d'essais accorde");
		System.out.println("Apres chaque multiplication, le programme te demandera si tu en veux une autre");
		faireUneMultiplication();
	}

	/**
	 * Fait une multiplication en demandant le nombre d'essais et demande si encore un exercice
	 */
	public static void faireUneMultiplication(){
		int nombre1 = 0, nombre2 = 0, entree;
		System.out.print("Combien d'essais veux-tu par exercice? ");
		int boucle = scanner.nextInt(), nombreEssais = boucle;
		do {
			nombre1 = unEntierAuHasardEntre(0,10);
			nombre2 = unEntierAuHasardEntre(0,10);
			boucle = nombreEssais;
			do {
				System.out.println("Tu as " + boucle+ " essais");
				System.out.print(nombre1 + " * " + nombre2 + " = ");
				entree = scanner.nextInt();
				boucle --;
			}while (entree != nombre1 * nombre2 && boucle != 0);

			if (boucle == 0)
				System.out.println("La réponse était " + nombre1 * nombre2);

			System.out.print("Encore un exercice? (o/n) ");
		}while(Utilitaires.lireOouN() == 'o');
	}

	public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
		double nombreReel;
		int resultat;
		nombreReel = Math.random();
		resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
		return resultat;
	}
}
