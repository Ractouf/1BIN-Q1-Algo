/**
 *
 * @author Vandeputte François
 *
 */
public class DessinVentilateur {
    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {
        tortue.accelerer();
        for (int i = 0; i < 3; i++) {
            tortue.tournerADroite(120);
            for (int j = 0; j < 4; j++) {
                tortue.avancer(100);
                tortue.tournerADroite(90);
            }
        }
    }
}
