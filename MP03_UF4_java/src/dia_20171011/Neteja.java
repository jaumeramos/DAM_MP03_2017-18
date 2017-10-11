
package dia_20171011;



public class Neteja extends Article implements InterfaceArticle{
    
    public Neteja(int codi, String nom, Double  preu){
        super(codi,nom, preu);
    }
    
    @Override
    public String mostrar(){
        return "Article Neteja";
    }

}
