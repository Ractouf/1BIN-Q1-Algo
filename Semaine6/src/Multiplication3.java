/**
 *
 * @author Vandeputte François
 *
 */
public class Multiplication3 {
	
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Tu vas faire 5 multiplications");
		System.out.println("Au depart la valeur minimale des nombres a multiplier est 1 et la valeur maximale est 10");
		System.out.println("Ces 2 bornes augmenteront de 10 a chaque multiplication reussie");
		System.out.println("Pour chaque multiplication, tu as droit a 1 essai");
		System.out.println("Tu recevras la reponse, si tu la rate");
		faireUneMultiplication();
	}

	/**
	 * Fait une multiplication et augmente le min et le max
	 */
	public static void faireUneMultiplication(){
		int min = 1, max = 10, nombre1 = 0, nombre2 = 0;
		for (int i = 0; i < 5; i++) {
			nombre1 = unEntierAuHasardEntre(min,max);
			nombre2 = unEntierAuHasardEntre(min,max);
			System.out.print(nombre1 + " * " + nombre2 + " = ");
			int entree = scanner.nextInt();
			if (entree == nombre1 * nombre2){
				min	+= 10;
				max += 10;
			}
			if (entree != nombre1 * nombre2){
				System.out.print("Raté!\nLa réponse est: " + nombre1 * nombre2);
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
