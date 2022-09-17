/**
 *
 * @author Vandeputte François
 *
 */
public class CalculMoyenne {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        char encoreUneCote;
        double cotes, moyenne, sommeCotes = 0;
        int nombreCotes = 0;

        do {
            System.out.print("Introduisez une cote: ");
            cotes = scanner.nextDouble();
            System.out.println("Avez vous une autre cote? Y/N");
            encoreUneCote = scanner.next().charAt(0);

            sommeCotes = sommeCotes + cotes;

            nombreCotes ++;

        }while(encoreUneCote == 'Y' || encoreUneCote == 'y' || encoreUneCote == 'O' || encoreUneCote == 'o');

        moyenne = sommeCotes / nombreCotes;
        System.out.println("Votre moyenne est de: " + moyenne);
    }
}
