package catalunya.fase2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {


        Pais catalunya = new Pais("Catalunya");

        Scanner in = new Scanner(new FileReader("Comarques.txt"));
        while (in.hasNext()) {
            int codi = Integer.parseInt(in.nextLine());
            String nomComarca = in.nextLine();
            Comarca c = new Comarca(codi, nomComarca);
            catalunya.afegirComarca(c);
        }
        in.close();
        catalunya.mostrarComarques();

        in = new Scanner(new FileReader("Municipis.txt"));
        while (in.hasNext()) {
            int codiComarca = Integer.parseInt(in.nextLine());
            int codiMunicipi = Integer.parseInt(in.nextLine());
            String nom = in.nextLine();
            int habitants = Integer.parseInt(in.nextLine());
            double superficie = Double.parseDouble(in.nextLine());
            Municipi m = new Municipi(codiComarca, codiMunicipi, nom, habitants, superficie);
            catalunya.afegirMunicipi(m);

        }
        in.close();
        catalunya.mostrarMunicipis();
        

        catalunya.mostrarMunicipiMesHabitants();
        catalunya.mostrarMunicipiMenysHabitants();
        
        catalunya.mostrarMunicipiMesSuperficie();
        catalunya.mostrarMunicipiMenysSuperficie();
        
        catalunya.mostrarMunicipiMesDensitat();
        catalunya.mostrarMunicipiMenysDensitat();

        catalunya.mostrarComarcaMesHabitants();
        catalunya.mostrarComarcaMenysHabitants();


    	
    }

}
