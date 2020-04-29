package tp;

public class App3 {
	

	public static void print(String message) {
				System.out.println(message);
				//pas de return ...
	}
	
	public static String inverserChaine(String chaine) {
		//ex: chaine vaut "rouge"
		String res=""; //"" , "e" , "eg" , "egu" , ...
		int taille= chaine.length();
		for(int i=taille-1; i>=0  ;i--) {
			res = res + chaine.charAt(i);
		}
		return res; //ex: "eguor"
	}
	
	public static int[] construireTableauInverse(int[] tab) {
		int taille=tab.length;
		int[] tabRes = new int[taille];//construit un nouveau de la meme taille
		                               //chaque case du tableau est vide 
		                               //valeur jamais initialisée
		for(int i=0; i<taille  ;i++) {
			int valCase = tab[i];
			tabRes[taille -i -1]=valCase;
		}
		/*for(int i=taille-1; i>=0  ;i--) {
			int valCase = tab[i];
			tabRes[taille -i -1]=valCase;
		}*/
		return tabRes;
	}
	
	
	public static String couleurEnAnglais(String couleurEnFrancais) {
		String res="";
		switch(couleurEnFrancais) {
		case "rouge": 
			res="red";
			//instruction2 quand c'est rouge
			break;
		case "vert":
			res="green"; break;
		case "bleu":
			res="blue"; break;
		case "jaune":
			res="yellow"; break;
		default :
			res="black";
		}
		
		return res;
	}
	
	public static double calcul(String operation,double a, double b) {
		double res=0;
		//switch/case sur operation , ...
		switch(operation) {
		case "+" :
			res=a+b; break;
		case "*" :
			res=a*b; break;
		case "-" :
			res=a-b; break;
		case "/" :
			res=a/b; break;
		default:
			res=0;
		}
		return res;
	}
	

	public static void main(String[] args) {
		
		double res=calcul("+",4,3); //4+3=7
		print("res add="+res);
		double res2=calcul("*",4,3); //4*3=12
		print("res mult="+res2);
		
	         //indices: 0    1    2   3   4	
	 int[] tableau1 = { 23 , 2 , 45 , 6 , 7 };
	 int[] tableauInverse = construireTableauInverse(tableau1);
	 for(int i=0;i<tableauInverse.length;i++) {
		 print(">>"+tableauInverse[i]);
	 }

     String c1 = "rouge";
     String c1EnAnglais = couleurEnAnglais(c1);
     print("c1EnAnglais="+c1EnAnglais);
     
     String c1bis = "jaune";
     String c1bisEnAnglais = couleurEnAnglais(c1bis);
     print("c1bisEnAnglais="+c1bisEnAnglais);
     
     String c1_inverse = inverserChaine(c1);
     print("c1_inverse="+c1_inverse);
     //afficher la longeur de cette chaine de caractères.
     print("longueur=" + c1.length());
     
     String c2="bleu ciel";
     //en exercice , trouver et afficher la position du caractère ' ' (ou " ")
     int posEspace=c2.indexOf(" ");
     print("posEspace=" + posEspace);
     
     //trouver et afficher les sous parties avant et après
     print("debut=" + c2.substring(0,posEspace));
     print("fin=" + c2.substring(posEspace+1));
     //Autres exemples sur "String":
     
     String c3="vert";
     char c=c3.charAt(0); //le caractère en position 0 (le premier) ici 'v'
     print("premier caractère de vert="+c);
     if(c=='v') {
    	 print("le premier caractère de vert est bien un v minuscule");
     }
     
     String s1="ile de " + "france";
     String s2="ile de france";
     if(s1.equals(s2)) {
    	 print("s1 et s2 ont les mêmes valeurs");
        }else {
        print("s1 et s2 ont des valeurs différentes");
     }
     
	}

}
