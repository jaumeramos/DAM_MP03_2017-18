package dia_20171018_Activitat_A3;

public class A3Main {

    public static void main(String[] args) {

        Cercle cap = new Cercle(new Punt(15, 25), 5);

        Punt p1 = new Punt(10, 10);
        Quadrat cos = new Quadrat(p1, 10);
        Rectangle brasDret = new Rectangle(new Punt(20, 15), new Punt(30, 18));
        Rectangle brasEsquerre = new Rectangle(new Punt(0, 15), new Punt(10, 18));
        Rectangle camaDreta = new Rectangle(new Punt(16, 0), new Punt(19, 10));
        Rectangle camaEsquerra = new Rectangle(new Punt(11, 0), new Punt(14, 10));
        
        // Robot no OK
        //Rectangle brasDret = new Rectangle(new Punt(19, 15), new Punt(30, 18));
        //Rectangle camaDreta = new Rectangle(new Punt(16, 0), new Punt(21, 10));
        //Rectangle camaEsquerra = new Rectangle(new Punt(11, 0), new Punt(14, 11));
        //Rectangle camaEsquerra = new Rectangle(new Punt(17, 0), new Punt(18, 10));

        
        Robot r = new Robot(cap, brasDret, brasEsquerre, camaDreta, camaEsquerra, cos);
        
        System.out.println(r.esRobotOK());
        
        System.out.println(r.calcularArea());        
        
        System.out.println(r.calcularPerimetre());
        
    }

}
