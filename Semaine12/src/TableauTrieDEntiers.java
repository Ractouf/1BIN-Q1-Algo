/**
 *
 * @author Vandeputte François
 *
 */
public class TableauTrieDEntiers{

	private int [] tableDEntiers;  // table d'entiers triee par ordre croissant
	private int nombreDEntiers;    // nombre d'entiers dans tableDEntiers
	private static final int TAILLE = 10;

	public TableauTrieDEntiers(){
		this.tableDEntiers = new int[TAILLE];
		this.nombreDEntiers = 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TableauTrieDEntiers t = (TableauTrieDEntiers)obj;
		if (t.nombreDEntiers!=this.nombreDEntiers)
			return false;
		for (int i = 0; i < nombreDEntiers;i++)		
			if (this.tableDEntiers[i]!=t.tableDEntiers[i]) 
				return false;
		return true;
	}

	public String toString(){
		String aRenvoyer = "\n nombreDEntiers : " + this.nombreDEntiers;
		aRenvoyer += "   tableDEntiers : ";
		for (int i = 0; i < this.nombreDEntiers; i++) {
			aRenvoyer += this.tableDEntiers[i]+" ";
		}
		return aRenvoyer;
	}
	
	/**
	 * constructeur par recopie
	 * ce constructeur leve une exception si la table passee en parametre contient plus de 10 entiers
	 * utile pour les tests et/ou si elle n'est pas triee
	 * @param tableARecopier une table triee d'au plus TAILLE entiers triee par ordre croissant
	 */
	public TableauTrieDEntiers(int[] tableARecopier){
		if (tableARecopier.length>TAILLE) 
			throw new IllegalArgumentException();
		this.nombreDEntiers = tableARecopier.length;
		tableDEntiers= new int[TAILLE];
		if(tableARecopier.length!=0)
			tableDEntiers[0] = tableARecopier[0];
		for (int i = 1; i<nombreDEntiers; i++){
			if(tableARecopier[i]<tableARecopier[i-1]){
				throw new IllegalArgumentException();
			}
			tableDEntiers[i] = tableARecopier[i];
		}     	
	}

	public int getNombreDEntiers(){
		return this.nombreDEntiers;
	}

	/** 
	 * methode qui ajoute un entier si la table n'est pas encore pleine.
	 * La table doit rester triee!
	 * @param entier l'entier a ajouter
	 * @return boolean signale si l'entier a pu etre ajoute
	 */
	public boolean ajouterUnEntier(int entier){
		if (nombreDEntiers == tableDEntiers.length)
			return false;

		tableDEntiers[nombreDEntiers] = entier;
		for (int i = nombreDEntiers; i > 0; i--) {
			int temp = 0;

			if (tableDEntiers[i - 1] < entier)
				break;

			temp = tableDEntiers[i];
			tableDEntiers[i] = tableDEntiers[i - 1];
			tableDEntiers[i - 1] = temp;

		}
		nombreDEntiers ++;
		return true;
	}

	/**
	 * methode qui recherche l'indice correspondant a la premiere occurrence de l'entier passe en parametre
	 * @param entier l'entier recherche
	 * @return indice correspondant a l'entier, -1 s'il n'est pas dans la table
	 */
	private int trouverIndiceLineaire(int entier){
		for (int i = 0; i < nombreDEntiers; i++) {
			if (tableDEntiers[i] == entier)
				return i;
			if (tableDEntiers[i] > entier)
				break;
		}
		return -1;
	}
	
	/**
	 * methode qui recherche l'indice correspondant a une occurrence (pas necessairement la premiere)
	 * de l'entier passe en parametre
	 * @param entier l'entier recherche
	 * @return indice correspondant a unEntier, -1 s'il n'est pas dans la table
	 */
	private int trouverIndiceDicho(int entier){
		int indiceMax = nombreDEntiers - 1;
		int indiceMin = 0;

		while (indiceMin <= indiceMax) {
			int	indiceTemp = (indiceMin + indiceMax) / 2;

			if (tableDEntiers[indiceTemp] == entier)
				return indiceTemp;

			if (tableDEntiers[indiceTemp] < entier)
				indiceMin = indiceTemp + 1;
			else
				indiceMax = indiceTemp - 1;
		}
		return -1;
	}

