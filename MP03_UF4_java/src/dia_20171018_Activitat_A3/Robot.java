package dia_20171018_Activitat_A3;

public class Robot {

    Cercle cap;
    Rectangle brasDret;
    Rectangle brasEsquerre;
    Rectangle camaDreta;
    Rectangle camaEsquerra;
    Quadrat cos;

    public Robot(Cercle cap, Rectangle brasDret, Rectangle brasEsquerre,
            Rectangle camaDreta, Rectangle camaEsquerra, Quadrat cos) {

        // Agregació
        this.cap = cap;
        this.brasDret = brasDret;
        this.brasEsquerre = brasEsquerre;
        this.camaDreta = camaDreta;
        this.camaEsquerra = camaEsquerra;
        this.cos = cos;
        
        // Composició
        this.cap = new Cercle(cap.centre, cap.getRadi());
        this.brasDret = new Rectangle(brasDret.p1, brasDret.p3);
        this.brasEsquerre = new Rectangle(brasEsquerre.p1, brasEsquerre.p3);
        this.camaDreta = new Rectangle(camaDreta.p1, camaDreta.p3);
        this.camaEsquerra = new Rectangle(camaEsquerra.p1, camaEsquerra.p3);
        this.cos = new Quadrat(cos.p1, cos.p1.distanciaX(cos.p3));

    }
    
    public double calcularArea(){
        return cap.calcularArea() +
               brasDret.calcularArea() + 
               brasEsquerre.calcularArea() + 
               camaDreta.calcularArea() + 
               camaEsquerra.calcularArea() + 
               cos.calcularArea();
    }
    
    public double calcularPerimetre(){
        double res = cap.calcularPerimetre();
        res += cos.calcularPerimetre();
        res += (brasDret.calcularPerimetre() - 2 * (brasDret.getYMax() - brasDret.getYMin()));        
        res += (brasEsquerre.calcularPerimetre() - 2 * (brasEsquerre.getYMax() - brasEsquerre.getYMin()));        
        res += (camaDreta.calcularPerimetre() - 2 * (camaDreta.getXMax() - camaDreta.getXMin()));        
        res += (camaEsquerra.calcularPerimetre() - 2 * (camaEsquerra.getXMax() - camaEsquerra.getXMin()));        
        return res;
    }
    
    
    public boolean esRobotOK(){        
        if (cap==null || brasDret==null || brasEsquerre==null ||
            camaDreta==null || camaEsquerra==null || cos==null){
            return false;
        }
        // El cap on toca
        if (Math.abs(cap.getCentre().getY() - cap.getRadi() - cos.getYMax()) > 0.001 ){
            return false;
        }
        if ((cap.getCentre().getX() - cos.getXMin()) < 0.001  ||
            (cap.getCentre().getX() - cos.getXMax()) > 0.001 ){
            return false;
        }
        // Braç dret on toca
        if (Math.abs(brasDret.getXMin() - cos.getXMax()) > 0.001){
            return false;
        }
        if ((brasDret.getYMax() - cos.getYMax()) > 0.001  ||
            (brasDret.getYMin() - cos.getYMin()) < 0.001 ){
            return false;
        }        
        // Braç esquerre on toca
        if (Math.abs(brasEsquerre.getXMax() - cos.getXMin()) > 0.001){
            return false;
        }
        if ((brasEsquerre.getYMax() - cos.getYMax()) > 0.001  ||
            (brasEsquerre.getYMin() - cos.getYMin()) < 0.001 ){
            return false;
        }        
        // Cama dreta on toca
        if (Math.abs(camaDreta.getYMax() - cos.getYMin()) > 0.001){
            return false;
        }
        if ((camaDreta.getXMax() - cos.getXMax()) > 0.001  ||
            (camaDreta.getXMin() - cos.getXMin()) < 0.001 ){
            return false;
        }                
        // Cama esquerra on toca
        if (Math.abs(camaEsquerra.getYMax() - cos.getYMin()) > 0.001){
            return false;
        }
        if ((camaEsquerra.getXMax() - cos.getXMax()) > 0.001  ||
            (camaEsquerra.getXMin() - cos.getXMin()) < 0.001 ){
            return false;
        }
        // Cames no invertides o solapades
        if ((camaEsquerra.getXMax() - camaDreta.getXMin()) > 0.001){
            return false;
        }
        
        return true;
    }

}
