package dia_20171115_Catalunya.fase4;


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Pais {

    private final Map<Integer, Comarca> comarques = new HashMap();
    private final Map<Integer, Municipi> municipis = new HashMap();

    private final String nomPais;
    private int numComarques;
    private long poblacio;
    private double superficie;

    public Pais(String nomPais) {
    	this.nomPais = nomPais;
    }

    public long getPoblacio() {
        return poblacio;
    }

    public double getSuperficie() {
        return superficie;
    }

    private void _afegirComarca(Comarca c) {
        comarques.put(c.getCodi(), c);
        this.numComarques++;
    }

    public void afegirComarca(Comarca c) {
        comarques.put(c.getCodi(), c);
        this.numComarques++;
    }

    public void afegirMunicipi(Municipi m) {
        // Evitar duplicats
        if (!municipis.containsKey(m.getCodiMunicipi())) {
            municipis.put(m.getCodiMunicipi(), m);
            this.poblacio += m.getHabitants();
            this.superficie += m.getSuperficie();
            this.comarques.get(m.getCodiComarca()).addHabitants(m.getHabitants());
            this.comarques.get(m.getCodiComarca()).addSuperficie(m.getSuperficie());
        }
    }

    public void afegirEMD(EMD e) {
        if (municipis.containsKey(e.getCodiMunicipi())) {
            this.municipis.get(e.getCodiMunicipi()).afegirEMD(e);
        }
    }

    public void mostrarComarques() {
        for (Comarca c : comarques.values()) {
            System.out.println(c);
        }
    }

    public void mostrarMunicipis() {
        municipis.values().forEach(System.out::print);
    }

    @Override
    public String toString() {
        return "Pais{" + "numComarques=" + numComarques + ", poblacio=" + poblacio + ", superficie=" + superficie + '}';
    }

    public void mostrarMunicipiMesHabitants() {
        List<Municipi> m = new LinkedList(municipis.values());
        Collections.sort(m, Municipi.CMP_HABITANTS_REVERSE);
        System.out.println("Mes Habitants: " + m.get(0));

    }

    public void mostrarMunicipiMenysHabitants() {
        List<Municipi> m = new LinkedList(municipis.values());
        Collections.sort(m, Municipi.CMP_HABITANTS);
        System.out.println("Menys Habitants: " + m.get(0));
    }

    public void mostrarMunicipiMesSuperficie() {
        List<Municipi> m = new LinkedList(municipis.values());
        Collections.sort(m, Municipi.CMP_SUPERFICIE_REVERSE);
        System.out.println("Mes Superficie: " + m.get(0));
    }

    public void mostrarMunicipiMenysSuperficie() {
        List<Municipi> m = new LinkedList(municipis.values());
        Collections.sort(m, Municipi.CMP_SUPERFICIE);
        System.out.println("Menys Superficie: " + m.get(0));
    }

    public void mostrarMunicipiMesDensitat() {
        List<Municipi> m = new LinkedList(municipis.values());
        Collections.sort(m, Municipi.CMP_DENSITAT_REVERSE);
        System.out.println("Mes Densitat: " + m.get(0));
    }

    public void mostrarMunicipiMenysDensitat() {
        List<Municipi> m = new LinkedList(municipis.values());
        Collections.sort(m, Municipi.CMP_DENSITAT);
        System.out.println("Menys Densitat: " + m.get(0));

    }

    public void mostrarComarcaMesHabitants() {
        List<Comarca> c = new LinkedList(comarques.values());
        Collections.sort(c, Comarca.CMP_HABITANTS_REVERSE);
        System.out.println("Comarca Mes Habitants: " + c.get(0));
    }

    public void mostrarComarcaMenysHabitants() {
        List<Comarca> c = new LinkedList(comarques.values());
        Collections.sort(c, Comarca.CMP_HABITANTS);
        System.out.println("Comarca Menys Habitants: " + c.get(0));
    }

    public Municipi cercarMunicipi(int codi) {
        return municipis.get(codi);
    }

    public Municipi cercarMunicipi(String nom) {
        List<Municipi> muni = new LinkedList(municipis.values());
        for (Municipi m : muni) {
            if (m.getNom().equals(nom)) {
                return municipis.get(m.getCodiMunicipi());
            }
        }
        return null;
    }
    
    public void mostrarMunicipiMesEMD(){
        Municipi munMesEMD = null;
        double mesEMD = 0;
        List<Municipi> muni = new LinkedList(municipis.values());
        for (Municipi m : muni) {
            if (m.numEMDs() > mesEMD) {
                munMesEMD = m;
                mesEMD = m.numEMDs() ;
            }
        }
        System.out.println("Més EMDs: " + munMesEMD);

        
    }
}
