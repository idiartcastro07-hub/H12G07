package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1;

public class rectangle extends shape {
    //definimos ancho y largo protegido
    protected double width = 1.0;
    protected double length = 1.0;

    //Constructores
    public rectangle () {

    }

    public rectangle (double width, double length) {
        this.width = width;
        this.length = length;
    }

    public rectangle (double width, double length, String color, boolean filled) {
        super (color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth () {
        return width;
    }//Devuelve width

    public void setWidth (double width) {
        this.width = width;
    }//calcula y devuelve width

    public double getLength () {
        return length;
    }//devuelve length

    public void setLength (double length) {
        this.length = length;
    }//calcula y devuelve length

    @Override
    public double getArea () {
        return length * width;
    }//devuelve area

    @Override
    public double getPerimeter () {
        return 2*width + 2*length;
    }//devuelve perimetro

    @Override
    public String toString () {//imprime por pantalla
        return "Rectangle [" +super.toString()+ ", width = " +width+ ", length = " +length+ "]";
    }
}
