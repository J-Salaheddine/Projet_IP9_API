package com.projet.calculeSimilarite;

import com.projet.outils.Signature;
import com.projet.outils.StaticValues;
import com.projet.outils.Utiles;

public class CalculeDistanceIntersection {

	float[] tab1N = new float[StaticValues.NOMBRE_DE_DIVISION_RG];
	float[] tab2N = new float[StaticValues.NOMBRE_DE_DIVISION_BY];
	float[] tab3N = new float[StaticValues.NOMBRE_DE_DIVISION_WB];
	
	float[] tab4N = new float[StaticValues.NOMBRE_DE_DIVISION_RG];
	float[] tab5N = new float[StaticValues.NOMBRE_DE_DIVISION_BY];
	float[] tab6N = new float[StaticValues.NOMBRE_DE_DIVISION_WB];
	
	public CalculeDistanceIntersection(Signature signature, Signature signature2) {
		remplirTable(signature, signature2);
		

	}
	
	private void remplirTable(Signature signature, Signature signature2){
		for(int i=0 ; i<StaticValues.NOMBRE_DE_DIVISION_RG;i++){
			tab1N[i] = signature.getTabRgElement(i);
		}
		tab1N = Utiles.normaliserVecteur(tab1N);

		for(int i=0 ; i<StaticValues.NOMBRE_DE_DIVISION_BY;i++){
			tab2N[i] = signature.getTabByElement(i);
		}
		tab2N = Utiles.normaliserVecteur(tab2N);
		
		for(int i=0 ; i<StaticValues.NOMBRE_DE_DIVISION_WB;i++){
			tab3N[i] = signature.getTabWbElement(i);
		}
		tab3N = Utiles.normaliserVecteur(tab3N);
		
		
		
		for(int i=0 ; i<StaticValues.NOMBRE_DE_DIVISION_RG;i++){
			tab4N[i] = signature2.getTabRgElement(i);
		}
		tab4N = Utiles.normaliserVecteur(tab4N);
		
		for(int i=0 ; i<StaticValues.NOMBRE_DE_DIVISION_BY;i++){
			tab5N[i] = signature2.getTabByElement(i);
		}
		tab5N = Utiles.normaliserVecteur(tab5N);
		
		for(int i=0 ; i<StaticValues.NOMBRE_DE_DIVISION_WB;i++){
			tab6N[i] = signature2.getTabWbElement(i);
		}
		tab6N = Utiles.normaliserVecteur(tab6N);
		
	}
	
	public float getTauxDsitanceIntersection(){
		float taux = sommeDesMin()/sommeDesMax();
		return taux;
		
	}
	
	public float sommeDesMin(){
		float min1 = 0, min2 = 0, min3 = 0;
		
		float sommeDesMin = 0;
		for(int i=0 ; i<StaticValues.NOMBRE_DE_DIVISION_RG; i++){
			if(tab1N[i] < tab4N[i]){
				min1 += tab1N[i];
			}else{
				min1 += tab4N[i];
			}
		}
		
		for(int i=0 ; i<StaticValues.NOMBRE_DE_DIVISION_BY; i++){
			if(tab2N[i] < tab5N[i]){
				min2 += tab2N[i];
			}else{
				min2 += tab5N[i];
			}
		}
		
		for(int i=0 ; i<StaticValues.NOMBRE_DE_DIVISION_WB; i++){
			if(tab3N[i] < tab6N[i]){
				min3 += tab3N[i];
			}else{
				min3 += tab6N[i];
			}
		}
		sommeDesMin = min1+min2+min3;
		return sommeDesMin;
	}
	
	public float sommeDesMax(){
		float max1 = 0, max2 = 0, max3 = 0;
		
		float sommeDesMax = 0;
		for(int i=0 ; i<StaticValues.NOMBRE_DE_DIVISION_RG; i++){
			if(tab1N[i] > tab4N[i]){
				max1 += tab1N[i];
			}else{
				max1 += tab4N[i];
			}
		}
		
		for(int i=0 ; i<StaticValues.NOMBRE_DE_DIVISION_BY; i++){
			if(tab2N[i] > tab5N[i]){
				max2 += tab2N[i];
			}else{
				max2 += tab5N[i];
			}
		}
		
		for(int i=0 ; i<StaticValues.NOMBRE_DE_DIVISION_WB; i++){
			if(tab3N[i] > tab6N[i]){
				max3 += tab3N[i];
			}else{
				max3 += tab6N[i];
			}
		}
		sommeDesMax = max1+max2+max3;
		return sommeDesMax;
	}
	
	
}
