package com.sofiane.pendu;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class programme {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		try{
			   Pattern p = Pattern .compile("^([a-zA-Z]{2,10})$");
			   Matcher m = p.matcher("");
			   String nom="";
			   while(!m.find()) {
				   System.out.println("veuliez entrez votre nom");
				   	nom=sc.nextLine();
				    m = p.matcher(nom);
			   }
			   joueur joueur= new joueur(nom);
			   System.out.println(joueur.getNom());
			}catch(PatternSyntaxException pse){
				System.out.println(pse.getMessage());
			}
	}

}
