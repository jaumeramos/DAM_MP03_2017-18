package dia_20171018_Activitat_A3;

public class Cercle implements FiguraGeometrica{
    
    Punt centre;
    float radi;
    
    public Cercle(Punt centre, float radi){
        this.centre = centre;
        this.radi = radi;
    }

    public Punt getCentre() {
        return centre;
    }

    public float getRadi() {
        return radi;
    }
    
    
    public double calcularPerimetre() {
        return 2 * Math.PI * radi;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radi, 2);

    }

    public Punt calcularCentre() {
        return centre;
    }

    @Override
    public double getXMax() {
        return centre.x + radi;
    }

    @Override
    public double getXMin() {
        return centre.x - radi;
    }

    @Override
    public double getYMax() {
        return centre.y + radi;
    }

    @Override
    public double getYMin() {
        return centre.y - radi;
    }
    
}
