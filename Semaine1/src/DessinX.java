/**
 *
 * @author Vandeputte François
 *
 */
public class DessinX {
    public static Tortue tortue = new Tortue();

    public static void main(String args[]) {
       tortue.tournerAGauche(60);
       tortue.avancer(100);
       tortue.tournerADroite(180);
       tortue.avancer(200);
       tortue.tournerADroite(150);
       tortue.definirCouleur("NOIR");
       tortue.avancer(180);
       tortue.definirCouleur("BLANC");
       tortue.tournerADroite(150);
       tortue.avancer(200);
    }
}
