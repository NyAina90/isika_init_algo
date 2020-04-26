package p;

public class MainClass4 {
	
	public static void main(String[] args) {
	    /*	int[] tabVal; //déclarer l'existance d'une variable "tabVal"
		              //de type tableau de int
		tabVal = new int[5]; //construction d'un tableau de 5 cases de type int
		tabVal[0]=12; tabVal[1]=30; tabVal[2]=50; tabVal[3]=1; tabVal[4]=8;
		*/
		int[] tabVal = { 12, 30, 50, 1 , 8 }; //valeurs initiales
		int[] tabInverse = construireTableauInverse(tabVal);
		System.out.println("*** tabVal (affichage du premier au dernier):");
		afficherTableau(tabVal);
		System.out.println("*** tabVal (affichage du dernier au premier ):");
		afficherTableauDuDernierAuPremier(tabVal);
		System.out.println("*** tabInverse (affichage du premier au dernier):");
		afficherTableau(tabInverse);
		//permeterDeuxElementsDanstableau(tabVal,1,3);
		//System.out.println("*** tabVal (apres echange des cases [1] et [3]):");
		trierTableau(tabVal);
		System.out.println("*** tabVal (apres tri):");
		afficherTableau(tabVal);
		
	}//fin du main
	
	static void trierTableau(int tab[]){
		//tri via alogorithme 'tri à bulle'
		//pas très performant mais simple à programmer:
		int i,j;
		int n= tab.length;
		for(i=0;i<n-1;i++){
			//on compare tab[i] avec tous les éléments qui sont après:
			//           tab[j] où j va de i+1 à n-1
			for(j=i+1;j<n;j++){
				if(tab[j]<tab[i]){
					//on permute/echange tab[j] avec tab|j] si tab[j] < tab[i]
					permeterDeuxElementsDanstableau(tab,i,j);
				}
			}
		}
	}
	
	static void permeterDeuxElementsDanstableau(int[] tab,int pos1,int pos2){
		int tampon = tab[pos1];
		tab[pos1]=tab[pos2];
		tab[pos2]=tampon;
	}

	//au moment de l'appel le paramètre tab est une sorte d'alias (autre nom) pour tabVal
	//plus précisément tab est référence sur le tableau (copie de la reference tabVal)
    static int[] construireTableauInverse(int[] tab){
		int[] tabInverse= new int[tab.length]; //construction d'un tableau de même longueur
		int i=tab.length-1; //indice (position) pour dernier element du tableau tab 
		int j=0;//indice (position) pour premier element du tableau tabInverse
		while(i >= 0){
			tabInverse[j]=tab[i];
			i=i-1; //ou i--;
			j=j+1; //ou j++;
		}
		return tabInverse; //retourner le tableau inversé construit
	}

	static void afficherTableau(int[] tab){
		//boucle d'affichage du premier au dernier element: 
		int i;
		/*
		i=0; //i = indice (position) d'un des éléments du tableau
		while(i < tab.length ){
		   System.out.println("valeur en position " + i + " = " + tab[i]);	
		   i= i+1; //ou i++;
		}
		*/
		//for(i=0 ; i < tabVal.length ; i=i+1){
		for(i=0 ; i < tab.length ; i++){
			 System.out.println("valeur en position " + i + " = " + tab[i]);
		}
	}
	
    static void afficherTableauDuDernierAuPremier(int[] tab){
    	int i;
		//boucle d'affichage du dernier au premier element: 
		/*
    	i=tab.length - 1; //i = indice (position) d'un des éléments du tableau
		while(i >=0 ){
		   System.out.println("valeur en position " + i + " = " + tab[i]);	
		   i= i-1; //ou i--;
		}
		*/
		for(i=tab.length -1 ; i >=0 ; i--){
			 System.out.println("valeur en position " + i + " = " + tab[i]);
		}
	}
    
	
	

}
