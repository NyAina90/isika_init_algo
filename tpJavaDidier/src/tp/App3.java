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

	public static void main(String[] args) {

     String c1 = "rouge";
     String c1_inverse = inverserChaine(c1);
     print("c1_inverse="+c1_inverse);
     //afficher la longeur de cette chaine de caract�res.
     print("longueur=" + c1.length());
     
     String c2="bleu ciel";
     //en exercice , trouver et afficher la position du caract�re ' ' (ou " ")
     int posEspace=c2.indexOf(" ");
     print("posEspace=" + posEspace);
     
     //trouver et afficher les sous parties avant et apr�s
     print("debut=" + c2.substring(0,posEspace));
     print("fin=" + c2.substring(posEspace+1));
     //Autres exemples sur "String":
     
     String c3="vert";
     char c=c3.charAt(0); //le caract�re en position 0 (le premier) ici 'v'
     print("premier caract�re de vert="+c);
     if(c=='v') {
    	 print("le premier caract�re de vert est bien un v minuscule");
     }
     
     String s1="ile de " + "france";
     String s2="ile de france";
     if(s1.equals(s2)) {
    	 print("s1 et s2 ont les m�mes valeurs");
        }else {
        print("s1 et s2 ont des valeurs diff�rentes");
     }
     
	}

}
