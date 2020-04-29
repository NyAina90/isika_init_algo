package tp;

public class App5 {

	public static void main(String[] args) {
		
		int valAleatoire = (int) (100 * Math.random()); //a faire deviner :
		//System.out.println("valAleatoire="+valAleatoire);
		int valeurProposee=-1;
		int nbEssais= 0;
		java.util.Scanner reader = new java.util.Scanner(System.in);
		while(valeurProposee!=valAleatoire) {
			System.out.print("nombre a deviner (entre 0 et 100):");
			valeurProposee=  reader.nextInt();
			nbEssais++;
			System.out.println("valeurPoposee="+valeurProposee);
			if(valeurProposee>valAleatoire) {
				System.out.println("valeur trop grande");
			}
			if(valeurProposee<valAleatoire) {
				System.out.println("valeur trop petite");
			}
			if(valeurProposee==valAleatoire) {
				System.out.println("bravo , vous avez deviné le nombre");
				System.out.println("nombre=" + valAleatoire);
				System.out.println("nbEssais=" + nbEssais);
			}
		}
		reader.close();
		System.out.println("fin du programme. Relancez le pour Rejouer");
	}

}
