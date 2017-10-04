<?php

include 'fitxer.php';
include_once 'fitxer.php';

class Punt {

    private $x;
    private $y;

    function __construct($x, $y) {
        $this->x = $x;
        $this->y = $y;
    }

    function getX() {
        return $this->x;
    }

    function getY() {
        return $this->y;
    }

    public function distanciaPunt($p) {
        return sqrt(pow(($p->x - $this->x), 2) + pow(($p->y - $this->y), 2));
    }

    public function distanciaX($p) {
        return ($p->x - $this->x);
    }

    public function distanciaY($p) {
        return ($p->y - $this->y);
    }

    public static function demanarPunt() {

        echo "Entra els dos punts separats per intro (el separador decimal és coma)";

        $x = 0;
        $y = 0;
        fscanf(STDIN, "%d\n", $x);
        fscanf(STDIN, "%d\n", $y);

        return new Punt($x, $y);
    }

    public function toString() {
        return "(" . $this->x . ", " . $this->y . ")";
    }

}

class Rectangle {

    private $p1;
    private $p2;
    private $p3;
    private $p4;

    public function __construct($p1, $p2, $p3, $p4) {
        $this->p1 = $p1;
        $this->p2 = $p2;
        $this->p3 = $p3;
        $this->p4 = $p4;
    }

    public static function puntsDiagonal($p1, $p3) {
        return new self($p1, new Punt($p1->getX(), $p3->getY()), $p3, new Punt($p3->getX(), $p1->getY()));
    }

    public function calcularPerimetre() {
        return 2 * ($this->p1->distanciaX($this->p3) + $this->p1->distanciaY($this->p3));
    }

    public function calcularArea() {
        return ($this->p1->distanciaX($this->p3) * $this->p1->distanciaY($this->p3));
    }

    public function calcularCentre() {
        return new Punt($this->p1->getX() + $this->p1->distanciaX($this->p3) / 2, $this->p1->getY() + $this->p1->distanciaY($this->p3) / 2);
    }

}

echo "entra punt A";
$punt = Punt::demanarPunt();

$r = new Rectangle (Punt::demanarPunt(), Punt::demanarPunt(), new Punt(4,4), new Punt(4,4));

$a = new Punt(0,0);
$p = Rectangle::puntsDiagonal($a, new Punt(4,4));

echo $p->calcularArea();

