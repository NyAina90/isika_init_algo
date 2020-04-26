package p;

import java.util.Scanner;
public class MainClass8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("chaine:");
		String chaine= reader.next();
		if(testPalindrome(chaine)){
			System.out.println(chaine + " est un palindrome (dans les 2 sens)");
		}
		else {
			System.out.println(chaine + " n'est pas un palindrome");
		}
	}
	
	
	static boolean testPalindrome(String ch){
		boolean res=true;
		int n = ch.length();
		int i=0;
		int j=n-1;
		while(i<=j){
			//ne pas tenir compte des éventuels caractères espace (' ' ou '_'):
			while(i<n &&  ( ch.charAt(i)==' ' || ch.charAt(i)=='_')){
				i++;
			}
			while(j>=0 && ( ch.charAt(j)==' ' || ch.charAt(j)=='_')){
				j--;
			}
			if(i<=j){
				if( ch.charAt(i) != ch.charAt(j) ){
					res=false;
					break;
				}else{
					i++;
					j--;
				}
			}
		}
		return res;
	}
}
