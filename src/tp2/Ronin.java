package tp2;

public class Ronin extends Humain {
	private int honneur=1;
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	void donner(int somme, Commercant c) {
		parler("Tiens "+c.getNom()+" voilà "+somme+" sous");
		c.recevoir(somme);
		super.perdreArgent(somme);
	}

	
	public int getHonneur() {
		return honneur;
	}

	void provoquer(Yakuza y) {
		if ((honneur*2)>y.getReputation()) {
			super.ajouterArgent(y.perdre());
			this.honneur++;
			super.parler("La réputation de ce Yakuza est faible, je l'ai humilié encore une fois");
		}
		else {
			this.honneur--;
			y.gagner();
			super.parler("Je n'ai pas l'habitude de me battre sur la terre battue, je n'avais pas d'appuis, mais je reviendra pour te battre minable Yakuza");
			
		}
	}
}