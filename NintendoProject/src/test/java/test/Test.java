package test;

import model.Boutique;
import model.Console;
import model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Console ps5 = new Console ("PS5");
	Jeu j1 = new Jeu ("FIFA23",ps5);
	Jeu j2 = new Jeu ("God of War",ps5);
	Jeu j3 = new Jeu ("Rocket League",ps5);
	Jeu j4 = new Jeu ("GTA VI",ps5);
	Jeu j5 = new Jeu ("Fall Guys",ps5);
	
	Boutique b1 = new Boutique("Claire's","1 place Capitole"); 
}
