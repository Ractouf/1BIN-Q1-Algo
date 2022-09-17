import java.util.Arrays;
/**
 *
 * @author Vandeputte François
 *
 */
public class Temperatures {

	private String mois;
	private double[] tableDesTemperatures;
	
	// A NE PAS MODIFIER
	public Temperatures(String mois, double [] tableARecopier) {
		if(tableARecopier == null)
			throw new IllegalArgumentException();
		if(tableARecopier.length == 0)
			throw new IllegalArgumentException();
		this.mois = mois;
		this.tableDesTemperatures = new double[tableARecopier.length];
		for (int i = 0; i < tableARecopier.length; i++) {
			this.tableDesTemperatures[i]=tableARecopier[i];
		}
	}

	// A NE PAS MODIFIER
	public String toString(){
		String aRenvoyer = "temperatures du mois de " + this.mois + " : \n";
		return aRenvoyer + Arrays.toString(tableDesTemperatures);
	}


	/**
	 * calcule la moyenne des temperatures
	 * @return la moyenne
	 */
	public double moyenne(){
		double somme = 0;
		for (double tableDesTemperature : tableDesTemperatures) {
			somme += tableDesTemperature;
		}
		return somme / tableDesTemperatures.length;
	}


	/**
	 * recherche la temperature la plus basse
	 * precondition (a ne pas verifier) la table des temperatures est non vide
	 * @return la temperature la plus basse
	 */
	public double temperatureMin(){
		double min = tableDesTemperatures[0]; //Double.MAX_VALUE;
		for (int i = 1; i < tableDesTemperatures.length; i++) {
			if (tableDesTemperatures[i] < min)
				min = tableDesTemperatures[i];
		}
		return min;
	}


	/**
	 * calcule le nombre de temperatures negatives (< 0)
	 * @return le nombre de jours de gel
	 */
	public int nombreJoursDeGel(){
		int joursDeGel = 0;
		for (double tableDesTemperature : tableDesTemperatures) {
			if (tableDesTemperature < 0)
				joursDeGel++;
		}
		return joursDeGel;
	}


	/**
	 * remplit une table avec les numeros des jours de gel
	 * @return une table avec les jours de gel, la dimension de cette table correspond a ce nombre de jours
	 */
	public int[] joursDeGel(){
		int j = 0;
		int[] tableJoursDeGel = new int[nombreJoursDeGel()];
		for (int i = 0; i < tableDesTemperatures.length; i++) {
			if (tableDesTemperatures[i] < 0) {
				tableJoursDeGel[j] = i + 1;
				j ++;
			}
		}
		return tableJoursDeGel;
	}


	/**
	 * verifie si toutes les temperatures sont positives
	 * @return true si toutes les temperatures sont positives, false sinon
	 */
	public boolean toutesPositives(){
		for (double tableDesTemperature : tableDesTemperatures) {
			if (tableDesTemperature <= 0)
				return false;
		}
		return true;
	}


	/**
	 * verifie la presence d'au moins une temperature negative (<0)
	 * @return true si la table contient au moins une temperature negative, false sinon
	 */
	public boolean contientAuMoinsUnJourDeGel(){
		return !toutesPositives();
	}


	/**
	 * verifie la presence d'au moins une temperature superieure a la temperature passee en parametre
	 * @param temperature la temperature qui sert a cette recherche
	 * @return true si la table contient au moins une temperature superieure a temperature, false sinon
	 */
	public boolean contientAuMoinsUneTemperatureSuperieureA(double temperature){
		//TODO
		// Ex supplementaire
		return false;
	}


	/**
	 * recherche la temperature la plus elevee
	 * precondition (a ne pas verifier) la table des temperatures est non vide
	 * @return la temperature la plus elevee
	 */
	public double temperatureMax(){
		double max = -90000;
		for (double tableDesTemperature : tableDesTemperatures) {
			if (tableDesTemperature > max)
				max = tableDesTemperature;
		}
		return max;
	}


	/**
	 * remplit une table avec les numeros des jours correspondant a la temperature la plus elevee
	 * @return une table avec les jours de haute temperature, la dimension de cette table correspond à ce nombre de jours
	 */
	public int[] joursMax(){
		// TODO
		// Ex supplementaire
		return null;
	}





	/**
	 * remplit une table avec les numeros des jours correspondant a la temperature la plus basse
	 * @return une table avec les jours de basse temperature, la dimension de cette table correspond à ce nombre de jours
	 */
	public int[] joursMin(){

		//TODO
		// Ex supplementaire
		// Suggestion : introduisez la methode nombreJours(double temperature)
		// Les methodes joursDeGel(), joursMax() peuvent aussi utiliser cette methode
		//
		return null;
	}

}
