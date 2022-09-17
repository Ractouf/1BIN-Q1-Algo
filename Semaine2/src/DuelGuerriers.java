/**
 *
 * @author Vandeputte François, Guesmia Osmane
 *
 */
public class DuelGuerriers {

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// FrappeFort
		int lancerDe = unEntierAuHasardEntre(1, 6);
		int vieFrappeFort = lancerDe;
		int forceDeFrappeFrappeFort = lancerDe;

		//CogneDur
		int lancerDe2 = unEntierAuHasardEntre(1, 6);
		int vieCogneDur = lancerDe2;
		int forceDeFrappeCogneDur = lancerDe2;

		//resultats
		int resultat1 = vieCogneDur - forceDeFrappeFrappeFort;
		int resultat2 = vieFrappeFort - forceDeFrappeCogneDur;

		System.out.println("FrappeFort a " +vieFrappeFort + " points de vie");
		System.out.println("CogneDur a " + vieCogneDur + " points de vie");

		if(resultat1 <= 0) {
			System.out.println("FrappeFort inflige " + forceDeFrappeFrappeFort + " de dégâts a CogneDur");
			System.out.println("CogeDur a " + "0" + " points de vie");
			System.out.println("FrappeFort est vainqueur");
		}
			else{
			if (resultat2 <= 0)
				System.out.println("CogneDur inflige " + forceDeFrappeCogneDur + " de dégâts a FrappeFort");
				System.out.println("FrappeFort a " + "0" + " points de vie");
			    System.out.println("CogneDur est vainqueur");
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
