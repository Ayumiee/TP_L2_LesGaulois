package personnages;


public class Gaulois {
	private String nom;
	private int force, nb_trophees; 
	private int effetPotion = 1;
	private Equipement trophees[] = new Equipement[100]; 
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "< "+ texte + " >");
	}	
	
	
//TP3 -------------
	
	
//ma fonction
//	private String prendreParole() {
//		return "Le gaulois " + nom + ":" ;
//	}

	
	 private String prendreParole() { 
		 String texte = "Le gaulois " + nom + " : "; 
		 return texte; 
	 } 
	 
	
//ma fonction
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom() );
//		romain.recevoirCoup(force / 3);
//	}
	 
	 
	 
	 public void frapper(Romain romain) { 
		 System.out.println(nom  +  "  envoie  un  grand  coup  dans  la m�choire de " + romain.getNom()); 
		 Equipement  trophees[]  =  romain.recevoirCoup((force  /  3)  * effetPotion); 
		 for  (int  i  =  0;  trophees  !=  null  &&  i  <  trophees.length;  i++, nb_trophees++) { 
			 this.trophees[nb_trophees] = trophees[i]; 
		 	} 
		 }
	 
	 
// fin TP3 --------
	
	public void boirePotion(int forcePotion) {
		effetPotion=forcePotion;
		if (forcePotion >= 3) {
			parler("Merci Druide, je sens que ma force est "+ forcePotion +" fois decuplee.");
		}
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		//création d'un gaulois
		Gaulois asterix = new Gaulois("Asterix",8);
		
		System.out.println(asterix);
		
		//test du fonctionnement de la méthode prendreParole())
		System.out.println(asterix.prendreParole());
		
		asterix.parler("COUCOU");
		Romain Minus = new Romain("Minus", 6);
		asterix.frapper(Minus);
		
		//test boirePotion
		Druide panoramix = new Druide("Panoramix",1,3,1);
		panoramix.preparerPotion();
		asterix.boirePotion(panoramix.forcePotion);
		
	}
	
	
	
}