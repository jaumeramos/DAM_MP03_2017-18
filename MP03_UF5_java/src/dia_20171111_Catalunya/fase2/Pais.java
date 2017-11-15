package dia_20171111_Catalunya.fase2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Pais {

    private Comarca[] comarques = new Comarca[0];
    private final ArrayList<Municipi> municipis = new ArrayList();

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
        comarques[c.getCodi()] = c;
        this.numComarques++;
    }

    public void afegirComarca(Comarca c) {
        if (c.getCodi() < comarques.length) {
            // Evitar duplicats
            if (comarques[c.getCodi()] == null) {
                this._afegirComarca(c);
            }
        } else {
            comarques = Arrays.copyOf(comarques, c.getCodi() + 1);
            this._afegirComarca(c);
        }
    }

    public void afegirMunicipi(Municipi m) {
        // Evitar duplicats
        if (!municipis.contains(m)) {
            municipis.add(m);
            this.poblacio += m.getHabitants();
            this.superficie += m.getSuperficie();
            this.comarques[m.getCodiComarca()].addHabitants(m.getHabitants());
            this.comarques[m.getCodiComarca()].addSuperficie(m.getSuperficie());
            this.comarques[m.getCodiComarca()].addMunicipi();
        }
    }

    public void mostrarComarques() {
        for (Comarca c : comarques) {
            System.out.println(c);
        }
    }

    public void mostrarMunicipis() {
        municipis.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Pais{" + "numComarques=" + numComarques + ", poblacio=" + poblacio + ", superficie=" + superficie + '}';
    }

    public void mostrarMunicipiMesHabitants() {
        Collections.sort(municipis, new Comparator<Municipi>() {
            @Override
            public int compare(Municipi a, Municipi b) {
                return b.getHabitants() - a.getHabitants();
                /*
                    <0 --> a<b
                    =0 --> a==b
                    >0 --> a>b
                 */
            }
        });
        System.out.println("Mes Habitants: " + municipis.get(0));

    }

    public void mostrarMunicipiMenysHabitants() {
        Collections.sort(municipis, (Municipi a, Municipi b) -> a.getHabitants() - b.getHabitants());
        System.out.println("Menys Habitants: " + municipis.get(0));
    }

    public void mostrarMunicipiMesSuperficie() {
        Collections.sort(municipis, (Municipi a, Municipi b) -> {
            if (a.getSuperficie() < b.getSuperficie()) {
                return 1;
            }
            if (a.getSuperficie() > b.getSuperficie()) {
                return -1;
            }
            return 0;
        }
        );
        System.out.println("Mes Superficie: " + municipis.get(0));
    }

    public void mostrarMunicipiMenysSuperficie() {
        Collections.sort(municipis, (Municipi a, Municipi b) -> Double.compare(a.getSuperficie(), b.getSuperficie()));
        System.out.println("Menys Superficie: " + municipis.get(0));
    }

    public void mostrarMunicipiMesDensitat() {
        Municipi munMesDensitat = null;
        double mesDensitat = 0;               
        for (Municipi m : municipis) {
            if (m.getDensitat()>mesDensitat){
                munMesDensitat = m;
                mesDensitat = m.getDensitat();
            }
        }
        System.out.println("Mes Densitat: " + munMesDensitat);
    }

    public void mostrarMunicipiMenysDensitat() {
        Municipi munMenysDensitat = null;
        double menysDensitat = Double.MAX_VALUE;
        for (Municipi m : municipis) {
            if (m.getDensitat()<menysDensitat){
                munMenysDensitat = m;
                menysDensitat = m.getDensitat();
            }
        }
        System.out.println("Menys Densitat: " + munMenysDensitat);

    }
    
    
    
    public void mostrarComarcaMenysHabitants() {
        Arrays.sort(comarques, (Comarca a, Comarca b) -> {
            if (a == null || b == null) {
                return -1;
            } else {
                return a.getHabitants() - b.getHabitants();
            }
        });
        System.out.println("Comarca Menys Habitants: " + comarques[0]);
    }    
    public void mostrarComarcaMesHabitants() {
        Arrays.sort(comarques, (Comarca a, Comarca b) ->  {
            if (a == null || b == null) {
                return -1;
            } else {
                return b.getHabitants() - a.getHabitants();
            }
        });
        System.out.println("Comarca Mes Habitants: " + comarques[0]);
    }

}
