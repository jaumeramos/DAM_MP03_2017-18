package dia_20171011_Activitat_A4;


public class Article implements Cloneable, InterfaceArticle {
    
    protected int codi;
    private String nom;
    
    protected double preuCompra;
    protected double percentatgeBenefici;
    
    
    
    
    public Article(int codi, String nom,  double preuCompra){
        this.setCodi(codi);
        this.setNom(nom);
        this.setPreuCompra(preuCompra);
        this.percentatgeBenefici = 20;
    }
    
    public Article(int codi, String nom,  double preuCompra, double percentatgeBenefici){
        this.setCodi(codi);
        this.setNom(nom);
        this.setPreuCompra(preuCompra);
        this.percentatgeBenefici = percentatgeBenefici;
    }
    
    public void setCodi(int codi){
        if (codi >= 0){
            this.codi = codi;            
        } else {
            throw new RuntimeException("Codi ha de ser positiu");
        }
        
    }    
    
    public void setNom(String nom){
        //if (nom == null || nom.compareTo("")==0){
        //if(nom == null || nom.isEmpty()){
        //if(nom == null || nom.isEmpty() == true){
        //if (nom == null || nom.length() == 0){
        if (nom == null || nom.equals(new String(""))){
            throw new RuntimeException("Nom no pot ser buid");
        }
        this.nom = nom;        
    }
    
    public void setPreuCompra(double preuCompra){        
        if (preuCompra >= 0){
            this.preuCompra = preuCompra;            
        } else {
            throw new RuntimeException("preuCompra ha de ser positiu");
        }
    }

    public int getCodi() {
        return codi;
    }

    public String getNom() {
        return nom;
    }

    public double getPreuCompra() {
        return preuCompra;
    }

    public double getPercentatgeBenefici() {
        return percentatgeBenefici;
    }
    
    @Override
    public String mostrar(){
        return "Article: Codi: " + codi + " Nom: " + nom + "Preu Compra: " 
                + preuCompra + " %Benefici: " + percentatgeBenefici;        
    }
    
    
    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        } else if(obj instanceof Article == false){
            return false;            
        }
        Article a = (Article)obj;
        return (this.codi == a.codi && this.nom == a.nom);
        
            
    }
    
    @Override
    public String toString(){
        return "Article: Codi: " + codi + " Nom: " + nom;
    }
    
    
    
    @Override
    public Article clone() throws CloneNotSupportedException{
        Article a = (Article)super.clone();
        
        
        return a;
        
    }

    

}
