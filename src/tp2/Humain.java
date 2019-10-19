package tp2;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	public void ajouterArgent(int sommeGagne) {
		this.argent=this.argent+sommeGagne;
	}
	
	public void boire() {
		parler("Ahhh, un bon verre de " + this.boisson+ " ! GLOUPS !");
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+ this.nom + " et j'aime boire du "+ this.boisson +" et j'ai " + this.argent + " sous en poche");
	}
	
	public void perdreArgent(int sommePerdu) {
		this.argent=this.argent-sommePerdu;
	}

	public String getNom() {
		return nom;
	}

	public String getBoisson() {
		return boisson;
	}

	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.print(this.nom + "-" + " ");
		System.out.println(texte);
	}
	
	
}
