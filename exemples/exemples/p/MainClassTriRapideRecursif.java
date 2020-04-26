package p;

public class MainClassTriRapideRecursif {

	static void  echanger(int[]tableau , int indice1 , int indice2){
	     int temp = tableau[indice1];
		 tableau[indice1] = tableau[indice2];
		 tableau[indice2] = temp;
	  }
	
	  static int   partition(int[] tableau,int deb,int fin){
	      int indicePivot=deb; //au sens indice initial qui va évoluer
	      int valeurPivot=tableau[deb];//valeur du pivot (= arbitrairement valeur en première position du tableau)
			                         //via une future permutation , cette valeur sera à une future autre position
	      
	      for(int i=deb+1;i<=fin;i++){
	          if (tableau[i]<valeurPivot){
	              indicePivot++; //nouvelle valeur pour le futur indice du pivot (qui peut encore évoluer selon boucle en cours)
	              echanger(tableau,indicePivot,i); //pour placer à la "future gauche" de l'indice provisoire du pivot tous les éléments plus petits que le pivot
	           }
	      }
	      echanger(tableau,deb,indicePivot); //permutation pour que la valeur du pivot soit rangée à sa place (précédemment calculée)
			                                   //et pour qu'un des éléments plus petits soit placé au début (à gauche )
	      return indicePivot;
      }

	  static void  tri_rapide(int[] tableau,int deb,int fin){
       if(deb<fin){
			 //partitionner le tableau en 2 parties partiellement ré-arrangées .
			 //d'un coté tous les éléments plus petits que le pivot , de l'autre coté tous les éléments plus grands:
          int positionPivot=partition(tableau,deb,fin);
			
          tri_rapide(tableau,deb,positionPivot-1); //trier le sous tableau des plus petits éléments que le pivot
          tri_rapide(tableau,positionPivot+1,fin); //trier le sous tableau des plus grands éléments que le pivot
        }
     }
	  
    static void quick_sort(int[] tableau){
		 tri_rapide(tableau, 0, tableau.length - 1 );
	  }
    
    public static void main(String[] args) {
		int[] t1 = { 5,2,1,9,3,4,12,8,16,6 }; 
		  for(int i=0;i<t1.length;i++) {
			  System.out.println(t1[i]);
		  }
		  System.out.println("-----------");
		  quick_sort(t1);
		  for(int i=0;i<t1.length;i++) {
			  System.out.println(t1[i]);
		  }
	}
	 

}
