function print(txt){
	document.getElementById("divA").innerHTML += (txt+"<br/>");
}


window.onload=function(){
	console.log("hello world");
	print("hello world");
	var a = 5;
	print(a);
	print(2*a);
	
}