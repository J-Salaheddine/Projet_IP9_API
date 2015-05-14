package com.projet.test;

import com.projet.controleur.Controleur;

public class TestApp {

	Controleur controleur;
	
	public TestApp(){
		controleur = new Controleur();
	}
	
	public void chargerImage(String imagePath){
		controleur.chargerImage(imagePath);
		System.out.println("Chargement d'image termin�!");
	}
	
	public void chargerRepertoire(String repertoirePath){
		System.out.println("Chargement de r�p�rtoir en cours...");
		controleur.chargerRepertoire(repertoirePath);
		System.out.println("Chargement de rep�rtoire termin�!!");
	}
	
	public void rechercheImageSimlaire(String imagePath, float taux){
		controleur.rechercheImageSimlaire(imagePath, taux);
	}
	
	public void rechercheImageSimlaire2(String imagePath, float taux){
		controleur.rechercheImageSimlaireDI(imagePath, taux);
	}
	

}
