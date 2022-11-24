package model;

public class Boutique {
	
	private String nom;
	private Adresse addresse;
	
	public Boutique(String nom, Adresse addresse) {
		super();
		this.nom = nom;
		this.addresse = addresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Adresse getAddresse() {
		return addresse;
	}

	public void setAddresse(Adresse addresse) {
		this.addresse = addresse;
	}
	
	

}
