package p;

public class MainClass2 {

	//fonction principale main() 
	public static void main(String[] args) {
	   //la variable "montantHt" déclarée ici à l'intérieur de la fonction main
	   //est dite "locale" et ne peut être utilisée qu'a l'intérieur du bloc { }
	   double montantHt = 200.0;
	   double tauxTva=20.0;
	   //appel ou invocation de la fonction CaculerTva():
	   //Au moment de l'appel les contenus des variables montantHt et tauxTva 
	   //quelquefois appelés paramètres effectifs sont recopiés dans les variables
	   //ht et taux (paramètres formels) de la fonction calculerTva
	   double resCalculTva = calculerTva(montantHt,tauxTva);
	   //une fois la valeur calculée et retournée par la fonction , il y a copie du
	   //résultat dans la variable locale resCalculTva (via opérateur d'affectation =)
	   
	   //appel de la procédure afficher():
       afficher("tva calculee" , resCalculTva );
	}
	
	//(sous) fonction calculerTva() qui est appelée dans main() ou ailleurs
	// ht et taux sont des paramètres formels de la fonction calculerTva()
	// il s'agit de cas particulier de variables locales --> utilisables entre { et  }
	// le double (avec le nom de fonction calculerTva) est le type de retour
	static double calculerTva(double ht,double taux){
		double tva=0;
		tva = ht * taux / 100; 
		return tva;  //le mot clef "return" permet de renvoyer un résultat (calculé/fabriqué)
	}
	
	//procédure (fonction ne retournant pas de valeur): 
	// "void" : speudo type signifiant "pas de valeur retournée":
	static void afficher(String prefixe,double  valeur){
		System.out.print("***** " +  prefixe + ":" + valeur);
		System.out.println(" *****");
	}

}
