package model;

import java.time.LocalDate;

public abstract class Console {

	protected String nom;
	protected int prix;
	protected String sortie;

	public Console(String nom, int prix, String sortie) {
		this.nom = nom;
		this.prix = prix;
		this.sortie = sortie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + ", prix=" + prix + ", sortie=" + sortie + "]";
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getSortie() {
		return sortie;
	}

	public void setSortie(String sortie) {
		this.sortie = sortie;
	}
	
	
	
	
		
}
