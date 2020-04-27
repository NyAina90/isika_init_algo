function print(txt){
	document.getElementById("divA").innerHTML += (txt+"<br/>");
}


window.onload=function(){
	
	print("tableaux et boucles");
	
	//un tableau correspond à un paquet de cases mémoires qui se suivent
	//(consécutives)
	//les positions (indices) des éléments du tableau vont de 0 à n-1
	var tableau1 = [ 231 , 24 , 100 , 50 ];
	print("tableau1=" + tableau1);
	print("premier element du tableau=" + tableau1[0] );
	var taille = tableau1.length;
	print("taille du tableau=" + taille);
	print("dernier element du tableau=" + tableau1[taille - 1] );
	
	var i=0;
	while(i<taille){
		print("element en position " + i + " = " + tableau1[i] );
		i++; // équivalent à i=i+1;
	}
	
	print("dans ordre inverse:"  );
	i= taille - 1;
	//en Tp , boucle while inversée pour afficher les éléments du 
	//dernier au premier:
	while(i>=0){
		print("element en position " + i + " = " + tableau1[i] );
		i--; // équivalent à i=i-1;
	}
	
	//autre application de la boucle while
	//rejouer un bloc d'instructions tant qu'on le souhaite:
	var envieDeContinuer="oui";
	while(envieDeContinuer!="non") //ou bien != "fin"
	{
		var x=prompt("x:");
		var y=2*x;
		print("y="+y);
		envieDeContinuer=prompt("envieDeContinuer(oui ou non):");
	}
	
}