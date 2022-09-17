/**
 *
 * @author Vandeputte François
 *
 */
public class DessinCube3D {
    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {
        tortue.accelerer();
        for (int i = 0; i < 4; i++) {
            tortue.avancer(100);
            tortue.tournerADroite(90);
        }
        tortue.tournerAGauche(45);
        tortue.avancer(50);
        tortue.tournerADroite(135);
        tortue.avancer(100);
    }
}
