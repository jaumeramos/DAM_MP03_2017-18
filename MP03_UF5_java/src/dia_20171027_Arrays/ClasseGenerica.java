
package dia_20171027_Arrays;



public class ClasseGenerica<E> {
    
    private E element;
    
    public ClasseGenerica(E element){
        
        this.element = element;
        
    }
    
    public void setElement(E element){
        this.element = element;
    }
    
    public E getElement(){
        return element;
    }

}
