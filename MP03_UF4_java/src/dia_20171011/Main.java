
package dia_20171011;

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
        /*
        Article a = new Article (10, "fato", 50);
        Article b = new Article (10, "fato", 100, 30);
        System.out.println(a);
        System.out.println(b);
        
        System.out.println(a.equals(b));
        
        System.out.println(a.mostrar());
        System.out.println(b.mostrar());
        */
                
                
        /*
        Date a = new Date();
        try {         
            sleep(4l);   
        } catch (Exception e){
            e.printStackTrace();
        }
        Date b = new Date();
        */
        
        /*
        Date d = new Date();
        Aliment al = new Aliment(20, "pataques", 20, d);
        d.setYear(2005);
        
        Aliment al1 = (Aliment)al.clone();
        
        System.out.println(al.mostrar());
        System.out.println(al1.mostrar());
    */
        
        
        Article a = new Article (10, "fato", 50);
        Aliment al = new Aliment(20, "pataques", 20, new Date());        
        Neteja n = new Neteja(20, "sabo", 20.0);
                
        NovaClase nc = new NovaClase(55, "Nou", 555);
        
               
        System.out.println(mostra(a));
        System.out.println(mostra(al));
        System.out.println(mostra(n));
        System.out.println(mostra(nc));
        
        
    }

}
