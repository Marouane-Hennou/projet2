package tp2;

import tp2.Humain;

public class Commercant extends Humain{
	public Commercant(String nom, int argent){
		super(nom, "The", argent);
	}
	int seFaireExtorquer() {
		int money=super.getArgent();
		super.perdreArgent(getArgent());
		parler("Vous êtes tous vraiment injuste envers moi !");
		return money;
	}
	
	void recevoir(int a) {
		super.ajouterArgent(a);
		parler ("Merci monsieur le ronin, Dieu vous le rendra");
	}
	
}