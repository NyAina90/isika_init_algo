package p;

import java.util.ArrayList;

public class MainClassTestRectangle {

	public static void main(String[] args) {
       Rectangle r1 = new Rectangle();
       //vocabulaire : les objets dynamiquement constuits avec "new"
       //sont rangés dans une zone mémoire appelé "tas" ou "heap".
       r1.largeur=100;
       r1.longueur=200;
       double surfaceR1 = r1.aire();
       System.out.println("r1 a une largeur de " + r1.largeur);
       System.out.println("surface de r1="+surfaceR1);

       Rectangle r2 = new Rectangle();
       r2.largeur=25;
       r2.longueur=40;
       double surfaceR2 = r2.aire();
       System.out.println("surface de r2="+surfaceR2);
       
       ArrayList<Rectangle> listeRectangle= new ArrayList<Rectangle>();
       listeRectangle.add(r1);
       listeRectangle.add(r2);
       int i;
       for(i=0;i<listeRectangle.size();i++){
    	   System.out.println("longueur du rectangle=" 
                              + listeRectangle.get(i).longueur);
       }
       
	}

}
