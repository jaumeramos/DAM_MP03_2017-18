<?php

class PrimeraClasse {
    
    var $atribut = "Atr. Public";
    public static $pub = "public";
    private  $priv = "privat";
    protected  $proc = "protected";
    
    function __construct($param) {
        //$this->atribut = "Modificat al Constructor";
        $this->atribut = $param;
    }    
    
    public function mostrar(){
        echo $this->atribut;
    }
    
    public static function mostrarEstatic(){
        echo PrimeraClasse::$pub;        
    }
    
    public function parametresVariables(){
        $params = func_get_args();
        $numParams = func_num_args();
        
        //var_dump($params);
        echo $numParams . "\n";
        print_r ($params);
    }
    
}

/*
$obj = new PrimeraClasse("Objecte 1 \n");
$obj1 = new PrimeraClasse(123456);

$obj->parametresVariables(1, 'a', 3.4, "hola");

PrimeraClasse::mostrarEstatic();


$var = 0;

echo "empty() " , var_dump(empty($var));
echo "isset() " , var_dump(isset($var));
echo "is_null()" , var_dump(is_null($var));


$a = true; //boolean
var_dump($a);

$a = 4;  // integer
var_dump($a);

$a = 4.0;  // float
var_dump($a);

$a = 'c'; // string
var_dump($a);

$a= array(); // array
var_dump($a);

$a= new PrimeraClasse("O1"); // object
var_dump($a);


var_dump(3 + 4.0);
var_dump(3 + 4);
var_dump(3 + "7.5");
var_dump("a3" . 7.5);


var_dump(3 + (int)4.9);
var_dump((float)3 + 4.9);
var_dump((float)3 + 4);

var_dump((string)3 + 4);


var_dump((bool)0); //false
var_dump((bool)0.0); //false
var_dump((bool)"0"); //false
var_dump((bool)""); //false
var_dump((bool)array()); //false
var_dump((bool)NULL); //false

*/

class Punt {
    
    private $x;
    private $y;
    
    function __construct($x, $y) {
        $this->x = $x;
        $this->y = $y;
    }
    
    function getX(){
        return $this->x;
    }
    function getY(){
        return $this->y;
    }
    
    
    public function  distanciaX($p){
        return ($p->x - $this->x);
    }
    public function  distanciaY($p){
        return ($p->y - $this->y);
    }
    
    public function  distanciaPunt($p){
        return sqrt(pow(($p->x - $this->x),2)+pow(($p->y - $this->y),2));
    }


    public static function demanarPunt(){
        
        $x=0;
        $y=0;
        
        fscanf(STDIN, "%d\n", $x);
        fscanf(STDIN, "%d\n", $y);
        
        return new Punt($x, $y);
    }
    
}

$p = new Punt(0,0);
var_dump($p);

$p1 = new Punt (4,4);
var_dump($p1);

echo $p->distanciaX($p1);
echo $p->distanciaY($p1);
echo $p->distanciaPunt($p1);
