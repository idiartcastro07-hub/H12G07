package d.ejerciciosclase2;

public class rectangle implements geometricobject {
    //Definimos largo y ancho
    private double width;
    private double length;

    //Constructores
    public rectangle (double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString () {
        return "Rectangle [width = " +width+ ", length = " +length+ "]";
    } //Imprime resultado por pantalla

    @Override
    public double getArea () {
        return width * length;
    } //Calcula y devuelve area del rectangulo

    @Override
    public double getPerimeter () {
        return 2*width + 2*length;
    } //Calcula y devuelve perimetro del rectangulo

}
