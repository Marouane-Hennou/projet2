package tp2;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=0;
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan=clan;
	}
	
	void extorquer(Commercant c ) {
		super.ajouterArgent(c.seFaireExtorquer());
		parler("Je viens de tout voler à ce commerçant minable HAHAHAHA !");
		this.reputation=this.reputation+1;
	}
	
	void gagner() {
		this.reputation=this.reputation+1;
		parler("Je viens de battre a plat de couture ce Ronin !!");
	}
	
	int perdre() {
		int argentPerdu=super.getArgent();
		super.perdreArgent(super.getArgent());
		this.reputation=this.reputation-1;
		parler("J'ai perdu aujourd'hui contre ce Ronin et mes " + argentPerdu+ " sous, mais je reviendrai pour le battre, qu'il soit prêt");
		return argentPerdu;
		
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}
	
	public void direBonjour(){
		parler("Bonjour ! Je m'appelle "+ getNom() + " et j'aime boire du "+ getBoisson() +" et j'ai " + getArgent() + " sous en poche. Je fais partie du clan des " + this.getClan());
	}
}
