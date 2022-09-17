/**
 *
 * @author Vandeputte François
 *
 */
public class CoteCommenteeV2 {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entrez la cote: ");
        double cote = scanner.nextDouble();
        String commentaire = donnerCommentaire(cote);
        System.out.println(commentaire);
    }

    /**
     * Donne un commentaire sur une cote donnée
     * @param cote la cote qui doit être commentée
     * @return un commentaire
     */
    public static String donnerCommentaire(double cote){
        if (cote < 10)
            return "l’étudiant n’a pas validé l’UE";
        if (cote < 14)
            return "l’étudiant a validé l’UE";
        if (cote < 16)
            return "l’étudiant a validé l’UE avec une belle cote";
        return "l’étudiant a validé l’UE avec une très belle cote";
    }
}
