<?php

class PrimeraClasse {
    
    public static $atribut = "Atribut";
    
    public static function mostrar(){
        echo PrimeraClasse::$atribut;
    }    
    
}

class SegonaClasse {
}
$obj = new PrimeraClasse;
$obj1 = new PrimeraClasse;

PrimeraClasse::$atribut = 23;

PrimeraClasse::mostrar();

//$obj1::mostrar();