package tp2;

public class Traitre extends Samourai{
	private int LvTraitrise=0;
	public Traitre(String nom,String boisson,int argent,String nomSeigneur,int LvTraitrise){
		super(nom,boisson,argent,nomSeigneur);
		this.LvTraitrise=LvTraitrise;
	}
	public int getLvTraitrise() {
		return LvTraitrise;
	}
	
	public void afficherLvTraitrise(){
		super.parler("Mon niveau de traitrise : ");
		System.out.println(getLvTraitrise());
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+ getNom() + " et j'aime boire du "+ getBoisson() +" et j'ai " + getArgent() + " sous en poche et j'ai un niveau de traîtrise de " + getLvTraitrise());
	}
	
	public void faireLeGentil(Humain h, int don) {
		parler("Je suis content de donner " + don + " sous à mon ami " + h.getNom());
		h.ajouterArgent(don);
		super.perdreArgent(don);
		int reduction=don/10;
		this.LvTraitrise=this.LvTraitrise-reduction;
		
	}
	
	public void extorquerCommercant(Commercant c) {
		if (this.LvTraitrise<3) {
			int argent=c.seFaireExtorquer();
			this.ajouterArgent(argent);
			this.LvTraitrise++;
		}
		else {
			super.parler("Je ne peux malheureusement plus vous extorquer car j'ai atteins mon quota.");
		}
		
	}
}