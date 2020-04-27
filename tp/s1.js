function print(txt){
	document.getElementById("divA").innerHTML += (txt+"<br/>");
}


window.onload=function(){
	
	print("suite tableau et boucles");
	
	var tableau2 = [ 23 , 167 , 50 , 256 , 512 , 85 ];
	
	//objectif des lignes de code qui vont suivrent :
	//trouver la première position(indice) de l'élément dont la valeur vaut 256
	
	var positionElt256; //inconnue avant recherche
	for(i=0;i<tableau2.length;i++){
		if(tableau2[i]==256){
			positionElt256=i;
			break; //sortie anticipée de boucle
			       //on sort de la boucle avant d'arriver sur
				   //les derniers éléments du tableau
		}
	}
	print("positionElt256=" + positionElt256); //affiche ici 3
	
	var z=36;
	var r = Math.sqrt(z); //racinne caréee (square root)
	print("r="+r);
	var tableau3 = [ -3 , 16 , -8 , 9 , -8 , 25 ];
	//tp : parcours les éléments du tableau 3
	//et on affiche la racinne carrée du ieme élément s'il est positif
	
	
}