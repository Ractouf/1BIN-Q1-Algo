
/**
 * Repr�sente une grille de Sudoku d'une taille (presque) quelconque
 * 
 * @author gregory.seront
 *
 */
public class SudokuGeneral {
	
	private int tailleCote;
	private int tailleRegion;
	private int [] [] grille; // Les case non remplies sont repr�sent�es par des 0
	
	/**
	 * Constructeur par copie. 
	 * Cr�e un nouvel objet en faisant une copie profonde de la grille
	 * pass�e en param�tre.
	 * Il d�duit �galementla taille des c�t�s du carr� ainsi que la
	 * taille des c�t�s des r�gions.
	 * Notez que la taille des c�t�s corresponds au nombre de symboles
	 * diff�rents que l'on utilise dans la grille
	 * 
	 * NE PAS MODIFIER, utilis� pour les tests
	 * 
	 * @param grille grille qui sera recopi�e.
	 * 
	 * Pr�conditions: le tableau grille dans �tre un carr� et la racine carr�
	 * de la taille du cot� doit �tre un nombre entier (ex: 9, 16, 25, 36, ...)
	 * Ce constructeur ne v�rifie pas ces pr�conditions, on suppose qu'elles sont correctes.
	 */
	public SudokuGeneral(int[][] grille) {
		this.tailleCote = grille.length; 
		this.tailleRegion = (int)Math.sqrt(tailleCote);
		this.grille = new int [tailleCote][tailleCote];
		for (int i=0; i<tailleCote; i++) {
			for (int j=0; j<tailleCote; j++) {
				this.grille[i][j] = grille[i][j];
			}
		}
	}
	
	/**
	 * V�rifie que si l'on mets le nombre 'nombre' � la position i, j
	 * La grille de sudoku reste l�gale. 
	 * Cela doit se faire sans parcourir toute la grille!
	 * 
	 * @param i ligne du coup. Les lignes sont num�rot�es � partir de 0
	 * @param j colonne du coup. Les colonnes sont num�rot�es � partir de 0
	 * @param nombre nombre que l'on veut placer dans la grille
	 * @return true si le coup est l�gal (voir �nonc�), false sinon
	 */
	public boolean isCoupLegal(int i, int j, int nombre) {
		int ancienneValeur = grille[i][j];
		grille[i][j] = nombre;
		int coinRegion1 = i - (i % tailleRegion);
		int coinRegion2 = j - (j % tailleRegion);

		if (isLigneLegale(i) && isColonneLegale(j) && isRegionLegale(coinRegion1,coinRegion2))
			return true;
		grille[i][j] = ancienneValeur;
		return false;
	}
	
	/**
	 * V�rifie que la ligne contient au plus une fois chaque
	 * symbole, � l'exception du 0.
	 * On ne v�rifie pas qu'il existe des symboles non attendus
	 * ( <0 ou >tailleCote)
	 * @param i num�ro de la ligne
	 * @return true si la ligne est l�gale, false sinon
	 */
	boolean isLigneLegale(int i) {
		int[] tableFrequences = new int[tailleCote + 1];

		for (int j = 0; j < tailleCote; j++) {
			 tableFrequences[grille[i][j]] ++;
		}
		for (int j = 1; j < tableFrequences.length - 1; j++) {
			if (tableFrequences[j] > 1)
				return false;
		}
		return true;
	}

	/**
	 * V�rifie que la colonne contient au plus une fois chaque
	 * symbole, � l'exception du 0.
	 * On ne v�rifie pas qu'il existe des symboles non attendus
	 * ( <0 ou >tailleCote)
	 * @param j num�ro de la colonne
	 * @return true si la colonne est l�gale, false sinon
	 */	
	boolean isColonneLegale(int j) {
		int[] tableFrequences = new int[tailleCote + 1];

		for (int i = 0; i < tailleCote; i++) {
			tableFrequences[grille[i][j]] ++;
		}
		for (int i = 1; i < tableFrequences.length - 1; i++) {
			if (tableFrequences[i] > 1)
				return false;
		}
		return true;
	}
	
	
	/**
	 * V�rifie que la r�gion contient au plus une fois chaque
	 * symbole, � l'exception du 0.
	 * On ne v�rifie pas qu'il existe des symboles non attendus
	 * ( <0 ou >tailleCote)
	 *
	 * @param i num�ro de ligne du coin sup�rieur gauche de la r�gion
	 * @param j num�ro de colonne du coin sup�rieur gauche de la r�gion
	 * @return true si la r�gion est l�gale, false sinon
	 */
	boolean isRegionLegale(int i, int j) {
		int[] tableFrequences = new int[tailleCote + 1];

		for (int k = 0; k < tailleRegion; k++) {
			for (int l = 0; l < tailleRegion; l++) {
				tableFrequences[grille[k][l]] ++;
			}
		}
		for (int k = 1; k < tailleCote - 1; k++) {
			if (tableFrequences[k] > 1)
				return false;
		}
		return true;
	}
	
	/**
	 * V�rifie que toutes les lignes, colonnes et r�gions
	 * de la grille sont l�gales
	 * @return true si la grille est l�gale
	 */
	boolean isGrilleLegale() {
		for (int i = 0; i < tailleCote; i++) {
			if (!isColonneLegale(i) && !isLigneLegale(i))
				return false;
		}

		for (int i = 0; i < tailleCote; i += tailleRegion) {
			for (int j = 0; j < tailleCote; j += tailleRegion) {
				if (!isRegionLegale(i,j))
					return false;
			}
		}
		return true;
	}
	
	
}
