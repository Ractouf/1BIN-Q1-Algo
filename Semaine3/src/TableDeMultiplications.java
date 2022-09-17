/**
 *
 * @author Vandeputte François
 *
 */
public class TableDeMultiplications {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Choississez votre table de multiplication: ");
        int table = scanner.nextInt();
        int multiplication = 0;
        for (int i = 1; i <= 10; i++) {
            multiplication = table * i;
            System.out.println(i + " x " + table + " = " + multiplication);
        }
    }
}
