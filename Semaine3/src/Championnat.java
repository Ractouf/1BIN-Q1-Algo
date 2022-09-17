/**
 *
 * @author Vandeputte François
 *
 */
public class Championnat {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        double maxJury = 0;
        double minJury = 10;
        double somme = 0;
        double moyenne;
        for (int i = 1; i <= 8; i++) {
            System.out.print("Cote membre du jury n°" + i + ": ");
            double coteJury = scanner.nextDouble();
            somme = somme + coteJury;
            if(coteJury > maxJury)
                maxJury = coteJury;
            if(coteJury < minJury) {
                minJury = coteJury;
            }
        }
        moyenne = (somme - minJury - maxJury) / 6;
        System.out.println("Votre cote moyenne est de: " + moyenne);
        if(moyenne >= 8)
            System.out.println("Vous êtes sélectionné(e) pour la finale!");
        else
            System.out.println("Vous n'êtes pas qualifié(e)");
    }
}
