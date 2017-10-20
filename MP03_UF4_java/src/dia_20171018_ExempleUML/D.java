package dia_20171018_ExempleUML;


import dia_20171011_Activitat_A4.Article;
import java.util.logging.Level;
import java.util.logging.Logger;

public class D implements Cloneable  {
    
    @Override
    public D clone()throws CloneNotSupportedException{
        D d = (D)super.clone();        
        return d;        
    };
    
    public int i;
    
}
