
package dia_20170921;

import dia_20170920.*;
import java.util.Scanner;


public class Punt {
    
    public double x;
    public double y;
    
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
        //return Math.abs(p.x-this.x);
        return (p.x-this.x);
    }
    public double distanciaY(Punt p){
        //return Math.abs(p.y-this.y);
        return (p.y-this.y);
    }
    
    public static Punt demanarPunt(){
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        return new Punt(x, y);
    }
    
    
    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }
    
}
