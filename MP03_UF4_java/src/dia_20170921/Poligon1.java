package dia_20170921;

public class Poligon1 {

    Punt[] punts;
    int numCostats;
    int puntActual;

    public Poligon1(Punt punts[]) {
        this.punts = punts;
        this.numCostats = punts.length;
        this.puntActual = this.numCostats;
    }

    public Poligon1(int numCostats) {
        this.numCostats = numCostats;
        punts = new Punt[numCostats];
        this.puntActual = 0;
    }

    public void afegirPunt(Punt p) {
        if (this.puntActual < this.numCostats) {
            punts[this.puntActual++] = p;
        } else {
            System.out.println("Massa punts");
        }
    }

    public double calcularPerimetre() {
        double perimetre = 0;
        if (this.puntActual == this.numCostats) {
            for (int i = 0; i < this.numCostats; i++) {
                int j = i + 1;
                if (j >= this.numCostats) {
                    j = 0;
                }
                perimetre += punts[i].distanciaPunt(punts[j]);
            }
            return perimetre;
        } else {
            System.out.println("Falten punts");
            return perimetre;
        }
    }

    public static Poligon1 demanarPoligon() {

        Punt p1;
        Punt p2;
        Punt p3;

        Punt punts[] = {new Punt(0, 1), new Punt(3, 2), new Punt(4, 4)};

        return new Poligon1(punts);
    }

    public static void main(String[] args) {

        Punt punts[] = {new Punt(0, 0), new Punt(0, 2), new Punt(2, 2), new Punt(2, 0)};

        Poligon1 p = new Poligon1(punts);

        System.out.println(p.calcularPerimetre());

        Poligon1 p2 = new Poligon1(4);

        p2.afegirPunt(new Punt(0, 0));
        p2.afegirPunt(new Punt(0, 2));
        p2.afegirPunt(new Punt(2, 2));
        //p2.afegirPunt(new Punt(2,0));

        System.out.println(p2.calcularPerimetre());

    }

}
