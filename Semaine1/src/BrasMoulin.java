public class BrasMoulin {
    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {
        tortue.accelerer();

        tortue.tournerAGauche(45);
        for (int i = 0; i < 4; i++) {
            tortue.avancer(10);
            tortue.tournerADroite(90);

            for (int j = 0; j < 4; j++) {

            }
        }
    }
}
