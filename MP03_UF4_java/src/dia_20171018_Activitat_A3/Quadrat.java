package dia_20171018_Activitat_A3;



public class Quadrat extends Rectangle{
    
    public Quadrat(Punt p1, double costat){
        super(p1, new Punt(p1.getX()+costat, p1.getY()+costat));
    }

}
