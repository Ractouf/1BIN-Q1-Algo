public class Jeu {

    private static final int TAILLE_MIN = 7;
    private static final int TAILLE_MAX = 10;

    private static final java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main (String[] args) {

        System.out.print("Entrez la taille de la grille (entre " + TAILLE_MIN + " et " + TAILLE_MAX + "): ");
        int taille = scanner.nextInt();
        if (taille<TAILLE_MIN || taille>TAILLE_MAX) {
            System.out.println("Erreur: Taille non valide");
            return;
        }
        Grille grille = new Grille(taille) ;
        PlateauDeJeu plateau = new PlateauDeJeu(grille);
        plateau.afficherInformations("Debut de la partie");

        int couleur = 1;
        int colonneCliquee;
        int lignePlacee = 0;
        boolean finPartie = false;
        while (!grille.grillePleine() && !finPartie) {
            plateau.afficherJetonSuivant(couleur);

            colonneCliquee = plateau.cliquerColonne();
            while (grille.colonnePleine(colonneCliquee)) {
                plateau.afficherInformations("Colonez pleine");
                colonneCliquee = plateau.cliquerColonne();
            }
            lignePlacee = grille.placerJeton(couleur, colonneCliquee);
            plateau.actualiserGrille();

            if (grille.verifier4JetonsCol(lignePlacee, colonneCliquee) || grille.verifier4JetonsLig(lignePlacee,colonneCliquee)) {
                if (couleur == 1) {
                    plateau.afficherInformations("Le rouge a gagné");
                } else {
                    plateau.afficherInformations("Le vert a gagné");
                }
                finPartie = true;
            }

            if (couleur == 1) {
                couleur = 2;
            } else {
                couleur = 1;
            }
        }
        if (grille.grillePleine()) plateau.afficherInformations("Personne n'a gagné");

        /*
        plateau.afficherJetonSuivant(Grille.ROUGE);
        int colonne = plateau.cliquerColonne();

         */


    }

}

