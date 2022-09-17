/**
 *
 * @author Vandeputte François
 *
 */
public class DessinCarresEmboites {
    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {
        tortue.accelerer();
        int longueur = 100;
        for (int i = 0; i < 5; i++) {
            tortue.dessinerUnCarre(longueur);
            longueur -= 10;
        }

    }
}
