
public class  Quizz1 {

	public static FenetreQuizz fenetreQuizz;

	public static void main(String[] args) {

		// creation de  l equipe

		Candidat[] candidats = new Candidat[6];
		for (int i = 0; i < candidats.length; i++) {
			candidats[i] = new Candidat("nom" + (i + 1));
		}
		Equipe equipe = new Equipe(1, candidats);

		// creation du questionnaire

		Questionnaire questionnaire = chargerQuestions();

		// creation de la fenetre de depart

		fenetreQuizz = new FenetreQuizz("Quizz - Capitales des pays de l'union europeenne");
		fenetreQuizz.afficherEquipe(equipe);
		int afficherJoueur = 0;
		while (equipe.getNombreCandidats() != 0) {
			fenetreQuizz.cliquerSuivant();

			Candidat candidat = equipe.selectionnerCandidat();
			fenetreQuizz.afficherCandidat(candidat);

			QuestionCM question = questionnaire.fournirQuestion();
			fenetreQuizz.afficherQuestion(question);
			String choix = fenetreQuizz.cliquerChoix();

			if (choix.equals(question.getChoixCorrect())) {
				fenetreQuizz.afficherPouceOK();
			} else {
				fenetreQuizz.afficherPouceKO();
				equipe.remettreEnJeu(candidat);
			}
			fenetreQuizz.afficherEquipe(equipe);
		}
		fenetreQuizz.afficherInformation("Victoire!");
	}
	
	
	public static Questionnaire chargerQuestions(){
		
		QuestionCM[] questions = new QuestionCM[5];
		questions[0]= new QuestionCM("Allemagne","Amsterdam","Dublin","Berlin","Berlin");
		questions[1]= new QuestionCM("Autriche",	"Vienne","Prague", "Vilnius","Vienne");
		questions[2]= new QuestionCM("Belgique","Amsterdam", "Bruxelles","Paris","Bruxelles");
		questions[3]= new QuestionCM("Bulgarie"	,"Sofia","Budapest","Bucarest","Sofia");
		questions[4]= new QuestionCM("France",	"Nicosie","Riga","Paris","Paris");
		

//		Croatie		Zagreb
//		Danemark	Copenhague
//		Espagne		Madrid
//		Estonie		Tallinn
//		Finlande	Helsinki
//		France		Paris
//		Grece		Athenes
//		Hongrie		Budapest
//		Irlande		Dublin
//		Italie		Rome
//		Lettonie	Riga
//		Lituanie	Vilnius
//		Luxembourg	Luxembourg
//		Malte		La Valette
//		Pays-Bas	Amsterdam
//		Pologne		Varsovie
//		Portugal	Lisbonne
//		Republiquetcheque	Prague
//		Roumanie	Bucarest
//		Royaume-Uni	Londres
//		Slovaquie	Bratislava
//		Slovenie	Ljubljana
//		Suede		Stockholm

		return new Questionnaire(questions);
		
	}

}
