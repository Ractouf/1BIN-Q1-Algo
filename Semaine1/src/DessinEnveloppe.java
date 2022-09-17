/**
 *
 * @author Vandeputte François
 *
 */

public class DessinEnveloppe {
    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {
        for(int i=0; i<4; i++){
            tortue.avancer(100);
            tortue.tournerADroite(90);
        }
        for(int i=0; i<3; i++){
            tortue.avancer(100);
            tortue.tournerADroite(120);
        }
    }
}
