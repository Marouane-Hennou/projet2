package tp2;

public class MonHistoire {
	public static void main(String[] args) {
		Humain Homme = new Humain("Antoine","coca", 100);
		Homme.parler("Je suis un joueur.");
		Homme.direBonjour();
		Homme.boire();
		Commercant Ali = new Commercant("Ali", 200);
		Ali.direBonjour();
		Ali.boire();
		Yakuza BruceLee = new Yakuza("Bruce Lee", "Saké", 250, "Yamaguchi");
		BruceLee.direBonjour();
		BruceLee.boire();
		Ronin Franck = new Ronin ("Franck", "Sprite", 120);
		Franck.direBonjour();
		Franck.boire();
		Franck.donner(50, Ali);
		System.out.println("La reputation de ce Yakuza est "+BruceLee.getReputation());
		System.out.println("L'honneur de ce Ronin est de " +Franck.getHonneur());
		Franck.provoquer(BruceLee);
		System.out.println("A present la réputation de ce Yakuza est " +BruceLee.getReputation());
		System.out.println("A present l'honneur de ce Ronin est de " +Franck.getHonneur());
		Samourai Polo = new Samourai("Polo", "IceTea", 25, "Franck");
		Polo.direBonjour();
		Traitre Daniel = new Traitre("Daniel", "Gazouz", 50, "Polo", 0);
		Daniel.direBonjour();
		Daniel.extorquerCommercant(Ali);
		Daniel.direBonjour();
		Daniel.faireLeGentil(Homme, 10);
		Daniel.direBonjour();
		Homme.direBonjour();
		GrandMere Mamie= new GrandMere("Mamie", 200);
		Mamie.faireConnaissanceAvec(Ali);
		Mamie.ragoter();
		
	
	}

}
