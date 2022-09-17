/**
 *
 * @author Vandeputte François
 *
 */
public class DuelGuerriersAvecBoucliers {

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		//Au hasard qui commence
		int commencer = unEntierAuHasardEntre(1, 2);

		//FrappeFort
		int lancerDeFrappeFort = unEntierAuHasardEntre(1, 6);
		int vieFrappeFort = lancerDeFrappeFort;
		int forceDeFrappeFrappeFort = lancerDeFrappeFort;

		//CogneDur
		int lancerDeCogneDur = unEntierAuHasardEntre(1, 6);
		int vieCogneDur = lancerDeCogneDur;
		int forceDeFrappeCogneDur = lancerDeCogneDur;

		//boucliers
		int bouclierFrappeFort = unEntierAuHasardEntre(0, 1);
		int bouclierCogeDur = unEntierAuHasardEntre(0, 1);
		int vieBouclierFrappeFort = unEntierAuHasardEntre(1, 6);
		int vieBouclierCogneDur = unEntierAuHasardEntre(1, 6);

		//afficher bouclier frappefort
		if (bouclierFrappeFort == 0)
			vieBouclierFrappeFort = 0;
		else
			System.out.println("FrappeFort a obtenu un bouclier de: " + vieBouclierFrappeFort + " points de vie");

		//afficher bouclier cognedur
		if (bouclierCogeDur == 0)
			vieBouclierCogneDur = 0;
		else
			System.out.println("CogneDur a obtenu un bouclier de: " + vieBouclierCogneDur + " points de vie");

		//resultats
		int resultat1 = vieCogneDur + vieBouclierCogneDur - forceDeFrappeFrappeFort;
		int resultat2 = vieFrappeFort + vieBouclierFrappeFort - forceDeFrappeCogneDur;

		//afficher l'état des guerriers
		System.out.println("FrappeFort a " + vieFrappeFort + " points de vie avec un bouclier de " + vieBouclierFrappeFort);
		System.out.println("CogneDur a " + vieCogneDur + " points de vie avec un bouclier de " + vieBouclierCogneDur);

		if (commencer == 1) { //si frappefort commence
			System.out.println("FrappeFort commence!");
			if (resultat1 <= 0) { //si cognedur meurt
				System.out.println("FrappeFort inflige " + forceDeFrappeFrappeFort + " de dégâts a CogneDur");
				System.out.println("CogneDur a " + "0" + " points de vie");
				System.out.println("FrappeFort est vainqueur");
			}
			else { //si cognedur survit
				System.out.println("FrappeFort inflige " + forceDeFrappeFrappeFort + " de dégâts a CogneDur");
				System.out.println("CogneDur a " + resultat1 + " points de vie");
			}
			if (resultat2 <= 0) { //si frappefort meurt
				System.out.println("CogneDur inflige " + forceDeFrappeCogneDur + " de dégâts a FrappeFort");
				System.out.println("FrappeFort a " + "0" + " points de vie");
				System.out.println("CogneDur est vainqueur");
			}
			else { //si frappefort survit
				System.out.println("CogneDur inflige " + forceDeFrappeCogneDur + " de dégâts a FrappeFort");
				System.out.println("FrappeFort a " + resultat2 + " points de vie");
			}

		}
		else { //si cognedur commence
			System.out.println("CogneDur commence!");
			if (resultat2 <= 0) { //si frappefort meurt
				System.out.println("CogneDur inflige " + forceDeFrappeCogneDur + " de dégâts a FrappeFort");
				System.out.println("FrappeFort a " + "0" + " points de vie");
				System.out.println("CogneDur est vainqueur");
			}
			else { //si frappefort survit
				System.out.println("CogneDur inflige " + forceDeFrappeCogneDur + " de dégâts a FrappeFort");
				System.out.println("FrappeFort a " + resultat2 + " points de vie");
			}
			if (resultat1 <= 0) { //si cognedur meurt
				System.out.println("FrappeFort inflige " + forceDeFrappeFrappeFort + " de dégâts a CogneDur");
				System.out.println("CogneDur a " + "0" + " points de vie");
				System.out.println("FrappeFort est vainqueur");
			}
			else { //si frappefort meurt
				System.out.println("FrappeFort inflige " + forceDeFrappeFrappeFort + " de dégâts a CogneDur");
				System.out.println("CogneDur a " + resultat1 + " points de vie");
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
