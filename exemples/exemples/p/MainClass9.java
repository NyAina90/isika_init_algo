package p;

//exemples divers
public class MainClass9 {
	

	public static void main(String[] args) {
		
	double nombreAleatoireEntreZeroEtUn = Math.random();
	System.out.println("nombreAleatoireEntreZeroEtUn="+nombreAleatoireEntreZeroEtUn);
	int coeff =50000;
	int tailleTableau = 32; //parExemple
	int indiceAleatoireDansTableau = (int) ( nombreAleatoireEntreZeroEtUn * coeff ) % tailleTableau;
	System.out.println("indiceAleatoireDansTableau="+indiceAleatoireDansTableau);
	
	int[] tabInt = { 4 , 6 , 9 , 3 , 8 , 9 ,5 ,2 , 3 };
	int j;
	//afficher première valeur impaire:
	int premiereValeurImpaire=-1;
	for(j=0;j<tabInt.length;j++){
		if(tabInt[j] % 2 == 1){
			premiereValeurImpaire = tabInt[j];
			break; //ici break signifie interrompre la boucle avant la fin prévue
		}
	}
	
	String ch=null;
	//ch="" ; //"ok";
	if( ch != null && ch.equals("ok") ){
		System.out.println("c'est ok");
	}
	
	int nombre=25;
	if(nombre >=20 && nombre <=30 ){
		System.out.println("nombre est entre 20 et 30");
	}
	
	System.out.println("premiere valeur impaire trouvee:" + premiereValeurImpaire);
	
	/*
	for(j=0;j<tabInt.length;j++){
		if(tabInt[j] % 2 == 1){
			System.out.println("valeur impaire: " + tabInt[j]);
		}else{
			System.out.println("valeur paire: " + tabInt[j]);
		}
	}*/
	
	
		
	String chUrl="http://www.xyz.com/index.html";	
	int posDuDeuxPoints= chUrl.indexOf(":");
	String sousChaineAvant = chUrl.substring(0,posDuDeuxPoints);
	String sousChaineApres = chUrl.substring(posDuDeuxPoints+1,chUrl.length());
	System.out.println("sousChaineAvant="+sousChaineAvant);
	System.out.println("sousChaineApres="+sousChaineApres);
		
    String chaine = "bonjour";
    char c1='A' , c2='a' , c3='b', c4='a';
    if(c1 == c3){
    	System.out.println("c1 et c3 ont les memes valeurs");
    }
    
    if(c2 == c4){
    	System.out.println("c2 et c4 ont les memes valeurs");
    }
    
    if(chaine.equals("au revoir")){
    	System.out.println("la chaine vaut au revoir");
    }
    
    if(chaine.equals("bonjour")){
    	System.out.println("la chaine vaut bonjour");
    }
    
    
    
    
    String chaine2 = ""; //chaine vide au debut
    
    int i;
    for(i=0;i<chaine.length();i++){
		char c=chaine.charAt(i);
		//System.out.println("c:"+c);
		if(i==0) {
			chaine2 = chaine2 + String.valueOf(c).toUpperCase();
		}else{
			chaine2 = chaine2 + c;
		}
	}
    System.out.println("chaine2:" + chaine2);
    
	}

}
