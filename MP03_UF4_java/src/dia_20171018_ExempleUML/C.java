package dia_20171018_ExempleUML;

public class C extends B {

    private D agregacio;

    private D composicio;

    public void setAgregacio(D agregacio) {
        this.agregacio = agregacio;
    }

    public void setComposicio(D composicio) throws CloneNotSupportedException {
        this.composicio = composicio.clone();
    }

    public D getAgregacio() {
        return agregacio;
    }

    public D getComposicio() {
        return composicio;
    }

    @Override
    public void fesAlgunaCosa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
