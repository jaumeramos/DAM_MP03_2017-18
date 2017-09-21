package dia_20170921;

public class Poligon {

    int numPunts;
    int puntActual;
    Punt punts[];

    
    
    public Poligon(int numCostats) {
        this.numPunts = numCostats;
        punts = new Punt[numPunts];
        puntActual = 0;
    }
    
    public Poligon(Punt punts[]){
        this.numPunts = punts.length;
        this.puntActual = this.numPunts;
        this.punts = punts;
    }

    public void afegirCostat(Punt p) {
        if (puntActual < numPunts) {
            punts[puntActual++] = p;
        } else {
            System.out.println("No pots afegir més punts");
        }
    }

    public double perimetre() {
        if (puntActual < numPunts) {
            System.out.println("Falten punts");
            return 0;
        } else {
            double perim = 0;
            for (int i = 0; i < this.numPunts; i++) {
                int j = i + 1;
                if (j >= this.numPunts) {
                    j = 0;
                }
                System.out.println("I: " + i + " J: " + j);
                perim += this.punts[i].distanciaPunt(this.punts[j]);

            }
            return perim;
        }

    }

}
