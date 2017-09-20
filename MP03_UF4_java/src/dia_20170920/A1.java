package dia_20170920;

import java.util.Scanner;

public class A1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (!(a < 0 || b < 0)) {
            System.out.println(2 * (a + b));
            a = scanner.nextInt();
            b = scanner.nextInt();
        };
        scanner.close();

    }

}
