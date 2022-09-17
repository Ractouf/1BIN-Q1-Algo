import java.util.Scanner;
/**
 *
 * @author Vandeputte François
 *
 */
public class OperationArithmetique {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        afficherMenu();
        int choix;
        do {
            choix = scanner.nextInt();
            switch (choix){
                case 1: faireUneAddition();
                    break;
                case 2: faireUneSoustraction();
                    break;
                case 3: faireUneMultipliaction();
                    break;
            }
        }while(choix > 0 && choix < 4);
        System.out.println("Entier incompatible");
    }

    private static void afficherMenu() {
        System.out.println("1 : Addition");
        System.out.println("2 : Soustration");
        System.out.println("3 : Multuplication");
        System.out.print("Choissisez un type d'exercice: ");
    }

    private static void faireUneAddition() {
        int nombre1 = Utilitaires.unEntierAuHasardEntre(1,10);
        int nombre2 = Utilitaires.unEntierAuHasardEntre(1,10);

        System.out.print("\nCalculez: " + nombre1 + " + " + nombre2 + " = ");
        int reponse = scanner.nextInt();
        if (nombre1 + nombre2 != reponse)
            System.out.println("Raté !\nLa réponse était: " + (nombre1 + nombre2));
        System.out.println("Bravo!");
    }

    private static void faireUneSoustraction() {
        int nombre1 = Utilitaires.unEntierAuHasardEntre(1,10);
        int nombre2 = Utilitaires.unEntierAuHasardEntre(1,10);

        System.out.print("\nCalculez: " + nombre1 + " - " + nombre2 + " = ");
        int reponse = scanner.nextInt();
        if (nombre1 - nombre2 != reponse)
            System.out.println("Raté !\nLa réponse était: " + (nombre1 - nombre2));
        System.out.println("Bravo!");
    }

    private static void faireUneMultipliaction() {
        int nombre1 = Utilitaires.unEntierAuHasardEntre(1,10);
        int nombre2 = Utilitaires.unEntierAuHasardEntre(1,10);

        System.out.print("\nCalculez: " + nombre1 + " * " + nombre2 + " = ");
        int reponse = scanner.nextInt();
        if (nombre1 * nombre2 != reponse)
            System.out.println("Raté !\nLa réponse était: " + (nombre1 * nombre2));
        System.out.println("Bravo!");
    }
}
