package dia_20171115_Catalunya.fase3;


public class EMD {
    
    private int codiMunicipi;
    private long codiEMD;
    private String nom;

    public EMD(int codiMunicipi, long codiEMD, String nom) {
        this.codiMunicipi = codiMunicipi;
        this.codiEMD = codiEMD;
        this.nom = nom;
    }

    public int getCodiMunicipi() {
        return codiMunicipi;
    }

    public long getCodiEMD() {
        return codiEMD;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "EMD{" + "codiMunicipi=" + codiMunicipi + ", codiEMD=" + codiEMD + ", nom=" + nom + '}';
    }
    
    
}
