
package dia_20171011_Activitat_A4;



public class NovaClase extends Article implements InterfaceArticle{
    
    @Override
    public String mostrar(){
        return "Estic a NovaClase";
    }
    
    public NovaClase(int c, String s, double d){
        super (c, s, d);
    }


}
