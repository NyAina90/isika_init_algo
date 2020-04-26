package p;

public class MainClass2 {

	//fonction principale main() 
	public static void main(String[] args) {
	   //la variable "montantHt" d�clar�e ici � l'int�rieur de la fonction main
	   //est dite "locale" et ne peut �tre utilis�e qu'a l'int�rieur du bloc { }
	   double montantHt = 200.0;
	   double tauxTva=20.0;
	   //appel ou invocation de la fonction CaculerTva():
	   //Au moment de l'appel les contenus des variables montantHt et tauxTva 
	   //quelquefois appel�s param�tres effectifs sont recopi�s dans les variables
	   //ht et taux (param�tres formels) de la fonction calculerTva
	   double resCalculTva = calculerTva(montantHt,tauxTva);
	   //une fois la valeur calcul�e et retourn�e par la fonction , il y a copie du
	   //r�sultat dans la variable locale resCalculTva (via op�rateur d'affectation =)
	   
	   //appel de la proc�dure afficher():
       afficher("tva calculee" , resCalculTva );
	}
	
	//(sous) fonction calculerTva() qui est appel�e dans main() ou ailleurs
	// ht et taux sont des param�tres formels de la fonction calculerTva()
	// il s'agit de cas particulier de variables locales --> utilisables entre { et  }
	// le double (avec le nom de fonction calculerTva) est le type de retour
	static double calculerTva(double ht,double taux){
		double tva=0;
		tva = ht * taux / 100; 
		return tva;  //le mot clef "return" permet de renvoyer un r�sultat (calcul�/fabriqu�)
	}
	
	//proc�dure (fonction ne retournant pas de valeur): 
	// "void" : speudo type signifiant "pas de valeur retourn�e":
	static void afficher(String prefixe,double  valeur){
		System.out.print("***** " +  prefixe + ":" + valeur);
		System.out.println(" *****");
	}

}
