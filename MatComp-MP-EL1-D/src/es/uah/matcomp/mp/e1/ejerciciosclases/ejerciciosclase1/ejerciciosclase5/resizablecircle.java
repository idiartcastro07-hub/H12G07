package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase5;

public class resizablecircle extends circle implements resizable{

    public resizablecircle (double radius) {
        super(radius);
    }

    @Override
    public String toString () {
        return "ResizableCircle [" +super.toString()+ "]";
    }

    @Override
    public void resize (int percent) {
        radius *= percent / 100.0 ;
    }
}
