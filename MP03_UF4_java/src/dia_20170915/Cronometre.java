package dia_20170915;


public class Cronometre {
    
    long iniciCrono;
    long finalCrono;
    
    
    void start(){
        iniciCrono = System.currentTimeMillis();        
    }
    
    
    void stop(){
        finalCrono = System.currentTimeMillis();
        
        System.out.println("Temps cronometrat: " + mostrarTemps(finalCrono - iniciCrono));
        
        
    }
    
    String mostrarTemps(long temps){        
        long minuts = temps / 60000;        
        temps = temps % 60000;        
        long segons = temps / 1000;        
        temps = temps % 1000;        
        return(minuts + " m "  + segons + " s " + temps + " ms");        
    }
    
    static void sleep(long temps){        
        try {
            Thread.sleep(temps);
        } catch (InterruptedException e) {
            System.out.println("WTF!!!!");
        }
    }


    public static void main(String[] args) {
        
        Cronometre crono = new Cronometre();
        crono.start();
        Cronometre.sleep(125);
        crono.stop();
        
        
        
    }

}
