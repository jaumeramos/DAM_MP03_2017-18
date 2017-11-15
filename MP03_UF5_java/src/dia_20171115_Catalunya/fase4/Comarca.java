package dia_20171115_Catalunya.fase4;

import java.util.Comparator;


public class Comarca {
    
    private int codi;
    private String nom;
    private int numMunicipis;
    private int habitants = 0;
    private double superficie = 0;

    public Comarca(int codi, String nom) {
        this.codi = codi;
        this.nom = nom;
    }

    public int getCodi() {
        return codi;
    }

    public String getNom() {
        return nom;
    }

    public int getNumMunicipis() {
        return numMunicipis;
    }

    public double getSuperficie() {
        return superficie;
    }

    public int getHabitants() {
        return habitants;
    }

    public double getDensitat() {
        return habitants/superficie;
    }

    public void addSuperficie(double superficie) {
        this.superficie += superficie;
    }

    public void addHabitants(int habitants) {
        this.habitants += habitants;
    }
    
    

    @Override
    public String toString() {
        return "Comarca{" + "codi=" + codi + ", nom=" + nom + ", numMunicipis=" + numMunicipis + ", superficie=" + superficie + ", habitants=" + habitants + '}';
    }
    
    
    
    public static final Comparator<Comarca> CMP_HABITANTS = 
       (Comarca o1, Comarca o2) -> o1.habitants - o2.habitants;

    public static final Comparator<Comarca> CMP_HABITANTS_REVERSE = 
       (Comarca o1, Comarca o2) -> o2.habitants - o1.habitants;

    
    
}
