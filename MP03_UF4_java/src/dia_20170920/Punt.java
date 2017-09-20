
package dia_20170920;


public class Punt {
    
    private double x;
    private double y;
    
    public Punt(){
        this.x=0;
        this.y=0;        
    }
    
    public Punt(double x, double y){
        this.x=x;
        this.y=y;
    }
    
    public double distanciaPunt(Punt p){
        return Math.sqrt(Math.pow(p.x-this.x,2)+Math.pow(p.y-this.y,2));    
    }
    
    public double distanciaX(Punt p){
        return Math.abs(p.x-this.x);
    }
    public double distanciaY(Punt p){
        return Math.abs(p.y-this.y);
    }
    
    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }

    public static void main(String[] args){
        Punt p = new Punt();
        System.out.println(p);
        
        Punt p1 = new Punt(4, 4);
        System.out.println(p1);
        
        System.out.println(p.distanciaPunt(p1));
        System.out.println(p1.distanciaPunt(p));
        
        System.out.println(p.distanciaX(p1));
        System.out.println(p.distanciaY(p1));
    }
}
