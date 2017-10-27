
package dia_20171027_Arrays;



public class Main {

    public static void main(String[] args){
        
        ClasseGenerica<Integer> cg = new ClasseGenerica<Integer>(23);
        
        System.out.println(cg.getElement());
        
        
        ClasseGenerica<String> cg1 = new ClasseGenerica("Hola");
        
        System.out.println(cg1.getElement());
        
        
        ClasseGenerica<ClasseNova> cg2 = new ClasseGenerica(new ClasseNova());
        
        System.out.println(cg2.getElement());
        
        
        
    }
    
}
