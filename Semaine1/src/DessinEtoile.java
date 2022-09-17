/**
 *
 * @author Vandeputte François
 *
 */
public class DessinEtoile {
    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {
        tortue.accelerer();
        for(int i=0; i<3; i++){
            tortue.avancer(100);
            tortue.tournerAGauche(120);
        }
        tortue.definirCouleur("NOIR");
        tortue.tournerAGauche(90);
        tortue.avancer(50);
        tortue.definirCouleur("BLANC");
        tortue.tournerADroite(90);
        for(int i=0; i<3; i++){
            tortue.avancer(100);
            tortue.tournerADroite(120);
        }
    }
}
