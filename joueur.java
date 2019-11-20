package com.sofiane.pendu;

public class joueur {
	
	private String nom;

	/**
	 * @param nom
	 */
	public joueur(String nom) {
		setNom(nom);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Jeueur [nom=" + nom + "]";
	}
	
	
	

}
