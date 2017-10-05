
var a = 123; // number
a = "hola"; // string
a = true; // boolean

a = function(){
    console.log("funcio!!");
} // function

a = null; // null
a = 123;
a = 1223.45;
a = 1.2e4;
a = 1.2e-4;

var b; // undefined

var objecte = {};
//console.log(objecte);

var objecte1 = {atribut: "ValorAtribut"};
/*
console.log(objecte1);
console.log(objecte1.atribut);
a="atribut";
console.log(objecte1 [a]);
objecte1.nouAtribut = 1234;

console.log(objecte1);

delete objecte1.atribut;
console.log(objecte1);

console.log("nouAtribut" in objecte1);

console.log(objecte1.atributNoExistent);
*/
/*
var objecte2 = objecte1;
console.log(objecte2);
objecte2.atribut = "Canviat";
objecte2.nouAtribut = 123;
console.log(objecte2);
console.log(objecte1);

objecte2 = null;
console.log(objecte2);
console.log(objecte1);
objecte2 = function(){};
console.log(objecte2);
console.log(objecte1);

console.log(typeof objecte2);

// Tipus de Dades
console.log(typeof 112); // number
console.log(typeof 'v'); // string
console.log(typeof true); // boolean
console.log(typeof {}); // object
console.log(typeof function(){}); // number
*/
// callback

function f1(p1){
    if (typeof p1 == "function"){     
        p1();   
    }
}

f1(function(){console.log("Callback")});
f1(123);

//IIFE
(function(p1){
    console.log("IIFE " + p1);
})("hola");







