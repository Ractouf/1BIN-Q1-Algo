import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Vandeputte François
 *
 */
public class StatistiquesTemperatures {
	
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);
	public static Temperatures temperatures;
	
	public static void main(String[] args) {
		
		chargerTemperatures();
		System.out.println(temperatures.toString());
		
		System.out.println("*****************************");
		System.out.println("Temperatures : statistiques :");
		System.out.println("*****************************");
		int choix;
		do{
			System.out.println();
			System.out.println("1 -> afficher toutes les temperatures");	
			System.out.println("2 -> calculer la moyenne");
			System.out.println("3 -> température la plus haute");
			System.out.println("4 -> température la plus basse");
			System.out.println("5 -> nombre de jours de gel");
			System.out.println("6 -> les jours de gel");
			System.out.println("7 -> toutes les teperatures positives");
			System.out.println("8 -> contient au moins un jour de gel");
			System.out.println();
			System.out.print("Entrez votre choix : ");	
			choix=scanner.nextInt();
			switch(choix){	
			case 1: afficherTout();   
			break;
			case 2: afficherMoyenne();   
			break;
			case 3: afficherTemperatureMax();
			break;
			case 4: afficherTemperatureMin();
			break;
			case 5: afficherNombreJoursDeGel();
			break;
			case 6: afficherJoursDeGel();
			break;
			case 7: afficherToutesPositives();
			break;
			case 8: afficherContientJourDeGel();
			break;
			}
		}while(choix >=1 && choix<=8);
	}
	
	private static void afficherTout() {
		System.out.println(temperatures.toString());
	}
	private static void afficherMoyenne() {
		System.out.println("La moyenne est: " + temperatures.moyenne());
	}
	private static void chargerTemperatures(){
		double[]tableTemperatures = {-1,1,0,1,-1,-3,-3,-2,0,-1,0,1,1,3,5,4,2,0,1,1,5,3,2,0,-1,0,1,1,3,4,5};
		temperatures = new Temperatures("janvier",tableTemperatures);
	}
	private static void afficherTemperatureMax(){
		System.out.println("La température la plus haute est: " + temperatures.temperatureMax());
	}
	private static void afficherTemperatureMin(){
		System.out.println("La température la plus basse est: " + temperatures.temperatureMin());
	}
	private static void afficherNombreJoursDeGel(){
		System.out.println("Le nombre de jours de gel est: " + temperatures.nombreJoursDeGel());
	}
	private static void afficherJoursDeGel(){
		System.out.println("Les jours de gel: " + Arrays.toString(temperatures.joursDeGel()));
	}
	private static void afficherToutesPositives(){
		System.out.println("Toutes les temperatures sont positives: " + temperatures.toutesPositives());
	}
	public static void afficherContientJourDeGel(){
		System.out.println("Il y a au moins un jour de gel: " + temperatures.contientAuMoinsUnJourDeGel());
	}
	public static void afficherTable(int[]table){
		System.out.println(Arrays.toString(table));
	}
	
}
