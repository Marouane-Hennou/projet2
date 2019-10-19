package tp2;

import java.util.Random;

public class GrandMere extends Humain{
	private Humain [] memoire = new Humain [30]; 
	int nbConnaissance;
	
	public GrandMere (String nom, int argent) {
		super(nom,"tisane",argent);
	}
	
	private String humainHasard(){
		Random rand = new Random();
		int valeurHasard = rand.nextInt(7);
		String valeurRetour ; 
		switch (valeurHasard){
			case 0 :
				valeurRetour = "Ronin" ; 
				break ; 
			case 1 : 
				valeurRetour = "Traitre";
				break; 
			case 2 : 
				valeurRetour = "Humain";
				break; 
			case 3 : 
				valeurRetour = "Yazuka";
				break; 
			case 4 : 
				valeurRetour = "Commercant";
				break; 
			case 5 : 
				valeurRetour = "Samourai";
				break; 
			case 6 : 
				valeurRetour = "GrandMere";
				break;
			default:
				valeurRetour = "GrandMere";
		}
		return valeurRetour ; 
	}
	
	void faireConnaissanceAvec(Humain homme){
		memoire[this.nbConnaissance] = homme ; 
		this.nbConnaissance = this.nbConnaissance + 1;
	}
	
	void ragoter(){
		int indice ; 
		for(indice = 0; indice<=nbConnaissance ; indice ++){
			if ( memoire[indice] instanceof Ronin){
				super.parler("Je crois que "+memoire[indice].getNom()+" est un Ronin.");
			}
			if ( memoire[indice] instanceof Traitre){
				super.parler("Je sais que "+memoire[indice].getNom()+" est un Traitre.");
			}
			if ( memoire[indice] instanceof Humain){
				super.parler("Je crois que "+memoire[indice].getNom()+" est un Humain.");
			}
			if ( memoire[indice] instanceof Yakuza){
				super.parler("Je crois que "+memoire[indice].getNom()+" est un Yakuza.");
			}
			if ( memoire[indice] instanceof Commercant){
				super.parler("Je crois que "+memoire[indice].getNom()+" est un Commercant.");
			
			}
			if ( memoire[indice] instanceof Samourai){
				super.parler("Je crois que "+memoire[indice].getNom()+" est un Samourai.");
			}
			if ( memoire[indice] instanceof GrandMere){
				super.parler("Je crois que "+memoire[indice].getNom()+" est un GrandMere.");
			}
		}
	}
	
}
	
