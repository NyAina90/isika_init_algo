package p;

import java.util.ArrayList;

public class MainClassTestCercle {

	public static void main(String[] args) {
       Cercle c1 = new Cercle();
       //vocabulaire : les objets dynamiquement constuits avec "new"
       //sont rangés dans une zone mémoire appelé "tas" ou "heap".
       c1.xc=100;c1.yc=50;
       c1.rayon=200;
       double prerimetreC1 = c1.perimetre();
       System.out.println("c1 a un perimetre de " + prerimetreC1);
       
       Cercle c2 = new Cercle();
       
       ArrayList<Cercle> listeCercle= new ArrayList<Cercle>();
       listeCercle.add(c1);
       listeCercle.add(c2);
       int i;
       for(i=0;i<listeCercle.size();i++){
    	   System.out.println("rayon du cercle=" 
                              + listeCercle.get(i).rayon);
       }
       
	}

}
