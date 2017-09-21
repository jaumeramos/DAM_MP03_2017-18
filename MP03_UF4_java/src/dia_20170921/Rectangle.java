
package dia_20170921;

import dia_20170920.*;



public class Rectangle {
    
    private Punt p1;
    private Punt p3;
    private double base;
    private double altura;
    
    public Rectangle(Punt p1, Punt p3){
        // Composició
        this.p1 = new Punt(p1.x, p1.y);
        this.p3 = new Punt(p3.x, p3.y);
        
        // Agregació
        this.p1 = p1;
        this.p1 = p1;
        
        base = p1.distanciaX(p3);
        altura = p1.distanciaY(p3);
    }
    
    public double perimetre(){
        return 2*(base + altura);
    }
    
    public double area(){
        return (base * altura);        
    }
    
    public Punt centre(){
        return new Punt(p1.x+base/2, p1.y+altura/2);
    }
    
    public Punt centre1(){
        double x = (p1.x+p3.x)/2.0;
        double y =(p1.y+p3.y)/2.0;
        System.out.println(p1.x + " " + p3.x + " " + x);
        System.out.println(y);
        return new Punt(x,y );
    }
    

}
