package dia_20171115_Catalunya.fase3;

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
        
        in = new Scanner(new FileReader("Municipis.txt"));
        while (in.hasNext()) {
            int codiComarca = Integer.parseInt(in.nextLine());
            int codiMunicipi = Integer.parseInt(in.nextLine());
            String nom = in.nextLine();
            int habitants = Integer.parseInt(in.nextLine());
            double superficie = Double.parseDouble(in.nextLine());
            Municipi m = new Municipi(codiComarca, codiMunicipi, nom, habitants, superficie);
            catalunya.afegirMunicipi(m);
            //System.out.println(m);

        }
        in.close();

        in = new Scanner(new FileReader("EMDs.txt"));
        while (in.hasNext()) {
            int codiMunicipi = Integer.parseInt(in.nextLine());
            long codiEMD = Long.parseLong(in.nextLine());
            String nom = in.nextLine();
            EMD e = new EMD(codiMunicipi, codiEMD, nom);
            catalunya.afegirEMD(e);
            //System.out.println(e);

        }
        in.close();
        
        catalunya.mostrarComarques();        
        catalunya.mostrarMunicipis();        
        //catalunya.mostrarEMDs();
        System.out.println(catalunya);
        
        catalunya.mostrarMunicipiMesHabitants();
        catalunya.mostrarMunicipiMenysHabitants();
        
        catalunya.mostrarMunicipiMesSuperficie();
        catalunya.mostrarMunicipiMenysSuperficie();
        
        catalunya.mostrarMunicipiMesDensitat();
        catalunya.mostrarMunicipiMenysDensitat();

        catalunya.mostrarComarcaMesHabitants();
        catalunya.mostrarComarcaMenysHabitants();
        
        System.out.println(catalunya.cercarMunicipi("Rasquera"));
        
        System.out.println(catalunya.cercarMunicipi(251333));
        
        catalunya.mostrarMunicipiMesEMD();
        
        
    }

}
