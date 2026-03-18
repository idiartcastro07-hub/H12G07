package d.ejerciciosclase5;

public class resizablecircle extends circle implements resizable{

    //Constructores
    public resizablecircle (double radius) {
        super(radius);
    }

    @Override
    public String toString () {
        return "ResizableCircle [" +super.toString()+ "]";
    } //imprime por pantalla

    @Override
    public void resize (int percent) {
        radius *= percent / 100.0 ;
    }//calcular resize especifico
}
