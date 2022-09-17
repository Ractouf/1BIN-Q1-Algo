
public class MotATrouver {
	
	private char[] motATrouver;   // le mot a trouver
	private char[] motACompleter; // le mot a completer
	
	
	/**
	 * au depart le mot a completer contient uniquement des '_'
	 * @param motATrouver
	 */
	public MotATrouver(String motATrouver) {
		this.motATrouver= motATrouver.toUpperCase().toCharArray();
		this.motACompleter = new char[motATrouver.length()];
		for (int i = 0; i < motACompleter.length; i++) {
			motACompleter[i] = '_';
		}		
	}

	/**
	 * renvoie une chaine de caracteres avec le mot a completer en mettant un espace entre chaque lettre
	 * @return le mot a completer pour affichage
	 */
	public String toString(){
		String motAAfficher ="";
		for (int i = 0; i < motACompleter.length; i++) {
			motAAfficher += " "+ motACompleter[i];
		}
		return motAAfficher;
	}
	
	/**
	 * verifie si le mot a completer ne contient plus de _
	 * @return true si le mot a ete entierement complete, false sinon
	 */
	public boolean estComplet() {
		for (char c : motACompleter) {
			if (c == '_') {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * ajoute la lettre dans le mot a completer autant de fois qu'il se trouve
	 * dans le mot a trouver en respectant leur position
	 * ex : mot a trouver COLIBRI - mot a completer  C_L_BR_ - lettre I -mot a completer -> C_LIBRI
	 * @param lettre la lettre a ajouter
	 * @return true si le mot a completer a ete modifie, false sinon
	 */
	public boolean completerMot(char lettre){
		lettre = Character.toUpperCase(lettre);
		boolean modifie = false;
		for (int i = 0; i < motACompleter.length; i++) {
			if (lettre == motATrouver[i] && motACompleter[i] != lettre){
				motACompleter[i] = lettre;
				modifie = true;
			}
		}
		return modifie;
	}
}
