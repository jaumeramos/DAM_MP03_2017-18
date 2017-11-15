package dia_20171115_Catalunya.fase3;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Municipi implements Comparable<Municipi> {

    private int codiComarca;
    private int codiMunicipi;
    private final String nom;
    private int habitants;
    private double superficie;
    private double densitat;

    private final List<EMD> emds = new LinkedList();

    public Municipi(int codiComarca, int codiMunicipi, String nom, int habitants, double superficie) {
        super();
        this.codiComarca = codiComarca;
        this.codiMunicipi = codiMunicipi;
        this.nom = nom;
        this.habitants = habitants;
        this.superficie = superficie;
        this.densitat = habitants / superficie;
    }
    public Municipi(String nom) {
        this.nom = nom;
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

    public void afegirEMD(EMD e) {
        if (!emds.contains(e)) {
            emds.add(e);
        }
    }

    public void mostrarEMDs() {
        for (EMD e : emds) {
            System.out.println(e);
        }
    }
    
    public int numEMDs(){
        return emds.size();
    }
    

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Municipi{" + "codiComarca=" + codiComarca + ", codiMunicipi=" + codiMunicipi
                + ", nom=" + nom + ", habitants=" + habitants + ", superficie=" + superficie
                + ", densitat=" + densitat + '}' + '\n');        
        for (EMD e : emds) {
            res.append("\t");
            res.append(e);
            res.append("\n");
        }
        return res.toString();
    }

    @Override
    public int compareTo(Municipi m) {
        return this.codiMunicipi - m.codiMunicipi;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return this.nom.equals(((Municipi) obj).nom);
    }
    
    
}
