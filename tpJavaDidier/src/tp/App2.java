package tp;

public class App2 {
	
	//void = type très spécial (pas de valeur de retour)
	public static void print(String message) {
			System.out.println(message);
			//pas de return ...
		}
		
	public static double retournerLaPlusPetiteValeur(double a, double b){
		/*
		if(a<=b) {
			return a;
		}else {
			return b;
		}
		*/
		double res=0;
		if(a<=b) {
			res= a;
		}else {
			res= b;
		}
		return res;
	}
	
	public static double plusGrandeValeurDuTableau(double[] tab) {
		double res=-9999999;
		//en exercice , parcourir le tableau tab avec une boucle for et un indice i
		     //si res est plus petit que tab[i]
		         //alors nouvelle valeur de res = tab[i]
		for(int i=0 ; i<tab.length   ; i++  ) {
			if( res < tab[i]) {
				res=tab[i];
			}
		}
		return res;
	}
	
	public static void convertirToutLeTableauEnMajuscule(String[] tab) {
		for(int i=0;i<tab.length;i++) {
		     tab[i]= tab[i].toUpperCase();
		}
	}
	
	
	public static String retournerLaValeurDeLaPlusLongueChaineDuTableau(String[] tab) {
		String res="";
		int plusGrandeTaille=0;
		for(int i=0;i<tab.length;i++) {
			int taille = tab[i].length();
			if(taille>=plusGrandeTaille) {
				plusGrandeTaille=taille;
				res=tab[i];
			}
		}
		return res;
	}
	

	public static void main(String[] args) {
		
		String[] tableauS = { "hiver" , "printemps" , "ete" , "automne" };
		convertirToutLeTableauEnMajuscule(tableauS);
		//+boucle for ou boucle while pour afficher un par un les éléments du tableau
		for(int i=0;i<tableauS.length;i++) {
		     print(tableauS[i]);
		}
		String plusGrandeChaine = retournerLaValeurDeLaPlusLongueChaineDuTableau(tableauS);
		print("plusGrandeChaine="+plusGrandeChaine);
		
		String s1="mardi";
		String s2 = s1.toUpperCase();
		print(s2);
		
		int taille=s1.length();
		print("taille="+taille);
		
		String nomFichier="App2.java";
		int posPoint = nomFichier.indexOf("."); //recherche la premièrere position trouvée
		                                        //d'un caractère recherché
		                                        //retourne -1 si pas trouvé
		int posX = nomFichier.indexOf("x");
		if(posX != -1) {
			print("nomFichier comporte un x");
		}else {
			print("nomFichier comporte pas de x");
		}
		print("posPoint="+posPoint);
		String extension = nomFichier.substring(posPoint+1); //sous-partie à la fin
		print("extension="+extension);
		String debutNomFichier = nomFichier.substring(0,posPoint);//sous partie [O,posPoint-1]
		print("debutNomFichier="+debutNomFichier);
		
		double[] tableau2 = { -6 , 16 , -8 , -4 , 36 , 25 };
		double x= plusGrandeValeurDuTableau(tableau2);
		print("x="+x);
		
		
		
		int i=0;
		while(i<tableau2.length) {
			if(tableau2[i]>=0) {
				double racine = Math.sqrt(tableau2[i]);
				print("racine="+racine);
			}
			i++; //i=i+1;
		}//fin de while
		
		print("app2");
		double res1 = retournerLaPlusPetiteValeur(6,8);
		print("res1 (plus petite valeur)="+res1);
		res1 = retournerLaPlusPetiteValeur(78,34);
		print("res1 (plus petite valeur)="+res1);
	}

}
