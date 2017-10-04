<?php


class Cronometre {

    private $iniciCrono = NULL,
            $finalCrono = NULL,
            $iniciAbsolut = NULL,
            $finalAbsolut = NULL,
            $iniciPausa = NULL,
            $finalPausa = NULL,
            $tempsAcumulat = NULL;

    function mostrarTemps($temps) {
        //echo $temps, "\n";
        $segons = (int)$temps;
        $microsegons = $temps - $segons;
        $milisegons = (int)round($microsegons*1000);
        
        $minuts = (int)($segons / 60);
        $segons = $segons % 60;

        $str = $minuts . " m " . $segons . " s " . $milisegons . " ms";
        echo $str, "\n"; // "<br/>"
    }

    public function start() {
        echo "Start" . "\n";
        $this->iniciCrono = microtime(true);
        if (!isset($this->iniciAbsolut)) {
            $this->iniciAbsolut = $this->iniciCrono;
            $this->tempsAcumulat = 0;
        }
    }

    function stop() {
        echo "Stop" . "\n";
        if (isset($this->iniciCrono)) {
            $this->finalCrono = microtime(true);
            if (!isset($this->iniciPausa) && !isset($this->finalPausa)) {
                echo $this->iniciCrono, "\n";
                echo $this->finalCrono, "\n";
                $this->tempsAcumulat = $this->finalCrono - $this->iniciCrono;
            } else {
                if (!isset($this->iniciPausa)) {
                    $temps = $this->finalCrono - $this->finalPausa;
                    $this->tempsAcumulat += $temps;
                    echo "Temps parcial:";
                    $this->mostrarTemps($temps);
                }
            }
            echo "Temps Cronometrat:";
            $this->mostrarTemps($this->tempsAcumulat);
        }
    }

    function show() {
        echo "Show" . "\n";
        if (isset($this->iniciCrono)) {
            $ara = microtime(true);
            $tempsCronometrat = 0;
            if (isset($this->finalPausa)) {
                $temps = $ara - $this->finalPausa;
                echo "Temps parcial: ";
                $this->mostrarTemps($temps);
                $tempsCronometrat = $this->tempsAcumulat + $temps;
            } else {
                $tempsCronometrat = $ara - $this->iniciCrono;
            }
            echo "Temps Cronometrat:";
            $this->mostrarTemps($tempsCronometrat);
        }
    }

    function pause() {
        echo "Pause" . "\n";
        if (!isset($this->iniciPausa) && isset($this->iniciCrono)) {
            $this->iniciPausa = microtime(true);
            if (!isset($this->finalPausa)) {
                $this->tempsAcumulat = $this->iniciPausa - $this->iniciCrono;
            } else {
                $this->tempsAcumulat += $this->iniciPausa - $this->finalPausa;
            }
            echo "Temps parcial:";
            $this->mostrarTemps($this->tempsAcumulat);
        }
        $this->finalPausa = NULL;
    }

    function resume() {
        echo "Resume" . "\n";
        if (isset($this->iniciPausa) && isset($this->iniciCrono)) {
            $this->iniciPausa = NULL;
            $this->finalPausa = microtime(true);
        }
    }

    function reset() {
        echo "Reset" . "\n";
        $this->iniciCrono = $this->finalCrono = NULL;
        $this->iniciPausa = $this->finalPausa = NULL;
    }

    function kill() {
        echo "kill" . "\n";
        if (isset($this->iniciAbsolut)) {
            $this->finalAbsolut = microtime(true);
            $temps = $this->finalAbsolut - $this->iniciAbsolut;
            echo "Temps funcionant:";
            $this->mostrarTemps($temps);
            $this->iniciAbsolut = $this->finalAbsolut = NULL;
            $this->reset();
        }
    }

}

$c1 = new Cronometre();

$c1->start();
$c1->start();
usleep(200000); // microsegons
$c1->pause();
$c1->pause();
usleep(200000);
$c1->resume();
$c1->resume();
usleep(200000);
$c1->show();
usleep(200000);
$c1->kill();
$c1->stop();
$c1->kill();

$c1->reset();
usleep(200000);
$c1->pause();
usleep(200000);
$c1->start();
$c1->pause();
usleep(200000);
$c1->resume();
$c1->stop();
$c1->kill();
