package java_20170914;


public class Primera {
    
    String s = "primer atribut";
    boolean b = true;
    
    public  int num = 3;
    
    public Primera(){        
        System.out.println("Constructor Buid");
    }
    
    public Primera(String s, boolean b){
        System.out.println("Constructor amb paràmetres");
        
        this.s = s;
        this.b = b;
        
    }
    
    
    public  String primerMetode(){
        return "Hola";        
    }    
    public static  String segonMetode(){
        return "Hola";
    }
    
   
    public static void main(String[] args) {
        
        Primera p = new Primera();
        Primera p1 = new Primera("Hola", false );
        
        System.out.println(p.s + p.b);
        
        System.out.println(p1.s + p1.b);
        
        Primera p2 = new Primera("Adeu ", true );
        System.out.println(p2.s + p2.b);
        
        System.out.println(p.num);
        System.out.println(p1.num);
        System.out.println(p2.num);
        
        p1.num= 8;
        
        
        System.out.println(p.num);
        System.out.println(p1.num);
        System.out.println(p2.num);
        
        
        
    }
    
    

}