	/** 
	 * methode qui verifie si la table contient l'entier passe en parametre
	 * @param entier l'entier recherche
	 * @return boolean true si l'entier est present dans la table, false sinon
	 */
	public boolean contient(int entier){
		return trouverIndiceDicho(entier) != -1;
	}  

	/** 
	 * methode qui supprime une occurrence de l'entier passe en parametre.
	 * La table doit rester triee!
	 * @param entier l'entier a supprimer
	 * @return boolean signale si l'entier a pu etre supprime
	 */
	public boolean supprimerUneOccurrence(int entier){
		int indice = trouverIndiceDicho(entier);

		if (indice == -1)
			return false;

		for (int i = indice; i < nombreDEntiers - 1; i++) {
			tableDEntiers[i] = tableDEntiers[i + 1];
		}
		nombreDEntiers --;
		return true;
	} 

	/** 
	 * methode qui supprime toutes les occurrences d'un entier
	 * @param entier l'entier a supprimer
	 * @return int le nombre de suppressions effectuees
	 */
	public int supprimerToutesLesOccurrences(int entier){
		int nombreSuppressions = 0;

		for (int i = 0; i < nombreDEntiers; i++) {
			if (entier == tableDEntiers[i])
				nombreSuppressions++;
			else
				tableDEntiers[i - nombreSuppressions] = tableDEntiers[i];
		}

		nombreDEntiers -= nombreSuppressions;
		return nombreSuppressions;
	}

	/** 
	 * methode qui verifie si la table contient des ex-aequos
	 * @return boolean true si la table contient des ex-aequos, false sinon
	 */
	public boolean contientExAequo(){
		for (int i = 1; i < nombreDEntiers; i++) {
			if (tableDEntiers[i] == tableDEntiers[i - 1])
				return true;
		}
		return false;
	}

	/** 
	 * methode qui supprime tous les ex-aequos
	 * @return int le nombre de suppressions effectuees
	 */
	public int supprimerTousLesExAequos(){
		int nombreSupressions = 0;
		for (int i = 1; i < nombreDEntiers; i++) {
			if (tableDEntiers[i] == tableDEntiers[i - 1])
				nombreSupressions ++;
			else
				tableDEntiers[i - nombreSupressions] = tableDEntiers[i];
		}
		nombreDEntiers -= nombreSupressions;
		return nombreSupressions;
		// Il est possible d'ecrire cette methode en un seul passage dans la boucle
		// Inspirez vous de la solution de la methode supprimerTousLesParticipants()
		// qui vous a ete donnee au cours theorique de la semaine derniere
		// Cette solution se trouve sur moovin !

	}

	/**
	 * supprime tous les entiers compris entre borneInf et borneSup (bornes comprises)
	 * si borneInf est > que borneSup, il faut inverser les bornes
	 * @param borneInf l'entier le plus petit a supprimer
	 * @param borneSup l'entier le plus grand a supprimer
	 * @return le nombre de suppressions effectuees
	 */
	public int supprimerEntre(int borneInf, int borneSup) {
		int nombreSupressions = 0;
		for (int i = 0; i < nombreDEntiers; i++) {
			if (tableDEntiers[i] >= borneInf && tableDEntiers[i] <= borneSup)
				nombreSupressions ++;
			else
				tableDEntiers[i - nombreSupressions] = tableDEntiers[i];
		}
		nombreDEntiers -= nombreSupressions;
		return nombreSupressions;
		//ex supplementaire
		//essayez de faire cet exercice apres avoir termine tous les exercices obligatoires
	}

}