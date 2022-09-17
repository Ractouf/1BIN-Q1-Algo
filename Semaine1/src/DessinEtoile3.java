/**
 * @author Vandeputte François
 */
public class DessinEtoile3 {
    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {
        tortue.accelerer();
        tortue.definirCouleur("NOIR");
        tortue.tournerAGauche(18);
        tortue.avancer(100);
        tortue.definirCouleur("BLANC");
        for (int i = 0; i < 2; i++) {
            tortue.tournerADroite(90);
            tortue.avancer(100);
        }
        for (int i = 0; i < 4; i++) {
            tortue.tournerAGauche(18);
            tortue.avancer(100);
            tortue.tournerADroite(90);
            tortue.avancer(100);
        }
        tortue.tournerADroite(72);
        tortue.avancer(100);

    }
}
