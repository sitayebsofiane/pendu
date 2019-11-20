package com.sofiane.pendu;

import java.util.Random;
import java.util.Scanner;

public class Partie {
	Scanner scanner= new Scanner(System.in);
	String[] mots= {"bruno","thomas","mahydine","emira","sofiane"};	
	private joueur joueur;
	
	public Partie(String[] mots, com.sofiane.pendu.joueur joueur) {
		this.mots = mots;
		this.joueur = joueur;
	}
	public joueur getJoueur() {
		return joueur;
	}
	public void setJoueur(joueur joueur) {
		this.joueur = joueur;
	}
	public String choisirUnMot(String [] mots) 
	{
		Random random= new Random();
		return mots[random.nextInt(mots.length)];
		
	}
	public void jouer() {
		String mot=this.choisirUnMot(this.mots);
		int nbrCoup=0;
		while(nbrCoup<8) {
			System.out.println("veullieuz entrez une lettre");
			String lettre= scanner.nextLine().charAt(0)+"";
			//to do
			
		}
	}
}
