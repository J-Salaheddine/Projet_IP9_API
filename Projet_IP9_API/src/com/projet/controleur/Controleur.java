package com.projet.controleur;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.projet.calculeSimilarite.CalculeDistanceIntersection;
import com.projet.calculeSimilarite.CalculeIntersectionHistogramme;
import com.projet.calculeSimilarite.RechercheSimilariteImage;
import com.projet.model.ChargerImage;
import com.projet.model.ChargerRepertoire;
import com.projet.outils.Signature;
import com.projet.outils.StaticValues;

public class Controleur {
	/**
	 * Cette classe permet d'acceder a tout les servis proposer par le programme
	 */
	public Controleur(){
		super();
	}
	
	/**
	 * Ajouter une image dans la base de donn�e
	 * @param imagePath
	 */
	public void chargerImage(String imagePath){
		Signature objetImage = new Signature(imagePath);
		new ChargerImage(objetImage);
	}
	
	/**
	 * Ajouter plusieur image contenur dans une seul dossier
	 * @param repertoirePath
	 */
	public void chargerRepertoire(String repertoirePath){
		 new ChargerRepertoire(repertoirePath);
	}
	
	/**
	 * Calculer la siganture d'un fichier 
	 * @param imageFile
	 * @return
	 */
	public Signature calculerSignature(File imageFile){
		Signature sig = new Signature(imageFile);
		return sig;
	}
	
	
	
	/**
	 * Trouver une similarit� a partir d'une image et la base de donn�e
	 * @param imagePath
	 * @param taux
	 */
	public void rechercheImageSimlaire(String imagePath, float taux){
		Signature oi1 = new Signature(imagePath);
		RechercheSimilariteImage rechercheSimilariteImage = new RechercheSimilariteImage(oi1, taux);
		rechercheSimilariteImage.listerRepertoire();
		try {
			Desktop.getDesktop().open(new File(StaticValues.BDD_RES));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Controleur!! ouvrir fenetre");
		}
	}
	
	/**
	 * Trouver une similarit� a partir d'une image et la base de donn�e
	 * @param imagePath
	 * @param taux
	 */
	public void rechercheImageSimlaireDI(String imagePath, float taux){
		Signature oi1 = new Signature(imagePath);
		RechercheSimilariteImage rechercheSimilariteImage = new RechercheSimilariteImage(oi1, taux);
		rechercheSimilariteImage.listerRepertoireDI();
		try {
			Desktop.getDesktop().open(new File(StaticValues.BDD_RES));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Controleur!! ouvrir fenetre");
		}
	}
	
	/**
	 * Swain
	 * intersection histo
	 * Fonction permetant de calculer la similarit� entre de signature
	 * @param sig1
	 * @param sig2
	 * @return
	 */
	public static float calculDeSimilariteIH(Signature sig1, Signature sig2){
		CalculeIntersectionHistogramme css = new CalculeIntersectionHistogramme(sig1, sig2);
		return css.getTauxSimlarite();
	}
	
	/**
	 * demande de prof
	 * distance intersection
	 * Fonction permetant de calculer la similarit� entre de signature
	 * @param sig1
	 * @param sig2
	 * @return
	 */
	public static float calculDeSimilariteDI(Signature sig1, Signature sig2){
		CalculeDistanceIntersection cdi = new CalculeDistanceIntersection(sig1, sig2);
		return cdi.getTauxDsitanceIntersection();
	}
	
	
	/**
	 * Elle retourn un objet signature a partir d'un fichier image
	 * @param path
	 * @return
	 */
	public static Signature getSignature(String path){
		Signature signature = new Signature(path);
		return signature;
	}
	

	/**
	 * Calculer la similarit� entre deux siganture
	 * @param sig1
	 * @param sig2
	 * @return
	 */
	public double calculerSimilarite(Signature sig1, Signature sig2){
		double tauxDeSmimilarite;
		CalculeIntersectionHistogramme css = new CalculeIntersectionHistogramme(sig1, sig2);
		tauxDeSmimilarite =(double) css.getTauxSimlarite();
		return tauxDeSmimilarite;
	}
	

	
}
