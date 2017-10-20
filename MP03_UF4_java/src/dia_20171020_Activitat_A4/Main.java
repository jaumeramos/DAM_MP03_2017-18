
package dia_20171020_Activitat_A4;

import dia_20171011_Activitat_A4.*;
import static java.lang.Thread.sleep;
import java.util.Date;



public class Main {
    
    static String mostra(Article a){
        
        return a.mostrar();
        
    }
    
    static String mostra1(InterfaceArticle a){
        
        return a.mostrar();
    }
    
    public static void main(String[] args) throws CloneNotSupportedException {
             
        
        Article a = new Article (10, "fato", 50);
        
        Article b = new Article (10, "fato", 50);
        
        Article c = (Article)b.clone();
        
        System.out.println(b);
        System.out.println(c);
        
        
        //System.out.println("a == b " + (a == b));
        System.out.println("c == b " + (c == b));
        System.out.println("a equals b " + (a.equals(b)));
        
        
        Aliment al = new Aliment(22, "pataques", 30, new Date());
        Neteja ne = new Neteja(33, "MrProper", 45.3);
        
        System.out.println(mostra1(c));
        System.out.println(mostra1(al));
        System.out.println(mostra1(ne));
        
        
    }

}
