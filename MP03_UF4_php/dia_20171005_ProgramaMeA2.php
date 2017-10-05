<?php
/*
    Rebem coma entrada un nombre amb el valor de la suma de dígits.
    Després rebem una serie de nombres acabada amb zero.
    Cal mostrar el menor dels nombres positius la suma dels dígits del qual
    sigui igual al primer nombre entrat.
    
    Exemple d'entrada
    8
    91
    23
    19
    0
    
    Exemple de sortida
    19    
    
    */

$menor = PHP_INT_MAX;

fscanf(STDIN, "%d\n", $sumaDigits);
fscanf(STDIN, "%d\n", $numStr);
while ($numStr != 0) {
    $suma = 0;
    for ($i = 0; $i < strlen($numStr); $i++) {
        $suma += (int) substr($numStr, $i, 1);
    }
    if ($suma == $sumaDigits) {
        if ((int) $numStr < $menor) {
            $menor = $numStr;
        }
    }
    fscanf(STDIN, "%d\n", $numStr);
}
echo $menor, "\n";
