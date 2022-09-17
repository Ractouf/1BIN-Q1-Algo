/**
 *
 * @author Vandeputte François
 *
 */
public class Multiplication1{

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Tu vas faire 5 multiplications");
		System.out.println("La valeur minimale des nombres a multiplier est 0, la valeur maximale est 10");
		System.out.println("Pour chaque multiplication, tu as droit a 1 essai");
		System.out.println("Tu recevras la reponse, si tu la rate");
		System.out.println("A la fin, le programme affichera le nombre de bonnes reponses.");
		faireUneMultiplication();
	}

	/**
	 * Fait une multiplication
	 */
	public static void faireUneMultiplication(){
		int nombre1 = 0, nombre2 = 0, entree;
		for (int i = 0; i < 5; i++) {
			nombre1 = unEntierAuHasardEntre(0,10);
			nombre2 = unEntierAuHasardEntre(0,10);
			System.out.print(nombre1 + " * " + nombre2 + " = ");
			entree = scanner.nextInt();
			if (entree != nombre1 * nombre2) {
				System.out.println("Raté!");
				break;
			}
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