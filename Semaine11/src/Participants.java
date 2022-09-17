/**
 *
 * @author Vandeputte François
 *
 */
public class Participants {
	private String[] tableParticipants;
	private int nombreInscrits = 0; 	// taille logique

	// Les nombreInscrits participants occupent les nombreInscrits premieres
	// cases du tableau!

	public Participants(int nombreMaxParticipants) {
		if (nombreMaxParticipants < 1)
			throw new IllegalArgumentException();
		this.tableParticipants = new String[nombreMaxParticipants];

		this.nombreInscrits = 0;
	}

	/**
	 * Construit un objet Participants en copiant tous les participants a partir
	 * de la table passee en parametre.
	 * @param tableARecopier table contenant les participants a ajouter
	 */
	public Participants(int nombreParticipants, String[] tableARecopier) {
		// A NE PAS MODIFIER
		// VA SERVIR POUR LES TESTS
		if (tableARecopier == null)
			throw new IllegalArgumentException();
		if (nombreParticipants < 1)
			throw new IllegalArgumentException();
		if (nombreParticipants < tableARecopier.length)
			throw new IllegalArgumentException();
		this.tableParticipants = new String[nombreParticipants];
		this.nombreInscrits = tableARecopier.length;
		for (int i = 0; i < nombreInscrits; i++)
			this.tableParticipants[i] = tableARecopier[i];
	}

	public String toString() {
		// A NE PAS MODIFIER
		// VA SERVIR POUR LES TESTS
		if (this.nombreInscrits == 0)
			return "aucun inscrit";
		String aRenvoyer = "\nLes inscrits :";
		for (int i = 0; i < nombreInscrits; i++)
			aRenvoyer = aRenvoyer + "\n    " + this.tableParticipants[i];
		return aRenvoyer;
	}

	/**
	 * renvoie le nombre de participants actuellement inscrits
	 * @return le nombre de participants actuellement inscrits
	 */
	public int getNombreInscrits() {
		return this.nombreInscrits;
	}


	/**
	 * ajoute un participant a l'index passe en parametre
	 * @param index l'indice de la table ou il faut ajouter le participant
	 * @param participant le participant a ajouter
	 * @return false si le nombre maximum de participants est atteint, true sinon
	 * @throws IllegalArgumentException si l'index est invalide
	 */
	public boolean ajouterParticipant(int index,String participant) {
		if(index < 0 || index > nombreInscrits)
			throw new IllegalArgumentException();

		if (nombreInscrits == tableParticipants.length)
			return false;

		for (int i = nombreInscrits - 1; i >= index ; i--) {
			tableParticipants[i + 1] = tableParticipants[i];
		}
		tableParticipants[index] = participant;
		nombreInscrits ++;
		return true;
	}

	/**
	 * ajoute un participant a la fin de la table des participants. On peut retrouver
	 * plusieurs fois le meme nom.
	 * @param participant le participant a ajouter
	 * @return false si le nombre maximum de participants est atteint, true sinon
	 */
	public boolean ajouterParticipant(String participant) {
		if (nombreInscrits == tableParticipants.length)
			return false;
		tableParticipants[nombreInscrits] = participant;
		nombreInscrits ++;
		return true;
	}

	/**
	 * renvoie le participant qui se trouve dans la table a l'indice passe en parametre
	 * @param index l'indice du participant recherche
	 * @return le participant recherche
	 * @throws IllegalArgumentException si l'indice est invalide
	 */
	public String getIndex(int index){
		if (index < 0 || index > nombreInscrits - 1)
			throw new IllegalArgumentException();
		return tableParticipants[index];
	}

	/**
	 * recherche l'indice de la case de la table qui contient le participant passe en parametre
	 * @param participant le participant recherche
	 * @return l'indice du participant ou -1 si le participant n'est pas dans la table
	 */
	public int donnerIndex(String participant){
		for (int i = 0; i < nombreInscrits; i++) {
			if (participant.equals(tableParticipants[i]))
				return i;
		}
		return -1;
	}

	/**
	 * verifie l'existence du participant passe en parametre
	 * @param participant le participant recherche
	 * @return true si le participant est present dans la table, false sinon
	 */
	public boolean contient(String participant){
		return donnerIndex(participant) != -1;
	}

	/**
	 * supprime le participant qui se trouve dans la table a l'indice passe en parametre
	 * @param index l'indice du participant a supprimer
	 * @throws IllegalArgumentException si l'indice est invalide
	 */
	public void supprimerParticipant(int index) {
		if (index < 0 || index > nombreInscrits - 1)
			throw new IllegalArgumentException();

		for (int i = index; i < nombreInscrits - 1; i++) {
			tableParticipants[i] = tableParticipants[i + 1];
		}
		nombreInscrits --;
	}

	/**
	 * supprime le participant passe en parametre
	 * Si le nom se trouve plusieurs fois, seule sa première occurrence est supprimee
	 * @param participant Le participant a supprimer
	 * @return false si la suppression n'a pas pu etre faite car la table ne
	 *         contient pas le participant, true sinon
	 */
	public boolean supprimerParticipant(String participant) {
		int index = donnerIndex(participant);
		if (index == -1)
			return false;
		supprimerParticipant(index);
		return true;
	}

	/**
	 * supprime tous les participants qui ont comme nom, celui passe en parametre
	 * @param participant le nom des participants a supprimer
	 * @return le nombre de participants supprimes
	 */
	public int supprimerTousLesParticipants(String participant) {
		int nombreSuppressions = 0;

		for (int i = 0; i < nombreInscrits; i++) {
			if (participant.equals(tableParticipants[i]))
				nombreSuppressions ++;
			else
				tableParticipants[i - nombreSuppressions] = tableParticipants[i];
		}

		nombreInscrits -= nombreSuppressions;
		return nombreSuppressions;
	}


}