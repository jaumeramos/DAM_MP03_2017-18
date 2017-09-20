
package dia_20170920;




public class A1_Cronometre {

    private long iniciAbsolut;
    private long finalAbsolut;

    private long iniciCrono;
    private long finalCrono;

    private long iniciPausa;
    private long finalPausa;

    private long tempsAcumulat;

    private boolean iniciat = false;
    private boolean pausat = false;

    /* El mètode start ha de engegar el cronòmetre i començar a comptar.
     * Només es pot cridar un cop. Si es torna a cridar cal informat que ja està engegat.
     * Després de fer reset cal tornar a engegar-lo.
     */
    public void start() {
        System.out.println("Start");
        if (!this.iniciat) {
            this.iniciCrono = System.currentTimeMillis();
            if (this.iniciAbsolut == 0) {
                this.iniciAbsolut = this.iniciCrono;
            }
            this.tempsAcumulat = 0;
            this.iniciat = true;
        } else {
            System.out.println("Crono ja engegat");
        }

    }

    /*  El mètode stop ha d'aturar el cronòmetre i mostrar el temps de la darrera pausa (si hi és i el temps total cronometrat  
     */
    public void stop() {
        System.out.println("Stop");
        if (this.iniciat) {
            this.finalCrono = System.currentTimeMillis();
            this.iniciat = false;
            if (!this.pausat) {
                if (this.finalPausa == 0) {
                    this.tempsAcumulat += this.finalCrono - this.iniciCrono;
                } else {
                    long temps = this.finalCrono - this.finalPausa;
                    System.out.println("Temps parcial: ");
                    mostrarTemps(temps);
                    this.tempsAcumulat += temps;
                }
            } else {
                this.pausat = false;
            }
            System.out.println("Temps cronometrat: ");
            mostrarTemps(this.tempsAcumulat);

            long temps = this.finalCrono - this.iniciCrono;
            System.out.println("Temps Engegat: ");
            mostrarTemps(temps);
        } else {
            System.out.println("Crono ja aturat");
        }
    }

    /* El mètode show ha de mostrar el temps cronometrat
     */
    public void show() {
        System.out.println("Show");
        if (this.iniciat) {

            if (this.pausat) {
                System.out.println("Temps Acumulat: ");
                mostrarTemps(this.tempsAcumulat);
            } else {
                long ara = System.currentTimeMillis();
                long temps = 0;
                if (this.finalPausa == 0) {
                    temps = ara - this.iniciCrono;
                } else {
                    temps = ara - this.finalPausa;
                    System.out.println("Temps parcial: ");
                    mostrarTemps(temps);
                    temps += this.tempsAcumulat;
                }
                System.out.println("Temps cronometrat: ");
                mostrarTemps(temps);
            }

        } else {
            System.out.println("Crono no iniciat");
        }
    }

    /* El mètode pause ha de pausar el cronòmetre (no segueix comptant)
     * Mostra el temps acumulat
     */
    public void pause() {
        System.out.println("Pause");
        if (this.iniciat) {
            if (!this.pausat) {
                this.iniciPausa = System.currentTimeMillis();
                this.pausat = true;
                if (this.finalPausa == 0) {
                    this.tempsAcumulat += (this.iniciPausa - this.iniciCrono);
                    System.out.println("Temps parcial: ");
                    mostrarTemps(this.tempsAcumulat);
                } else {
                    long temps = this.iniciPausa - this.finalPausa;
                    this.tempsAcumulat += temps;
                    System.out.println("Temps parcial: ");
                    mostrarTemps(temps);
                }
            } else {
                System.out.println("Crono ja pausat");
            }
        } else {
            System.out.println("Crono no iniciat");
        }
    }

    /* ha de seguir comptant després d'una pausa
     * El mètode resume no es pot fer servir si abans no s'ha cridat a pause.
     */
    public void resume() {
        System.out.println("Resume");
        if (this.iniciat) {
            if (this.pausat) {
                this.finalPausa = System.currentTimeMillis();
                this.pausat = false;
            } else {
                System.out.println("Crono no pausat");
            }
        } else {
            System.out.println("Crono no iniciat");
        }
    }

    /*El mètode reset ha de posar tots els valors a zero, igual que al crear el cronòmetre.
     * Els mètodes kill i reset només es poden cridar amb el cronòmetre aturat.
     */
    public void reset() {
        System.out.println("Reset");
        if (!this.iniciat) {
            this.iniciCrono = this.finalCrono = 0;
            this.iniciPausa = this.finalPausa = 0;
        } else {
            System.out.println("Crono no aturat");
        }
    }

    /* El mètode kill ha de mostrar el temps total que ha estat funcionant el cronòmetre.    
     * Els mètodes kill i reset només es poden cridar amb el cronòmetre aturat.
     */
    public void kill() {
        System.out.println("Kill");
        if (!this.iniciat) {
            this.finalAbsolut = System.currentTimeMillis();
            long temps = this.finalAbsolut - this.iniciAbsolut;
            System.out.println("Temps amb el crono actiu: ");
            mostrarTemps(temps);
        } else {
            System.out.println("Crono no aturat");
        }
    }

    private void mostrarTemps(long temps) {
        String str = new String();
        long minuts = temps / 60000;
        if (minuts >= 1) {
            str += minuts + " m ";
            temps = temps % 60000;
        }
        long segons = temps / 1000;
        if (segons >= 1) {
            str += segons + " s ";
            temps = temps % 1000;
        }
        str += temps + " ms ";

        System.out.println(str);
    }

    private static void sleep(long temps) {
        try {
            Thread.sleep(temps);
        } catch (InterruptedException e) {
            System.out.println("WTF!!!!");
        }
    }

    public static void main(String[] args) {
        A1_Cronometre c1 = new A1_Cronometre();

        c1.start();
        c1.start();
        sleep(200);
        c1.pause();
        c1.pause();
        sleep(200);
        c1.resume();
        c1.resume();
        sleep(200);
        c1.show();
        sleep(200);
        c1.kill();
        c1.stop();
        c1.kill();

        c1.reset();
        sleep(200);
        c1.pause();
        sleep(200);
        c1.start();
        c1.pause();
        sleep(200);
        c1.resume();
        c1.stop();
        c1.kill();
    }

}