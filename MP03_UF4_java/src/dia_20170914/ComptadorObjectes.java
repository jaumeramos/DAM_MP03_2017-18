
package dia_20170914;



public class ComptadorObjectes {
    
    static int contador = 0;
    
    int num;
    
    public ComptadorObjectes(){
       contador++;
        System.out.println("Objectes creats: " + contador);
        num= contador;
    }
    
    
    
    public static void main(String[] args){
        ComptadorObjectes o1 = new ComptadorObjectes();
        ComptadorObjectes o2 = new ComptadorObjectes();
        ComptadorObjectes o3 = new ComptadorObjectes();
        ComptadorObjectes o4 = new ComptadorObjectes();
        
        System.out.println(o1.num);
        System.out.println(o2.num);
        System.out.println(o3.num);
        System.out.println(o4.num);
        
        o4 = o3;
        
        System.out.println(o1.num);
        System.out.println(o2.num);
        System.out.println(o3.num);
        System.out.println(o4.num);
        
        o4.num = o3.num;
        o4 = o3;
        o3 = o4;
        
        System.out.println(o1.num);
        System.out.println(o2.num);
        System.out.println(o3.num);
        System.out.println(o4.num);
        
        
    }

}
