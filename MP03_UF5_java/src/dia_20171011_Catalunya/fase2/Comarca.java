package catalunya.fase2;

public class Comarca {
    
    private final int codi;
    private final String nom;
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

    public void addMunicipi() {
        this.numMunicipis++;
    }

    
    @Override
    public String toString() {
        return "Comarca{" + "codi=" + codi + ", nom=" + nom + ", numMunicipis=" + numMunicipis + ", superficie=" + superficie + ", habitants=" + habitants + '}';
    }
    
    
    
}
