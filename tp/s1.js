function print(txt){
	document.getElementById("divA").innerHTML += (txt+"<br/>");
}


window.onload=function(){
	
	console.log("hello world 2bis");
	print("hello world");
	var a = 6; 	
	print(a);
	a=a+1;
	print(2*a);
	/*
	var nom = "toto";
	print(nom);
	nom=prompt("votre nom ?");
	print(nom);
	*/
	
	/*
	//declarer et initialiser une variable x (=0 comme valeur initiale)
	var x=0;
	//inviter l'utilisateur a choisir (saisir) la valeur de x
	//via un appel à prompt()
	x=prompt("x:");
	//constuire une autre variable y valant 2 fois la valeur de x
	y=2*x;
	//afficher la valeur de y
	print(y);
	print("y="+y);
	*/
	
	/*
	var v1; //déclare l'existence de la variable
	print(v1);  //affiche "undefined" en javascript
	v1=5;
	v2=7;
	v3=v1+v2; print(v3); //affiche 12
	print(v1); print(typeof v1); //affiche 5 et number
	v1="lundi"; 
	v2=" mardi"; 
	v3=v1+v2; print(v3); //affiche "lundi mardi"
	print(v1); print(typeof v1); //affiche lundi et string
	*/
	
	/*
	var x1=prompt("x1:"); //ex: 2 construit via prompt() comme "2"
	x1=parseInt(x1); //convertir ou transformer le "2" en 2 ("string vers number)
	var x2=prompt("x2:"); //ex: 3 vu comme "3"
	x2=parseInt(x2);
	var x3=x1+x2; // 5 ou "23"
	print("x3="+x3); //afficher 5 ou "23"
	*/
	
	var va = 5;
	var vb = 6;
	
	//mini algorithme de permutation/echange :
	var vTemp = va;
	va=vb;
	vb=vTemp;
	
	print("va="+va + " vb=" + vb);
	
	
	
	
}