package tp;

public class App {
	
	public static String prompt(String invite) {
		System.out.println(invite);
		java.util.Scanner reader = new java.util.Scanner(System.in);
		return reader.next();
	}

	public static void main(String[] args) {
		// commentaire
		String v1="titi2"; 
		v1="Toto";
	    v1=prompt("nom:");
		int v2=12;
		double  v3=12.5;
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		System.out.println("v3="+v3);
	}

}
