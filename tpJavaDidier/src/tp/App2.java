package tp;

public class App2 {
	
	//void = type tr�s sp�cial (pas de valeur de retour)
	public static void print(String message) {
			System.out.println(message);
			//pas de return ...
		}
		
	public static double retournerLaPlusPetiteValeur(double a, double b){
		/*
		if(a<=b) {
			return a;
		}else {
			return b;
		}
		*/
		double res=0;
		if(a<=b) {
			res= a;
		}else {
			res= b;
		}
		return res;
	}

	public static void main(String[] args) {
		print("app2");
		double res1 = retournerLaPlusPetiteValeur(6,8);
		print("res1 (plus petite valeur)="+res1);
		res1 = retournerLaPlusPetiteValeur(78,34);
		print("res1 (plus petite valeur)="+res1);
	}

}
