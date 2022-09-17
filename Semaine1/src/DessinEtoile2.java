/**
 *
 * @author Vandeputte François
 *
 */
public class DessinEtoile2 {
    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {
        tortue.accelerer();
        tortue.definirCouleur("NOIR");
        tortue.tournerAGauche(90);
        tortue.avancer(100);
        tortue.tournerADroite(150);
        tortue.definirCouleur("BLANC");
        for(int i=0; i<6; i++){
            tortue.avancer(75);
            tortue.tournerAGauche(60);
            tortue.avancer(75);
            tortue.tournerADroite(120);
        }
    }
}
