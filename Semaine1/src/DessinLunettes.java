/**
 *
 * @author Vandeputte François
 *
 */
public class DessinLunettes {
    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {
        tortue.accelerer();
        for(int i=0; i<4; i++){
            tortue.avancer(100);
            tortue.tournerADroite(90);
        }
        tortue.tournerAGauche(180);
        tortue.avancer(50);
        for(int i=0; i<4; i++){
            tortue.avancer(100);
            tortue.tournerAGauche(90);
        }
    }
}
