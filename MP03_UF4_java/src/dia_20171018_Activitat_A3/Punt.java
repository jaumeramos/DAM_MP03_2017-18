package dia_20171018_Activitat_A3;

import java.util.Scanner;

public class Punt {

    double x;
    double y;

    public Punt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanciaPunt(Punt p) {
        return Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2));
    }

    public double distanciaX(Punt p) {
        return Math.abs(p.x - x);
    }

    public double distanciaY(Punt p) {
        return Math.abs(p.y - y);
    }

    public static Punt demanarPunt() {

        System.out.println("Entra els dos punts separats per espai (el separador decimal és coma)");
        Scanner scanner = new Scanner(System.in);
        double x = 0, y = 0;
        if (scanner.hasNextDouble()) {
            x = scanner.nextDouble();
        }
        if (scanner.hasNextDouble()) {
            y = scanner.nextDouble();
        }
        //scanner.close();
        return new Punt(x, y);

    }

    ;
    
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
