package tp2;

public class Samourai extends Ronin {
	private String nomSeigneur;
	public Samourai(String nom, String boisson, int argent, String nomSeigneur){
		super(nom, boisson, argent);
		this.nomSeigneur = nomSeigneur ;
	}
	public String getNomSeigneur() {
		return nomSeigneur;
	}
	
	public void afficherNomSeigneur(){
		this.parler("Mon seigneur : " +getNomSeigneur());
	}
	
	public void direBonjour(){
		parler("Bonjour ! Je m'appelle "+ getNom() + " et j'aime boire du "+ getBoisson() +" et j'ai " + getArgent() + " sous en poche. Mon seigneur est " + getNomSeigneur()); 
	}
	
	public void boire(String boisson){
		parler("Ahhh, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
}
