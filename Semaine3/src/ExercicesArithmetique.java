/**
 *
 * @author Vandeputte François
 *
 */
public class ExercicesArithmetique {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Combien d'exercices désirez vous faire? ");
        int nombreExercises = scanner.nextInt();
        int nombre1, nombre2;

        for (int i = 0; i < nombreExercises; i++) {
            int symbole = unEntierAuHasardEntre(1, 4);

            if (symbole == 1) {
                do {
                    nombre1 = unEntierAuHasardEntre(0, 100);
                    nombre2 = unEntierAuHasardEntre(0, 100);
                }while(nombre1 + nombre2 > 100);

                System.out.print("Calculez: " + nombre1 + " + " + nombre2 + " = ");
                int entree = scanner.nextInt();

                if(entree == nombre1 + nombre2)
                    System.out.println("Bravo!");
                else
                    System.out.println("La bonne réponse est: " + (nombre1 + nombre2));
            }else
                if(symbole == 2) {
                    do {
                        nombre1 = unEntierAuHasardEntre(0, 100);
                        nombre2 = unEntierAuHasardEntre(0, 100);
                    }while(nombre1 - nombre2 < 0);

                    System.out.print("Calculez: " + nombre1 + " - " + nombre2 + " = ");
                    int entree = scanner.nextInt();

                    if(entree == nombre1 - nombre2)
                        System.out.println("Bravo!");
                    else
                        System.out.println("La bonne réponse est: " + (nombre1 - nombre2));
                }else
                    if(symbole == 3) {
                         do {
                             nombre1 = unEntierAuHasardEntre(0, 100);
                             nombre2 = unEntierAuHasardEntre(0, 100);
                         }while (nombre1 * nombre2 > 100);

                         System.out.print("Calculez: " + nombre1 + " * " + nombre2 + " = ");
                         int entree = scanner.nextInt();

                         if (entree == nombre1 * nombre2)
                         System.out.println("Bravo!");
                         else
                         System.out.println("La bonne réponse est: " + (nombre1 * nombre2));
                    }else
                        {
                            do {
                                nombre1 = unEntierAuHasardEntre(0, 100);
                                nombre2 = unEntierAuHasardEntre(1, 100);
                            }while ((nombre1 % nombre2) != 0);

                            System.out.print("Calculez: " + nombre1 + " / " + nombre2 + " = ");
                            int entree = scanner.nextInt();

                            if (entree == nombre1 / nombre2)
                                System.out.println("Bravo!");
                            else
                                System.out.println("La bonne réponse est: " + (nombre1 / nombre2));
                        }
        }
    }

    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        double nombreReel;
        int resultat;

        nombreReel = Math.random();
        resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
        return resultat;
    }
}
