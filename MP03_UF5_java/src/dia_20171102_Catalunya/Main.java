package dia_20171102_Catalunya;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws FileNotFoundException{
        
        Comarca[] comarques = new Comarca[0];
        
        Scanner in = new Scanner(new FileReader("Comarques.txt"));
        while(in.hasNext()){
            int codiComarca = Integer.parseInt(in.nextLine());
            String nom = in.nextLine();
            
            Comarca c = new Comarca(codiComarca, nom);
            
            if (codiComarca < comarques.length){
                comarques[codiComarca] = c;                
            } else {
                comarques = Arrays.copyOf(comarques, codiComarca +1);
                comarques[codiComarca] = c;     
            }
            
        }
        
        //for (Comarca c : comarques){
        //    System.out.println(c);
        //}
        
        
        class ComparadorInvers implements Comparator<Comarca>{

            @Override
            public int compare(Comarca o1, Comarca o2) {
                if (o1 != null && o2 != null){
                    String o1Invers = new StringBuilder(o1.getNom()).reverse().toString();
                    String o2Invers = new StringBuilder(o2.getNom()).reverse().toString();
                    
                    //Collator catalan = Collator.getInstance(Locale.FRENCH);
                    
                    Collator catalan = Collator.getInstance(new Locale("ca", "ES"));
                    return catalan.compare(o1Invers, o2Invers);                    
                    
                } else {
                    return 0;
                }                
            }            
        }
        
        Arrays.sort(comarques, new ComparadorInvers());        
        for (Comarca c : comarques){
            System.out.println(c);
        }
        
    }
    
}
