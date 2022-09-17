/**
 *
 * @author Vandeputte François
 *
 */
public class Statistiques {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nombre d'examens: ");
        int nombreExamens = scanner.nextInt();
        double coteMax = 0;
        double coteMin = 20;
        double somme = 0;
        double moyenne = 0;
        for (int i = 1; i <= nombreExamens; i++) {
            System.out.print("Cote de l'examen " + i + ": ");
            double coteExamen = scanner.nextDouble();
            somme = somme + coteExamen;
            moyenne = somme / nombreExamens;
            if(coteExamen > coteMax)
                coteMax = coteExamen;
            if(coteExamen < coteMin)
                coteMin = coteExamen;
        }
        System.out.println("Cote maximale: " + coteMax);
        System.out.println("Cote minimale: " + coteMin);
        System.out.println("la moyenne est de " + moyenne);
    }
}
