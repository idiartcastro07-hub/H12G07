package d.ejerciciosclase2;

public class circle implements geometricobject {
    private double radius; //definimos el radio

    //constructores
    public circle (double radius) {
        this.radius = radius;
    }

    @Override
    public String toString () {
        return "Circle [radius = " +radius+ "]";
    } //imprime resultado por pantalla

    @Override
    public double getArea () {
        return radius*radius*Math.PI;
    } //Calcula y devuelve el area del circulo

    @Override
    public double getPerimeter () {
        return 2*radius*Math.PI;
    } //Calcula y devuelve el perimetro del circulo

}
