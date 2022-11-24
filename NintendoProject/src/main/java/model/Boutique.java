package model;

public class Boutique {
	
	private String nom;
	private String addresse;
	
	public Boutique(String nom, String addresse) {
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

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	
	

}
