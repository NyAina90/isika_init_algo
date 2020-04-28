package tp;

public class App {
	
	public static String prompt(String invite) {
		System.out.println(invite);
		java.util.Scanner reader = new java.util.Scanner(System.in);
		String res=  reader.next();
		reader.close();
		return res;
	}
	
	public static double multiplier(double a,double b) {
		double res=a*b;
		return res;
	}
	
	public static int doubleDe(int a) {
		int res=a*2;
		return res;
	}

	public static void main(String[] args) {
		double res1 = multiplier(5.0,2.0);
		System.out.println("res1="+res1);
		int res2=doubleDe(3);
		System.out.println("res2="+res2);
		// commentaire
		String v1="titi2"; 
		v1="toto";
	    //v1=prompt("nom:");
		int v2=13;
		double  v3=12.5;
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		System.out.println("v3="+v3);
	}

}
