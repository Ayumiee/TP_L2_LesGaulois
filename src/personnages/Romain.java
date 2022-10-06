package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force>=0;
	}

	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "< "+ texte + " >");
	}	

	private String prendreParole() {
		return "Le romain " + nom + ":" ;
	}
	
	public void recevoirCoup(int forceCoup) {
		assert forceCoup>=0;
		// forceCoup doit �tre positif
		
		int forceInitiale=force;
		force -= forceCoup;
		if (force>0) {
			parler("Aie");
		} else {
			parler("J'abandonne..");
		}
		assert forceInitiale>force;
		// la force du romain doit diminu�e sinon erreur
	}
	
	public static void main(String[] args) {
		
		Romain Minus = new Romain("Minus", 6);
	}
	
	
}
