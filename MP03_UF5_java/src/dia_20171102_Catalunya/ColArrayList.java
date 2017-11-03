package dia_20171102_Catalunya;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;


public class ColArrayList {

    public static void main(String[] args) throws FileNotFoundException{
        
        List<Integer> v = new LinkedList();//new ArrayList();
                
        Scanner in = new Scanner(new FileReader("Enters.txt"));
        while (in.hasNext()) {
            Integer i = Integer.parseInt(in.nextLine());
            v.add(i);
        }
        in.close();
        /*
        for (int i = 0; i<v.size();i++){
            System.out.println(v.get(i));
        }
        */
        
        /*
        Iterator it  = v.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        */
        /*
        v.forEach((element) -> {
            System.out.println(element);
        });
        */
        
        //v.forEach(System.out::println);
        
        //Collections.sort(v);
        //Collections.reverse(v);
        
       Collections.sort(v, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                // primer parells despres senars
                if ((o1.intValue() % 2)==0){
                    if ((o2 % 2)==0){
                        return o1.compareTo(o2);
                    }else {
                        return -1;                                            
                    }
                } else {
                    return  o1.compareTo(o2);                    
                }
            }        
        });
       
       Collections.sort(v, (Integer o1, Integer o2) -> o1.compareTo(o2) );
              
       v.remove(v.indexOf(22));
       
       
       
        
        
        
        
        v.forEach(new Consumer<Integer>(){
            @Override
            public void accept(Integer t) {
                System.out.println(t);
            }
            
        });
        
        
        
    }
    
    
}
