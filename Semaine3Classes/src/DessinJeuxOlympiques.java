/**
 *
 * @author Vandeputte François
 *
 */
public class DessinJeuxOlympiques {
    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {
        tortue.accelerer();
        //1er cercle
        for (int i = 0; i < 450; i++) {
            tortue.avancer(1);
            tortue.tournerAGauche(1);
        }
        //2 fois 2 cercles
        for (int j = 0; j < 2; j++) {

            tortue.tournerADroite(90);
            tortue.definirCouleur("noir");
            tortue.avancer(5);
            tortue.definirCouleur("blanc");
            //cercle
            for (int i = 0; i < 450; i++) {
                tortue.avancer(1);
                tortue.tournerADroite(1);
            }
            //déplacement
            tortue.tournerAGauche(90);
            tortue.definirCouleur("noir");
            tortue.avancer(5);
            tortue.definirCouleur("blanc");
            //cercle
            for (int i = 0; i < 450; i++) {
                tortue.avancer(1);
                tortue.tournerAGauche(1);
            }
        }
    }
}
