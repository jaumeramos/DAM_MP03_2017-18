package dia_20171027_Arrays;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;



public class ArraysFitxers {
    
    
    public static void main(String[] args) throws FileNotFoundException{
        
        /*
    Integer[] arr = {31,12,3};
    
    for (int i =0; i<arr.length;i++){
        System.out.println(arr[i]);
    }    
    
    Arrays.sort(arr);
    
    for (Integer i : arr){
        System.out.println(i);
    }
    
    Arrays.fill(arr, 7); 
    
    Iterator it = Arrays.asList(arr).iterator();
    while (it.hasNext()){
        System.out.println(it.next());        
    }
    
    arr = Arrays.copyOf(arr, 5);
    
    for (Integer i : arr){
        System.out.println(i);
    }
    */
    
    Scanner in = new Scanner(new FileReader("fitxer.txt"));
    while(in.hasNext()){
        Integer i = Integer.parseInt(in.nextLine());
        System.out.println(i);        
    }
    
   
    
    
    
        
    }
    
    
    

}
