package p;

//Une classe est avant tout un nouveau type de donn�es
//structur� avec diff�rentes sous parties
//ici .largeur et .longueur

public class Cercle {
	public double xc,yc;
	public double rayon;
	//...
	public double perimetre(){
		return 2*Math.PI*rayon;
	}

}
