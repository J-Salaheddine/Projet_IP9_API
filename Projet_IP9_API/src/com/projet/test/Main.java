package com.projet.test;


public class Main {

	public static void main(String[] args) {

		TestApp test = new TestApp();
		
		/**
		 * Test De chargement d'image a la BD (dossier)
		 */
		String cheminImage = "C:\\Users\\Nile\\Pictures\\Tulips.jpg";
		//test.chargerImage(cheminImage);
		
		
		
		/**
		 * Test de charement rep�rtoire d'image a la BD
		 */
		String cheminDossier = "C:\\Users\\Nile\\Desktop\\Banque image";
		//test.chargerRepertoire(cheminDossier);
		

		
		/**
		 * Test de callcule de cimilarit�
		 */
	//	String cheminImageATester = "C:\\Users\\Nile\\Pictures\\Tulips.jpg";
		test.rechercheImageSimlaire(cheminImage, 0.8f);
		
		/**
		 * Test de callcule de cimilarit�
		 */
		System.out.println("********************");
		//test.rechercheImageSimlaire2(cheminImage, 0.1f);
		

		
		
	}

}
