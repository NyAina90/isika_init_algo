package p;

import java.util.Scanner;
public class MainClass5 {

	public static void main(String[] args) {
		//on construit l'objet technique reader pour récupérer des valeurs
		//qui seront saisies au clavier:
		Scanner reader = new Scanner(System.in);
		//on invite l'utilisateur à saisir la valeur de a
		System.out.print("a:");
		//on recopie la valeur saisie dans la variable a:
		int a = reader.nextInt();
		
		System.out.print("b:");
		int b = reader.nextInt();
		
		int res=a+b;
		System.out.println("a="+a + " , b="+b);
		System.out.println("a+b="+res);
	}

}
