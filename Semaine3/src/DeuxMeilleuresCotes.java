/**
 *
 * @author Vandeputte François
 *
 */
public class DeuxMeilleuresCotes {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int coteMax = 0;
        int coteMax2 = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Cote de l'examen " + i + ": ");
            int coteExamen = scanner.nextInt();

            if (coteExamen > coteMax) {
                coteMax2 = coteMax;
                coteMax = coteExamen;
            } else
                if (coteExamen > coteMax2)
                coteMax2 = coteExamen;
        }
        System.out.println("Les deux meilleures cotes sont: " + coteMax + " et " + coteMax2);
    }
}
