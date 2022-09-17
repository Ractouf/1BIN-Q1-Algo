/**
 *
 * @author Vandeputte François
 *
 */
public class DessinCarresEmboités {
    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {
        tortue.accelerer();
        int nombrePixelsAvancer = 110;
        for (int i = 0; i < 5; i++) {
            nombrePixelsAvancer = nombrePixelsAvancer - 10;
            for (int j = 0; j < 4; j++) {
                tortue.avancer(nombrePixelsAvancer);
                tortue.tournerADroite(90);
            }
        }
    }
}
