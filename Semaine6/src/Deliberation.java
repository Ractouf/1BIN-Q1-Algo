/**
 * Deliberation.java
 * @author Vandeputte François
 *
 */
public class Deliberation {
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		int nombreEtudiant = 25, totalMoyenneClasse = 0, moyenneClasse;
		for (int i = 1; i <= nombreEtudiant; i++) {
			System.out.println("Etudiant numero " + i);
			totalMoyenneClasse += moyenneUnEtudiant();
		}
		moyenneClasse = totalMoyenneClasse / nombreEtudiant;
		System.out.println(moyenneClasse);
	}

	/**
	 * lit les cotes, calcule et renvoie la moyenne d'un etudiant
	 * @return le resultat d'un etudiant
	*/
	public static double moyenneUnEtudiant() {
		double totalCotesEtudiant = 0;
		int nombreCotes = 10;
		for (int j = 0; j < nombreCotes; j++) {
			System.out.print("Entrez une cote (sur 20) : ");
			totalCotesEtudiant += Utilitaires.lireReelComprisEntre(0,20);
		}
		return totalCotesEtudiant / nombreCotes;
	}

}
