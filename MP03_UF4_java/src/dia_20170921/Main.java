
package dia_20170921;



public class Main {
    
    public static void main(String[] args){
        
        
        Punt p1 = new Punt(0,0);
        Punt p2 = new Punt(2,0);
        Punt p3 = new Punt(2,2);
        Punt p4 = new Punt(0,2);
        
        Poligon p = new Poligon(4);
        p.afegirCostat(p1);
        p.afegirCostat(p2);
        p.afegirCostat(p3);
        p.afegirCostat(p4);
        p.afegirCostat(p4);
        
        System.out.println(p.perimetre());
        
        Punt punts[] = {p1, p2, p3, p4};
        
        p = new Poligon(punts);
        
        System.out.println(p.perimetre());
        
        
        
    }

}
