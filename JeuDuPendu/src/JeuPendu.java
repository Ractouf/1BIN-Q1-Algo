
public class JeuPendu {

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args){

		System.out.print("Entrez le mot a trouver : ");
		String motATrouver = scanner.nextLine();

		FenetrePendu fenetrePendu = new FenetrePendu();
		MotATrouver mot = new MotATrouver(motATrouver);

		int nbreMorceauxPendu=0;
		fenetrePendu.afficherMot(mot.toString());

		do {
			//choisir lettre
			fenetrePendu.afficherInformation("Entrez une lettre");
			char lettre = fenetrePendu.lireLettre();

			//si lettre inserée juste
			if (mot.completerMot(lettre)) {
				fenetrePendu.afficherMot(mot.toString());
			}

			//si lettre est faux
			else{
				nbreMorceauxPendu++;
				fenetrePendu.afficherPendu(nbreMorceauxPendu);
			}
		}while (nbreMorceauxPendu < 6 && !mot.estComplet());

		fenetrePendu.afficherInformation("fin du jeu");
	}
}
