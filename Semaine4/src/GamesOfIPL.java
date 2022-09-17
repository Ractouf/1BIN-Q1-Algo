/**
 *
 * @author Vandeputte François
 *
 */
public class GamesOfIPL {

    public static void main(String[] args) {
        int pointDeVieCogneDur = 25, pointDeVieFrappeFort = 25, forceDeFrappeCogneDur, forceDeFrappeFrappeFort;

        System.out.println("Bienvenue au combat entre Cognedur et FrappeFort.\n");

        do {
            //dégâts au hazard a chaque début de dowhile
            forceDeFrappeCogneDur = unEntierAuHasardEntre(1,6);
            forceDeFrappeFrappeFort = unEntierAuHasardEntre(1,6);

            //Cognedur attaque !!
            pointDeVieFrappeFort = pointDeVieFrappeFort - forceDeFrappeCogneDur;
            System.out.println("Cognedur inflige " + forceDeFrappeCogneDur + " points de dégât à Frappefort");

            //si Frappefort est mort
            if (pointDeVieFrappeFort <= 0) {
                System.out.println("Il reste 0 points de vie à Frappefort");

                //si Frappefort n'est pas mort, il attaque a son tour!!
            }else {
                System.out.println("Il reste " + pointDeVieFrappeFort + " points de vie à Frappefort");

                pointDeVieCogneDur = pointDeVieCogneDur - forceDeFrappeFrappeFort;
                System.out.println("Frappefort inflige " + forceDeFrappeFrappeFort + " points de dégât à Cognedur");

                //si Cognedur est mort
                if (pointDeVieCogneDur <= 0) {
                    System.out.println("Il reste 0 points de vie à Cognedur");

                    //sinon le combat continue
                } else {
                    System.out.println("Il reste " + pointDeVieCogneDur + " points de vie à Cognedur");
                }
            }
            System.out.println("");

        }while(pointDeVieCogneDur > 0 && pointDeVieFrappeFort > 0);

        if (pointDeVieCogneDur <= 0){
            System.out.println("Cognedur est mort. Paix à son âme il est mort en brave.");
        }else {
            System.out.println("Frappefort est mort. Paix à son âme il est mort en brave.");
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
