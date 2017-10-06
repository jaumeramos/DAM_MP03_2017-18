// O1: Definir i crear un objecte (Object Literal)

var obj = { 
    propietat_1:   1,           // Identificador
    2:             "Valor2",    // Nombre
    "Propietat tercera":      333          // Cadena
}; 
console.log(obj);
console.log(obj.propietat_1);
console.log(obj["2"]);

// O2 A partir del constructor de Object (objecte anònim)
var obj1 = new Object();
console.log(obj1);
obj1.propietat_1 = 1;
console.log(obj1);

//O3 A partir del constructor
function ObjecteGuai(p1){
    this.propietat1 = p1;
    this.propietat2 = 123;
}
var obj2 = new ObjecteGuai("hola");
console.log(obj2);

//O4 a partir del prototipus d'un objecte
var obj3 = Object.create(obj2);
console.log(obj3);

// prototipus
ObjecteGuai.prototype.propietatNova = "canvi al prototipus";
//obj3.propietatNova = "objecte 3";
console.log(obj3);
console.log(obj3.propietatNova);
console.log(obj2.propietatNovaa);

function ObjecteMetodes(p1){
    this.propietat1 = p1;
    this.mostrar = mostrar;
    function mostrar(){
        console.log("funcio mostrar");
        return 2;
    }
}
var obj4 = new ObjecteMetodes("hola");
console.log(obj4);
obj4.mostrar();



