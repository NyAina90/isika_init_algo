package tp;

public class App {
	
	public static String prompt(String invite) {
		System.out.println(invite);
		java.util.Scanner reader = new java.util.Scanner(System.in);
		String res=  reader.next();
		reader.close();
		return res;
	}
	
	//void = type très spécial (pas de valeur de retour)
	public static void print(String message) {
		System.out.println(message);
		//pas de return ...
	}
	
	public static int doubleDe(int a) {
		int res=a*2;
		return res;
	}
	
	//a et b sont des paramètres formels de la fonction multiplier()
	//ce sont des cas particuliers de variables locales
	public static double multiplier(double a,double b) {
		//la variable res est déclarée à l'intérieur du bloc { } 
		//de la fonction multiplier --> c'est une variable LOCALE (à portée limitée)
		double res=a*b;
		return res;
	}
	
	/*
	public static void echangerQuiFonctionnePas(int a , int b) {
		int valTemp = a;
		a = b;
		b = valTemp;
		print("dans echanger: a="+a + " b=" + b);
	}*/

	//lors de l'appel à cette fonction,
	//les paramétres a et b (de types élémentaires int) sont passés par copie de VALEUR
	//mais le paramètre tableau (de type OBJET ou tableau) est passé par REFERENCE
	//tableau peut être vu comme un autre nom que l'original tableau1 
	public static void permuterDansTableau(int[] tableau,int i,int j) {
		int valTemp = tableau[i];
		tableau[i] = tableau[j];
		tableau[j] = valTemp;
	}
	
	public static void printTableauEntier(int[] tableau) {
		for(int i=0 ; i<tableau.length ; i++) {
			print("en position " + i + " : " + tableau[i]);
		}
	}
	
	public static void main(String[] args) {
		
		//var tableau1 = [ 2 , 30 , 25 , 15 ] ; en javascript
		int[] tableau1 = { 2 , 30 , 25 , 15 }; //en java
		permuterDansTableau(tableau1,0,1);
		print("apres echange: tableau1=");
		printTableauEntier(tableau1);
		
		/*
		int va=3; 
		int vb=4;
		echangerQuiFonctionnePas(va,vb);
		print("apres echange: va="+va + " vb=" + vb);
		//L'échange se produit au niveau des copies a et b 
		 //mais pas au niveau des originaux va et vb
		*/
		
		
		double x1=5.5;
		double x2=3.0;
		//x1 et x2 sont des paramètres effectifs (fournis au moment de l'appel)
		//Au moment de l'appel à multiplier a est une copie de la VALEUR de x1 
		// et b est une copie de x2
		double x3=multiplier(x1,x2); //x3 est une copie de res de la fonction multiplier
		print("x3="+x3);
		
		double res1 = multiplier(5.0,2.0);
		print("res1="+res1);
		int res2=doubleDe(3);
		System.out.println("res2="+res2);
		// commentaire
		String v1="titi2"; 
		v1="toto";
	    //v1=prompt("nom:");
		int v2=13;
		double  v3=12.5;
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		System.out.println("v3="+v3);
	}

}
