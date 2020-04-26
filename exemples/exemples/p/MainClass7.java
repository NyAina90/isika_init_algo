package p;

import java.util.Scanner;
public class MainClass7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		exoTableauEnMajuscule();
		boolean envieDeArreter=false;
		while (envieDeArreter==false){
			System.out.print("voulez vous continuer (o)ui ou (n)on:");
			String suite=reader.next();
			suite = suite.toLowerCase();
			switch(suite){
				case "o":
				case "oui":
					exoTableauEnMajuscule();
					break;
				case "n":
				case "non":
					System.out.println("fin du programme . au revoir ...");
					envieDeArreter=true;
					break;
				default:
					System.out.println("il faudrait choisir entre (o)ui ou (n)non !!!");
			}
		}
	}
		
	static void exoTableauEnMajuscule() {
		//on construit l'objet technique reader pour récupérer des valeurs
		//qui seront saisies au clavier:
		Scanner reader = new Scanner(System.in);
		//on invite l'utilisateur à saisir la taille du tableau (n):
		System.out.print("n (taille tableau):");
		//on recopie la valeur saisie dans la variable couleur:
		int n = reader.nextInt();
		System.out.println("n="+n);
		String[] tabChaines = new String[n];
		int i;
		for(i=0;i<n;i++){
			System.out.print("valeur en position "+i+" :");
			tabChaines[i]=reader.next();
		}
		afficherTableauDeChaines("tableau des valeurs saisies:",tabChaines);
		//conversion en MAJUSCULES:
		for(i=0 ; i < tabChaines.length ; i++){
			tabChaines[i]=tabChaines[i].toUpperCase();
		}
		afficherTableauDeChaines("tableau des valeurs en MAJUSCULES:",tabChaines);
	}
	
	static void afficherTableauDeChaines(String message,String[] tab){
		System.out.println(message);
		int i;
		for(i=0 ; i < tab.length ; i++){
			 System.out.println("tab...[" + i + "] = " + tab[i]);
		}
	}
}
