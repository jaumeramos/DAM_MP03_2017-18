
package dia_20171102_Catalunya;



public class Comarca {
    
    private int codiComarca;
    private String nom;
    
    private int numMunicipis;
    private int habitants;
    private double superficie;

    public Comarca(int codiComarca, String nom) {
        this.codiComarca = codiComarca;
        this.nom = nom;
    }

    public int getCodiComarca() {
        return codiComarca;
    }

    public String getNom() {
        return nom;
    }

    public int getNumMunicipis() {
        return numMunicipis;
    }

    public int getHabitants() {
        return habitants;
    }

    public double getSuperficie() {
        return superficie;
    }

    @Override
    public String toString() {
        return "Comarca{" + "codiComarca=" + codiComarca + ", nom=" + nom + ", numMunicipis=" + numMunicipis + ", habitants=" + habitants + ", superficie=" + superficie + '}';
    }
    
    

}
