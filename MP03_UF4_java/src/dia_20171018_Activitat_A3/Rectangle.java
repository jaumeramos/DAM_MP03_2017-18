package dia_20171018_Activitat_A3;


public class Rectangle implements FiguraGeometrica {

    Punt p1;
    Punt p2;
    Punt p3;
    Punt p4;


    /*
	 * Els punts es creen dins l'objecte. La relació és de composició.
	 * Al destruir l'objecte també desapareixen els punts.
     */
    public Rectangle(Punt p1, Punt p3) {
        this.p1 = new Punt(p1.x, p1.y);
        this.p2 = new Punt(p1.x, p3.y);
        this.p3 = new Punt(p3.x, p3.y);
        this.p4 = new Punt(p3.x, p1.y);
    }

    /*
	 * Els punts es creen fora. La relació és d'agregació.
     */
    public Rectangle(Punt p1, Punt p2, Punt p3, Punt p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public double calcularPerimetre() {
        return 2 * (p1.distanciaX(p3) + p1.distanciaY(p3));
    }

    public double calcularArea() {
        return (p1.distanciaX(p3) * p1.distanciaY(p3));

    }

    public Punt calcularCentre() {
        return new Punt(p1.x + p1.distanciaX(p3) / 2, p1.y + p1.distanciaY(p3) / 2);
    }
    
    public double getYMax(){
        return (p1.getY() > p3.getY()) ? p1.getY() : p3.getY();
    }
    
    public double getYMin(){
        return (p1.getY() < p3.getY()) ? p1.getY() : p3.getY();
    }
    
    public double getXMax(){
        return (p1.getX() > p3.getX()) ? p1.getX() : p3.getX();
    }
    
    public double getXMin(){
        return (p1.getX() < p3.getX()) ? p1.getX() : p3.getX();
    }

}
