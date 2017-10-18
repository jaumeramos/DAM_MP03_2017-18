package dia_20171018_ExempleUML;

public class Main {
    
    public static void main(String[] arguments) throws CloneNotSupportedException{
        
        D d = new D();
        d.i = 4;
        
        C c = new C();
        
        c.setAgregacio(d);
        
        c.setComposicio(d);
        
        d.i = 55;
        
        System.out.println(c.getAgregacio().i); //
        
        System.out.println(c.getComposicio().i); //
        
        c = null;
        
        System.out.println(d.i);
                
    }
}
