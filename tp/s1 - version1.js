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
	/*
	var age = prompt("age:"); //40 ou 12 ou ...
	
	//var testVraiOuFaux= (age >=18);
	//print("testVraiOuFaux=" + testVraiOuFaux + " " + typeof testVraiOuFaux);
	//if(testVraiOuFaux){
	if(age >=18){
		print("majeur"); 
		print("au moins 18 ans");	  
		}
	 else {
		  print("mineur");
		  print("moins de 18 ans");
	 }
	*/
	
	//enregistrer dans une variable a1 une première valeur saisie via prompt()
	//enregistrer dans une variable a2 une deuxieme valeur saisie via prompt()
	//tester si a1 est plus ou pas que a2
	//et afficher soit "a1 est plus grand que a2 ou égal"
	//                 "a1 est plus petit que a2"
	/*
	var a1=prompt("a1:");
	var a2=prompt("a2:");
	if(a1>=a2){
		print("a1 est plus grand que a2 ou égal");
	}else{
		print("a1 est plus petit a2 ");
	}
	*/
	
	/*
	var b1=5;
	var b2=7;
	if((5==b1) && ( b2 > 5)){
		print("b1 et 5 ont les memes valeurs");
		print("ET on a aussi b2 qui est supérieur à 5");
	}else{
		print("b1 et 5 ont des valeurs différentes");
		print("...");
	}
	*/
	
	//en java et en javascript , && signifie ET (et aussi)
	//                           || signifie OU (ou bien)
	
	age=prompt("age:");
	//tester (avec un test inversé) avec un ou logique ( || en  javascript) 
	//si l'age saisi est compris en 20 et 30 ans
	if((age<20) || (age>30)) {
		print("l'age n'est pas entre 20 et 30");
	}else{
			print("l'age est entre 20 et 30");
	}
	
	//en java et en javascript le ! correspond à NOT (test inversé)
	//ce qui est vrai devient faux et vice versa .
	
	//if( age < 0 ){
	if( !(age >= 0)){
		print("age negatif");
	}
	
	
}