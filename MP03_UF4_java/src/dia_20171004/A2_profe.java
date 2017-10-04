package dia_20171004;

import java.util.Scanner;

public class A2_profe {

    /*
    Rebem coma entrada un nombre amb el valor de la suma de dígits.
    Després rebem una serie de nombres acabada amb zero.
    Cal mostrar el menor dels nombres positius la suma dels dígits del qual
    sigui igual al primer nombre entrat.
    
    Exemple d'entrada
    8
    71
    23
    17
    0
    
    Exemple de sortida
    17
    
    
    */
    public static void main(String[] args) {

        int menor = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        int sumaDigits = scanner.nextInt();
        String numStr = scanner.next();
        while (!numStr.equals("0")) {
            int suma = 0;
            for (int i = 0; i < numStr.length(); i++) {
                suma += Character.getNumericValue(numStr.charAt(i));
            }
            if (suma == sumaDigits) {
                int num = Integer.parseInt(numStr);
                if (num < menor) {
                    menor = num;
                }
            }
            numStr = scanner.next();
        }
        scanner.close();
        System.out.println(menor);

    }

}
