package java_20170913;
public class Java_20170913 {
    
    static int  count = 0;
    
    public static  void saludar(){
        System.out.println("Saludo!! Num: " + ++count);
    }
    
    public static void main(String[] args) {
        Java_20170913 obj = new Java_20170913();
        obj.saludar();
        
        Java_20170913 obj1 = new Java_20170913();
        obj1.saludar();
        obj1.saludar();
        
        Java_20170913 obj2 = new Java_20170913();        
        obj2.saludar();
        
        Java_20170913.saludar();
        
        
        
        
    }    
}
