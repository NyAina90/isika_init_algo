package p;

import java.util.Scanner;
public class MainClass6 {

	public static void main(String[] args) {
		//on construit l'objet technique reader pour récupérer des valeurs
		//qui seront saisies au clavier:
		Scanner reader = new Scanner(System.in);
		//on invite l'utilisateur à saisir la valeur d'un nom de couleur en francais
		System.out.print("couleur (en francais):");
		//on recopie la valeur saisie dans la variable couleur:
		String couleur = reader.next();
		System.out.println("couleur="+couleur);
		String color ; //à construire via switch/case
		switch(couleur){ 
			case "rouge":
				color="red"; break;
			case "vert":
				color="green"; break;
			case "bleu":
				color="blue"; break;
			case "jaune":
				color="yellow"; break;
			default :
				color="black";
		}
		System.out.println("color="+color);
		color=color.toUpperCase();
		System.out.println("color="+color);
	}
}
