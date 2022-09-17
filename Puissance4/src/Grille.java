public class Grille {
    // Types de jetons
    public static final int VIDE       = 0;   // case vide
    public static final int ROUGE      = 1;
    public static final int VERT       = 2;

    public int[][] table ;      // grille du jeu
    private int taille ;          // taille de la grille
    private int nbreJetons;        // nombre de jetons dans la grille


    public Grille (int taille) {
        this.taille = taille ;
        this.nbreJetons = 0;
        this.table = new int[taille][taille] ;
    }

    // ========================== //
    //   METHODES A IMPLEMENTER   //
    // ========================== //

    /**
     * place un jeton dans une colonne
     * @param couleur
     *          la couleur du jeton � placer
     * @param colonne
     *          la colonne o� le jeton doit �tre plac�
     * @return l'indice de la ligne o� le jeton est tomb�
     * @throws IllegalArgumentException
     *          si la couleur ou l'indice de colonne
     *          sont invalides ou si la colonne est pleine
     */
    public int placerJeton (int couleur, int colonne) {
        if (couleur < VIDE || couleur > VERT)
            throw new IllegalArgumentException();
        if (colonne < 0 || colonne >= taille)
            throw new IllegalArgumentException();
        if (colonnePleine(colonne))
            throw new IllegalArgumentException();
        int indice = 0;

        if (colonne < taille) {
            for (int i = 0; i < taille; i++) {
                if (table[i][colonne] == 0) {
                    table[i][colonne] = couleur;
                    indice = i;
                    nbreJetons++;
                    break;
                }
            }
        }
        return indice;
    }

    /**
     * v�rifie si une colonne contient une succession de 4 jetons de m�me couleur
     * @param lig
     *          la ligne o� le dernier jeton a �t� plac�
     * @param col
     *          la colonne o� le dernier jeton a �t� plac�
     * @return true si la colonne col contient une succession de 4 jetons de m�me couleur
     *         dont le dernier se trouve � la ligne lig ; false sinon
     * @throws IllegalArgumentException
     *          si l'indice de ligne ou de colonne est invalide
     */
    public boolean verifier4JetonsCol (int lig, int col) {
        if (lig < 0 || lig >= taille || col < 0 || col >= taille)
            throw new IllegalArgumentException();

        for (int i = 0; i < taille-3; i++) {

            if (table[i][col] == table[i+1][col] && table[i+1][col] == table[i+2][col]
                    && table[i+2][col] == table[i+3][col] && table[i][col] != 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * v�rifie si une ligne contient une succession de 4 jetons de m�me couleur
     * @param lig
     *          la ligne o� le dernier jeton a �t� plac�
     * @param col
     *          la colonne o� le dernier jeton a �t� plac�
     * @return true si la ligne lig contient une succession de 4 jetons de m�me couleur
     *         dont un jeton se trouvant � la colonne col ; false sinon
     * @throws IllegalArgumentException
     *          si l'indice de ligne ou de colonne est invalide
     */
    public boolean verifier4JetonsLig (int lig, int col) {
        if (lig < 0 || lig >= taille || col < 0 || col >= taille)
            throw new IllegalArgumentException();

        for (int i = 0; i < taille-3; i++) {

            if (table[lig][i] == table[lig][i+1] && table[lig][i+1] == table[lig][i+2]
                    && table[lig][i+2] == table[lig][i+3] && table[lig][i] != 0) {
                return true;
            }
        }
        return false;

    }

    /**
     * v�rifie si une diagonale contient une succession de 4 jetons de m�me couleur
     * @param lig
     *          la ligne o� le dernier jeton a �t� plac�
     * @param col
     *          la colonne o� le dernier jeton a �t� plac�
     * @return true si une des deux diagonales passant par la case (lig,col) contient
     *         une succession de 4 jetons de m�me couleur, dont le jeton se trouvant
     *         � la colonne col et la ligne lig ; false sinon
     * @throws IllegalArgumentException
     *          si l'indice de ligne ou de colonne est invalide
     */
    public boolean verifier4JetonsDiag (int lig, int col) {
        if (lig < 0 || lig >= taille || col < 0 || col >= taille)
            throw new IllegalArgumentException();

        return false;
    }

    // ====================================== //
    //   METHODES FOURNIES (NE PAS MODIFIER)  //
    // ====================================== //

    public int getTaille(){
        return taille;
    }

    public int getNombreJetons () {
        return nbreJetons;
    }

    public boolean grillePleine () {
        return nbreJetons == taille*taille;
    }

    public boolean colonnePleine (int colonne) {
        return table[taille-1][colonne] != VIDE;
    }

    public String toString() {
        String st = "\nNombre de jetons dans la grille: " + nbreJetons + " (max: " + taille*taille + ")\n";
        st += "    ";
        for (int c=0 ; c<taille ; c++)
            st += c + " ";
        st += "\n   ";
        for (int c=0 ; c<taille ; c++)
            st += "--";
        st += "\n";
        for (int l=taille-1 ; l>=0 ; l--) {
            st += l + "|  ";
            for (int c=0 ; c<taille ; c++) {
                st = st+table[l][c]+" " ;
            }
            st += '\n' ;
        }
        return st ;
    }

    // M�thode d�finie pour les tests - NE PAS MODIFIER
    public void setGrilleTest (int[][] testGrille) {
        table = testGrille;
        nbreJetons = 0;
        for (int l=0; l<taille; l++)
            for (int c=0; c<taille; c++)
                if (table[l][c] != VIDE)
                    nbreJetons++;
    }
}
