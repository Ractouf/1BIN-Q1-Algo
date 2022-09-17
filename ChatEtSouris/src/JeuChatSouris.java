public class JeuChatSouris {

	public static void main(String[] args) {
		int positionChat = 1;
		int positionSouris = 3;
		int positionFromage = 10;
		int de;

		//création plateau de jeu
		PlateauJeu jeu = new PlateauJeu();
		jeu.placerFromage(positionFromage);
		jeu.placerSouris(positionSouris);
		jeu.deplacerChat(positionChat);

		do {
			//deplacement souris
			jeu.afficherInformation("A la souris de jouer.");
			de = jeu.lancerDe();
			System.out.println("La souris avance de " + de + " cases.");
			positionSouris = 8;//positionSouris + de;

			//fromage
			if (positionSouris - de < positionFromage && positionSouris >= positionFromage){
				jeu.supprimerPassage();
				jeu.deplacerSouris(positionFromage);
				positionSouris = positionFromage;
				System.out.println("La souris attrape le fromage! ");

				jeu.afficherInformation("La souris peut rejouer.");
				de = jeu.lancerDe();
				System.out.println("La souris avance de " + de + " cases.");
				positionSouris = positionSouris + de;
			}else {
				//si la souris est a la case 16 ou plus
				if (positionSouris >= 16) {
					jeu.deplacerSouris(16);
					jeu.supprimerChat();
					System.out.println("La souris a gagné!");
					jeu.afficherInformation("La souris a gagnée!");
				} else {
					jeu.deplacerSouris(positionSouris);

					//deplacer chat
					jeu.afficherInformation("Au chat de jouer.");
					de = jeu.lancerDe();
					System.out.println("La chat avance de " + de + " cases.");
					positionChat = positionChat + de;

					if (positionChat >= positionSouris) {
						jeu.afficherInformation("Le chat a gagné!");
						System.out.println("Le chat a gagné!");
						jeu.supprimerSouris();
						jeu.deplacerChat(positionSouris);

					} else {
						jeu.deplacerChat(positionChat);
					}
				}
			}
		}while(positionChat < positionSouris && positionSouris < 16);
	}
}
