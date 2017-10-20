
package dia_20171011_Activitat_A4;



public class Neteja extends Article implements InterfaceArticle{
    
    private int grauPerillositat;
    
    public Neteja(int codi, String nom, Double  preu){
        super(codi,nom, preu);
    }

    public void setGrauPerillositat(int grauPerillositat) {
        if (grauPerillositat < 0 || grauPerillositat >5){
            throw new RuntimeException("Perillositat errònia");
        } else {         
            this.grauPerillositat = grauPerillositat;   
        }
    }    
    
    @Override
    public String mostrar(){
        return "Article Neteja";
    }

}
