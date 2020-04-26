package p;

public class MainClass3 {

	public static void main(String[] args) {
		double x=12.6;
		double y=8.9;
		System.out.println("x=" + x + " et y="+y);
		double resMini = minimumV2(x,y);
		double resMaxi = maximum(x,y);
        //+affichage resultats
		System.out.println("mini de x et de y =" + resMini);
		System.out.println("maxi de x et de y =" + resMaxi);
	}
	
	static double minimum(double a,double b){
		double res=0;
		if(a<=b){
			res=a;
		}else{
			res=b;
		}
		return res;
	}
	
	static double minimumV2(double a,double b){
		double res=(a<=b)?a:b;
		return res;
	}
	
	/*
	static double maximum(double a,double b){
		double res=0;
		if(a>=b){
			res=a;
		}else{
			res=b;
		}
		return res;
	}*/
	
	static double maximum(double a,double b){
		return miniOuMaxi("max",a,b);
	}
	
	//TP facultatif (pour ceux qui vont vite et qui s'ennuient):
	// reprogrammer minimum() et maximum() en appelant en interne
	// miniOuMaxi("min",a,b); ou miniOuMaxi("max",a,b);
	
	/*
	static double miniOuMaxi(String minOuMax,double a,double b){
		double res=0;
		if(minOuMax == "min"){
			if(a<=b){
				res=a;
			}else{
				res=b;
			}
		}
		else {
			if(a>=b){
				res=a;
			}else{
				res=b;
			}
		}
		return res;
	}
	*/
	
	
	static double miniOuMaxi(String minOuMax,double a,double b){
		double res=0;
		if(minOuMax=="min"){
             res = a<=b ? a : b;
		}else{
	         res = a>=b ? a : b;
		}
		return res;
	}
	
}
