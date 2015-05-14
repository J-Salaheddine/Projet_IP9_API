package com.projet.test;

import com.projet.calculeSimilarite.CalculeDistanceIntersection;
import com.projet.outils.StaticValues;
import com.projet.outils.Utiles;


public class Main {

	public static void main(String[] args) {

		TestApp test = new TestApp();
		
		/**
		 * Test De chargement d'image a la BD (dossier)
		 */
		String cheminImage = "C:\\Users\\Nile\\Pictures\\Tulips.jpg";
		//test.chargerImage(cheminImage);
		
		
		
		/**
		 * Test de charement repértoire d'image a la BD
		 */
		String cheminDossier = "C:\\Users\\Public\\Pictures\\Sample Pictures";
	//	test.chargerRepertoire(cheminDossier);
		

		
		/**
		 * Test de callcule de cimilarité
		 */
	//	String cheminImageATester = "C:\\Users\\Nile\\Pictures\\Tulips.jpg";
		//test.rechercheImageSimlaire(cheminImage, 0.5f);
		
		/**
		 * Test de callcule de cimilarité
		 */
		System.out.println("********************");
		test.rechercheImageSimlaire2(cheminImage, 0.3f);
		//System.out.println(test());


		
	}


}
