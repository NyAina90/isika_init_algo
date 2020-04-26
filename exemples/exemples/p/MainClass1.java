package p;

public class MainClass1 {

	public static void main(String[] args) {
		String message = "welcome";
		// int = type prédéfini numérique (entier/integer)sans virgule
		int age;// déclaration (de l'existance) d'une variable (avec type précis
				// int)
		age = 20; // affectation d'une valeur initiale
		// simple (un seul) = correspond à l'opérateur d'affectation de nouvelle
		// valeur
		age = age + 1;
		System.out.println("age=" + age);
		// boolean vraiOuFauxAgeSuperieurA18 = age >= 18;
		// if(vraiOuFauxAgeSuperieurA18){ ... }else { ...}
		if (age >= 18) {
			System.out.println("age d'une personne majeure");
			System.out.println("avec droit de vote");
		} else {
			System.out.println("age d'une personne mineure");
		}

		// float et double sont des types pédéfinis (nombre réel) avec virgule
		double prix = 12.56;
		
		prix = prix - 1.50; // si promotion
		System.out.println("prix=" + prix);
		// boolean = type de données prédéfini (false / true)
		// codé quelquefois comme 0 ou 1 au niveau du micro-processeur
		boolean vraiOuFaux = false;
		vraiOuFaux = (2 + 3) == 5; // == test si les choses de chaque coté sont
									// égales ou pas
		System.out.println("vraiOuFaux (2+3 vaut 5) =" + vraiOuFaux);
		message = message + " AI 102";
		System.out.println("message=" + message);
		
		String chAge="30";
		int valAge = Integer.parseInt(chAge);
		valAge = valAge+1;
		System.out.println("valAge="+valAge);
		
		
	}

}
