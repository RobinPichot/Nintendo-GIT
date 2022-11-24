package test;

import java.util.ArrayList;
import java.util.List;

import model.Adresse;
import model.Boutique;
import model.Client;
import model.Console;
import model.Jeu;
import model.Salon;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adresse A1 = new Adresse ("4", "rue belgrand", "Paris");
		Adresse A2 = new Adresse ("23", "rue charlourd", "Toulouse");
		//Adresse A3 = new Adresse ("10", "rue Hepertie", "Lille");
		
		
		
	Boutique b1 = new Boutique("Micromania", A1);
	Console ps5 = new Salon ("PS5");
	Jeu j1 = new Jeu ("FIFA23",ps5,b1);
	Jeu j2 = new Jeu ("God of War",ps5,b1);
	Jeu j3 = new Jeu ("Rocket League",ps5,b1);
	Jeu j4 = new Jeu ("GTA VI",ps5,b1);
	Jeu j5 = new Jeu ("Fall Guys",ps5,b1);
	Boutique b2 = new Boutique("Claire's",A2); 
		
		List<Jeu> L1= new ArrayList<Jeu>();
		L1.add(j1);
		L1.add(j2);
		
		List<Jeu> L2= new ArrayList<Jeu>();
		L2.add(j1);
		L2.add(j2);
		
		Client C1 = new Client ("Autar","Petter", L1);
		Client C2 = new Client ("Vorie","Tony", L2);
		
		

	}
	
}
