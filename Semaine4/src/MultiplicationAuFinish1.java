public class MultiplicationAuFinish1 {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entrainement aux multiplications: ");

        int nombre1 = unEntierAuHasardEntre (0, 10);
        int nombre2 = unEntierAuHasardEntre (0, 10);
        int reponseUtilisateur;
        do {
            System.out.print("Calculez : " + nombre1 + " x " + nombre2 + " = ");
            reponseUtilisateur = scanner.nextInt();
            if(reponseUtilisateur != nombre1 * nombre2)
                System.out.println("C'est faux, recommence");
        }while(reponseUtilisateur != nombre1 * nombre2);
        System.out.println("Bravo!");
    }

    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        double nombreReel;
        int resultat;

        nombreReel = Math.random();
        resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
        return resultat;
    }
}
