/**
 *
 * @author Vandeputte François
 *
 */
public class GamesOfIPL {

    public static void main(String[] args) {
        int pointDeVieCogneDur = 25, pointDeVieFrappeFort = 25, de;

        System.out.println("Bienvenue au combat entre Cognedur et FrappeFort.\n");

        FenetreCombatGuerriers jeu = new FenetreCombatGuerriers(pointDeVieCogneDur,pointDeVieFrappeFort);
        jeu.afficherEpee(1);
        jeu.afficherBouclier(2);
        while(pointDeVieCogneDur>0 && pointDeVieFrappeFort>0) {

            //CogneDur commence
            jeu.afficherInformation("A CogneDur");
            de = jeu.lancerDe();
            System.out.println("CogneDur inflige " + de + " points de dégâts à FrappeFort.");
            pointDeVieFrappeFort = pointDeVieFrappeFort - de;

            //Si FrappeFort meurt
            if (pointDeVieFrappeFort <= 0) {
                System.out.println("Il reste 0 points de vie à Frappefort.\n");
                jeu.afficherPointsDeVie(1, 0);

            }else { //FrappeFort n'est pas mort et attaque a son tour!
                jeu.afficherPointsDeVie(1,pointDeVieFrappeFort);
                System.out.println("Il reste " + pointDeVieFrappeFort + " point de vie à FrappeFort.\n");
                jeu.afficherInformation("A FrappeFort");
                de = jeu.lancerDe();
                System.out.println("FrappeFort inflige " + de + " points de dégâts à CogneDur.");
                pointDeVieCogneDur = pointDeVieCogneDur - de;

                if (pointDeVieCogneDur <= 0){
                    System.out.println("Il reste 0 points de vie à CogneDur.\n");
                    jeu.afficherPointsDeVie(1, 0);

                } else {
                    jeu.afficherPointsDeVie(2,pointDeVieCogneDur);
                    System.out.println("Il reste " + pointDeVieCogneDur + " point de vie à CogneDur.\n");
                }
            }
        }
        if (pointDeVieCogneDur <= 0)
            System.out.println("CogneDur a perdu le combat");
        else
            System.out.println("FrappeFort a perdu le combat");
    }
}
