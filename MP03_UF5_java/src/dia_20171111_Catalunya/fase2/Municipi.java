package dia_20171111_Catalunya.fase2;


public class Municipi implements Comparable<Municipi>{

    private final int codiComarca;
    private final int codiMunicipi;
    private final String nom;
    private final int habitants;
    private final double superficie;
    private final double densitat;
    

    public Municipi(int codiComarca, int codiMunicipi, String nom, int habitants, double superficie) {
        super();
        this.codiComarca = codiComarca;
        this.codiMunicipi = codiMunicipi;
        this.nom = nom;
        this.habitants = habitants;
        this.superficie = superficie;
        this.densitat = habitants/superficie;
    }

    public int getCodiComarca() {
        return codiComarca;
    }

    public int getCodiMunicipi() {
        return codiMunicipi;
    }

    public String getNom() {
        return nom;
    }

    public int getHabitants() {
        return habitants;
    }

    public double getSuperficie() {
        return superficie;
    }

    public double getDensitat() {
        return densitat;
    }

    @Override
    public String toString() {
        return "Municipi{" + "codiComarca=" + codiComarca + ", codiMunicipi=" + codiMunicipi + 
                ", nom=" + nom + ", habitants=" + habitants + ", superficie=" + superficie + 
                ", densitat=" + densitat + '}';
    }

    @Override
    public int compareTo(Municipi m) {
        return this.codiMunicipi - m.codiMunicipi;
    }

    
}
