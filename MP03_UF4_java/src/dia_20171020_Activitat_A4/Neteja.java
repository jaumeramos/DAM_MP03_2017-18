
package dia_20171020_Activitat_A4;

import dia_20171011_Activitat_A4.*;



public class Neteja extends Article implements InterfaceArticle{
    
    public Neteja(int codi, String nom, Double  preu){
        super(codi,nom, preu);
    }
    
    @Override
    public String mostrar(){
        return "Article Neteja";
    }

}
