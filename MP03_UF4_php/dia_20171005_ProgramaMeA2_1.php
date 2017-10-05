<?php
    /*
    Rebem un nombre que indica la suma de dígits volguda.
    Hem de mostrar el menor enter la suma dels dígits del qual sigui 
    el nombre entrat.
    Si la solució es fà amb un bucle símple el programa tardarà molt temps.
    
    Exemple d'entrada:    
    3
    10
    18
    19
    0
    
    Exemple de sortida:
    3
    19
    99
    199
    
     */


fscanf(STDIN, "%d\n", $num);
while ($num != 0) {
    
    if ($num > 0) {
        $nous = $num / 9;
        $primer = $num % 9;
        
        $resultat = "";
        if ($primer > 0) {
            $resultat = (string) $primer;
        }
        for ($i = 1; $i <= $nous; $i++) {
            $resultat .= "9";
        }
        echo $resultat, "\n";
    }

    fscanf(STDIN, "%d\n", $num);
}
echo $menor;
