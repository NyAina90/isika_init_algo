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
	
	public static void triAbulle(int[] tab) {
		//algorithme "tri à bulle" : faire remonter en premières positions
		//les éléments les plus légers/petits
		//pas très rapide/performant mais facile à programmer
		int taille = tab.length;
		for(int i=0 ; i<taille-1 ; i++) {
			//i = indice de l'élément du tableau à comparer avec tous ceux qui suivent
			for(int j=i+1 ; j<taille ; j++) {
				// j = indice d'un des éléments du tableau après celui d'indice i
				if(tab[j]<tab[i]) {
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
	

	public static void main(String[] args) {
	
		int[] tableau1 = { 12, 4 , 34 , 8 , 28 , 3 };
		triAbulle(tableau1);
		for(int i=0 ; i<tableau1.length; i++) {
			print(">>"+tableau1[i]);
		}
	}

}
