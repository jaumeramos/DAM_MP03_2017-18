
package dia_20171020_Activitat_A4;

import dia_20171011_Activitat_A4.*;
import java.util.Date;



public class Aliment extends Article implements Cloneable, InterfaceArticle{
    
    private Date dataCaducitat;
    
    public Aliment(int codi, String nom, double preuCompra, Date dataCaducitat){
        super(codi, nom, preuCompra);
        this.setDataCaducitat(dataCaducitat);
    }
    
    public void setDataCaducitat(Date d){
        if (d == null){
            throw new RuntimeException("La data de caducitat és obligatoria");
        }
        this.dataCaducitat = (Date)d.clone();
    }
    
    @Override
    public String mostrar(){        
        return "Article: Codi: " + codi + " Nom: " + this.getNom() + "Preu Compra: " 
                + preuCompra + " %Benefici: " + percentatgeBenefici + "data: " + dataCaducitat;  
    }
    
    @Override
    public String toString(){
        return "Article: ";
    }
    
    @Override
    public Aliment clone() throws CloneNotSupportedException{
        Aliment a = (Aliment)super.clone();
        a.setDataCaducitat(this.dataCaducitat);
        return a;        
    }
}
