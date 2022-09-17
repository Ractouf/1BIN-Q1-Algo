/**
 *
 * @author Vandeputte François, Guesmia Osmane
 *
 */
public class CalculBMI {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entrez votre taille en mètres: ");
        double taille = scanner.nextDouble();
        System.out.print("Entrez votre poids en kg: ");
        int poids = scanner.nextInt();
        double BMI = poids/Math.pow(taille, 2);

        if(BMI < 20)
            System.out.println("Vous êtes trop maigre");
        else
            if(BMI <= 25)
            System.out.println("Vous êtes en bonne forme");
            else
                if(BMI <= 30)
                    System.out.println("Vous êtes en embonpoint");
                else
                    System.out.println("Vous êtes obèse");
    }
}
