
public class TestPersoNoirJauneRouge {
	
	public static void main(String [] args){
		
		NoirJauneRouge njr = new NoirJauneRouge();
		njr.ajouter("nico", 'n');
		System.out.println(njr.toString());
		njr.ajouter("rene", 'j');
		System.out.println(njr.toString());
		njr.ajouter("noel", 'r');
		System.out.println(njr.toString());
		System.out.println();
		System.out.println();
		
		System.out.println("A completer a votre guise!");
	}
}
