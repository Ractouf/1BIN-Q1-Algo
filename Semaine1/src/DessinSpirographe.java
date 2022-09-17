/**
 *
 * @author Vandeputte François
 *
 */
public class DessinSpirographe {
    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {
        tortue.accelerer();
        for (int i = 0; i < 36; i++) {
            for (int j = 0; j < 360; j++) {
                tortue.avancer(1);
                tortue.tournerADroite(1);
            }
            tortue.tournerADroite(10);
        }
    }
}
