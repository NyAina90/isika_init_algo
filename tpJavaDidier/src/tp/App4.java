package tp;


public class App4 {
	
	
	public static void print(String message) {
			System.out.println(message);
			//pas de return ...
		}
	
	public static void permuterDansTableau(int[] tableau,int i,int j) {
		int valTemp = tableau[i];
		tableau[i] = tableau[j];
		tableau[j] = valTemp;
	}
	
	//en langage C,C++,java,javascript, ...
	//la fonction de comparaison doit renvoyer :
	// 0 si a et b ont les memes valeurs
	// >0 (par ex 1) si a > b
	// <0 (par ex -1) si a < b
	// ça peut se programmer avec a et b qui sont des int ou des double ou des String
	// ou carrément des objets "Personne" selon .age ou selon .nom
	public static int comparerEntiers(int a,int b) {
		int res=0;
		if(a < b) {
			res= -1;
		}else if( a> b) {
			res=1;
		}
		return res;  //si par ordre croissant
		//return -res;  //si par ordre décroissant
	}
	
	public static void triAbulle(int[] tab) {
		//algorithme "tri à bulle" : faire remonter en premières positions
		//les éléments les plus légers/petits
		//pas très rapide/performant mais facile à programmer
		int taille = tab.length;
		for(int i=0 ; i<taille-1 ; i++) {
			//i = indice de l'élément du tableau à comparer avec tous ceux qui suivent
			for(int j=i+1 ; j<taille ; j++) {
				// j = indice d'un des éléments du tableau après celui d'indice i
				
				//if(tab[j]<tab[i]) {
				if(comparerEntiers(tab[j],tab[i])<0) {
					permuterDansTableau(tab, i, j);
				}					
			}
		}
	} 
	
	/*
	 { 12, 4 , 34 , 8 , 28 , 3 }
	 { 4, 12 , 34 , 8 , 28 , 3 }
	 { 3, 12 , 34 , 8 , 28 , 4 }
	 
	      12 , 34 , 8 , 28 , 4 }
	       8 , 34 , 12 , 28 , 4 }
	       4 , 34 , 12 , 28 , 8}
	       
	       ...
	 */
	
	public static int factorielleSansRecursivite(int n) {
		int res=1;
		for(int i=2;i<=n;i++) {
			res=res*i;
		}
		return res;
	}
	
	//on appelle une fonction RECURSIVE , une fonction qui s'appelle elle même
	//avec  un ou plusieurs paramètres différents pour éviter une boucle infinie
	public static int factorielle(int n) {
		// factorielle(n) = 1 * 2 * 3 * 4 * ... * n-1 * n
		// factorielle(n) = factorielle(n-1) * n si n vaut au moins 1
		if(n==1) {
			return 1;
			}
		else { 
			return n * factorielle(n-1); 
		}
	}
	
	/*
	 à lire du bas vers le haut :
	               factorielle(1) retourne 1
	           factorielle(2) appelle en interne 2 * factorielle(1)
	        factorielle(3) appelle en interne 3 * factorielle(2)
	    factorielle(4) appelle en interne 4 * factorielle(3)
	 main() appelle factorielle(4) qui en interne a n=4
	 */
	
	//en interne le langage de programmation empile les appels de fonction
	//dans une zone particulière de la mémoire appelée "STACK" (mot anglais pour pile)
	
	//En cas de bug et de boucle infinie on a souvent le message d'erreur "StackOverflow"
	
    public static double puissance(double x , int n) {
    	double res=1;
    	if(n>=1) { 
    		res = x * puissance(x,n-1); 
    	}
    	//else (ne rien faire,  laisser res=1 par défaut)    
    	return res;
    }
	
	
	public static void main(String[] args) {
		
		double x=2.0;
		int n=4; 
		//x à la puissance 4 = x * x * x *x 
		//x à la puissance 3 = x * x * x 
		//puissance(x,n) = puissance(x,n-1) * x
		//puissance(x,0) = 1
	
		//2 à la puissance 4 = 2 * 2 *2 *2 = 16
		
		// factorielle(4) = 1 * 2 * 3 * 4 = 24
		         //factorielle(2) = 1 * 2
		         // factorielle(5) = 1 * 2 * 3 * 4 * 5
		
		print("puissance(x,n)=" + puissance(x,n));
		print("x à la puissance n =" + Math.pow(x,n));
		print("factorielle(n)=" + factorielle(n));
	
		int[] tableau1 = { 12, 4 , 34 , 8 , 28 , 3 };
		triAbulle(tableau1);
		for(int i=0 ; i<tableau1.length; i++) {
			System.out.print(" " + tableau1[i]);
		}
		print("  ");
		int[] tableau2 = { 12, 4 , 34 , 8 , 28 , 3 };
		java.util.Arrays.sort(tableau2); //tri prédéfini du langage java sur tableau d'entiers
		                                 //avec en interne un alogorithme rapide et performant appelé "quickSort"
	
		for(int i=0 ; i<tableau2.length; i++) {
			System.out.print(" " + tableau2[i]);
		}
	}

}
