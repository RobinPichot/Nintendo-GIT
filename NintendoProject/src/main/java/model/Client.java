package model;

import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	private List<Jeu> listeAchat;
	
	
	
	public Client(String nom, String prenom, List<Jeu> listeAchat) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.listeAchat = listeAchat;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public List<Jeu> getListeAchat() {
		return listeAchat;
	}
	public void setListeAchat(List<Jeu> listeAchat) {
		this.listeAchat = listeAchat;
	}
	
	

}
