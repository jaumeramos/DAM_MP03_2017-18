

/*
   No cal definir el tipus de variable.
   Només hi ha tres tipus primitius: Nombres, Booleans, Cadenes 
   Hi ha dos tipus complexos: Objectes i Funcions
   Hi ha dos tipus especials: null i undefined
*/
/*
var senseDefinir;
console.log(senseDefinir); // undefined

var nombre = 123;
nombre = 123.45;
nombre = 123e4;
numter = 123e-5;

var boolean = true;
var cadena = "cadena";
var nombre = 123;
var objecte = null; // null es fa servir per indicar que una referència no apunta enlloc

objecte = {atribut1:"valorAtr1"};  // Un objecte és un conjunt de propietats


// Per saber quin tipus de dades hi ha en una variable cal fer servir typeof
console.log(typeof(nombre));            // nombre
console.log(typeof(cadena));            // string
console.log(typeof(boolean));           // boolean
console.log(typeof(objecte));           // object
console.log(typeof(null));              // null
console.log(typeof(noExisteix));        // undefined
console.log(typeof(function(){}));      // function



var nullVar = null;
console.log(typeof(nullVar));             
console.log(typeof(null));         


console.log(3 === "3"); //false
console.log(3 == "3"); //true


console.log(null === undefined); //false
console.log(null == undefined);  //true

var num = 3 * "aa";
console.log(num);
console.log(isNaN("145.0"));



// Wrappers, tenen funcions auxiliars. Converteixen els tipus
var num = Number("123");                
console.log(num);           
console.log(typeof num);

var bool = Boolean(3);
console.log(bool);          // true

var str = String(bool);
console.log(str);           // "true"


function saludar () { // funció amb nom
    console.log("Hola mon!");
};
saludar();

var s =  function () { // funció amb nom
    console.log("Hola mon!");
};
s();

// Callback
var ferAlgunaCosa = function (queFer) {
 queFer();
};
ferAlgunaCosa(s);
ferAlgunaCosa(saludar);



// Hoisting
saludar();

function saludar () { // funció amb nom
    console.log("Hola mon!");
};


var a = "hola";

var nivell = "nivell0";

var fn1 = function(){
    
     var nivell = "nivell1";
    
    var fn2 = function(){
        return nivell;
    }
    
    return fn2();    
};
console.log(fn1());
//fn2();

*/

function parametresOpcionals(p1){
	console.log(arguments.length);      //5
	console.log(arguments); 		// objecte amb els paràmetres (es gestiona igual que un array)

	console.log(arguments["0"]);		// Primer argument
};
parametresOpcionals(111,2,3,4,5);

function potencia (){
    console.log(arguments);
    if (arguments.length == 2){
        return pot(arguments[0], arguments[1]);
    } else if (arguments.length == 1){
        return pot(arguments[0], 2);
    } else {
        return 0;
    }
    function pot(base, exponent){
        var result = 1;
        for (var i =0; i<exponent;i++){
            result *= base;
        }
        return result;
    }
    
}

console.log(potencia(4));
console.log(potencia(4, 3));