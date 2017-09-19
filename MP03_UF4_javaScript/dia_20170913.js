//console.log("Hola JavaScript");

var nom = "hola";

var objecte = {
    nom: "Jaume",
    poble: "Rasquera",
    codiPostal: 43513,
    
    mostrar: function(){
        console.log("Sóc una funció " + this.nom + " " + this.codiPostal);
    },
    
    canviar: function(nom){
        this.nom = nom;
    }
    
    
    
}

objecte.codiPostal = 44444;

var objecte1 = objecte;

objecte1.codiPostal = 55555;
objecte1.canviar("Pere");


objecte.mostrar();
objecte1.mostrar();

var a = function (){  console.log("Estic a una funció!");}
a();

var b= a;
b();

function c(){  console.log("Estic a una funció amb nom!");}
c();
function prova(p){
    p();
}

prova(function(){console.log("Estic passant aquesta funció")});
