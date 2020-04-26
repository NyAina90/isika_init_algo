package p;

import java.io.FileInputStream;
import java.util.Scanner;

public class MainClass10 {

	//jeu du pendu
	public static void main(String[] args) throws Exception {
		//NB: le fichier listeMots.txt sera par defaut recherché
		//à la racine du projet eclipse
		
		String[] tabMots = new String[512];
		int nbMots=0; //nb mots/lignes lus dans le fichier
		int nbEssais=6;
		int indiceAleatoire;
		String motATrouver;
		char caracterePropose;
		String motPartiellementdevine, nouveauMotPartiellementdevine;
		int ancienNbLettresRestantATrouver, nbLettresRestantATrouver;
		boolean entierementDevine=false;
		
		FileInputStream fichierALire= new FileInputStream("listeMots.txt");
		Scanner readerFichier = new Scanner(fichierALire);
		Scanner reader = new Scanner(System.in);
		while(readerFichier.hasNextLine()){
			tabMots[nbMots++]=readerFichier.nextLine();
     	}
		
		double nombreAleatoireEntreZeroEtUn = Math.random();
		int coeff =50000;
		indiceAleatoire = (int) ( nombreAleatoireEntreZeroEtUn * coeff ) % nbMots;
		motATrouver=tabMots[indiceAleatoire];
		int i;
		motPartiellementdevine="";
		for(i=0;i<motATrouver.length();i++){
			motPartiellementdevine= motPartiellementdevine+"_";
		}
		nbLettresRestantATrouver = motATrouver.length();
	
		while(entierementDevine==false && nbEssais>0){
			System.out.println("motPartiellementdevine = " + motPartiellementdevine);
			ancienNbLettresRestantATrouver=nbLettresRestantATrouver;
			System.out.println("Encore " + nbEssais + " essai(s) , lettre: ");
			caracterePropose = (reader.next()).charAt(0);
			nouveauMotPartiellementdevine="";
			for(i=0;i<motATrouver.length();i++){
				char charDansMotATrouver = motATrouver.charAt(i);
				char charDansAncienMotPartiellementdevine = motPartiellementdevine.charAt(i);
				if(charDansAncienMotPartiellementdevine!='_'){
					nouveauMotPartiellementdevine += charDansAncienMotPartiellementdevine; //déjà trouvé auparavant
				}else{
					if(charDansMotATrouver==caracterePropose){
						nouveauMotPartiellementdevine +=caracterePropose;
						nbLettresRestantATrouver--;
					}else{
						nouveauMotPartiellementdevine +='_';
					}
				}
			}
			motPartiellementdevine=nouveauMotPartiellementdevine;
			if(nbLettresRestantATrouver==ancienNbLettresRestantATrouver){
				nbEssais--;
			}
			if(nbLettresRestantATrouver==0){
				entierementDevine=true;
			}
		}
		if(entierementDevine==true){
			System.out.println("BRAVO vous avez trouvé le mot : " + motATrouver);
		}else {
			System.out.println("PENDU , il n'y a plus d'autre essai pour touver le mot : " + motATrouver);
		}
	}
		
}
