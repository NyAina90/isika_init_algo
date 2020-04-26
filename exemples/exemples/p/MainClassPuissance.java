package p;

public class MainClassPuissance {
	public static void main(String[] args) {
		System.out.println("3 puissance 4 = " + puissance(3,4));
		System.out.println("factorielle de 4 = " + factorielle(4));
	}
	
	//fonction recursive = fonction qui s'appelle elle meme
	static double puissance(double x,int n){
		if(n==0) { return 1; }
		else { return x * puissance(x,n-1); }
	}
	
	//factorielle(n) = n * n-1 * n-2 * ...
	static double factorielle(int n){
		if(n==0) { return 1; }
		else { return n * factorielle(n-1); }
	}
	
	//tp facultatif complexe:
	//comprendre et coder en java le quicksort
	//code fourni en javascript dans "exemples"
}
