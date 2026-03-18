package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase5;

public class circle implements geometricobject {
    protected double radius; //Definimos el radio protegido

    //Constructores
    public circle (double radius) {
        this.radius = radius;
    }

    @Override
    public String toString () {
        return "Circle [radius = " +radius+ "]";
    } //Imprime por pantalla

    @Override
    public double getArea () {
        return radius * radius *Math.PI;
    } //calculamos area

    public double getPerimeter () {
        return 2 * radius * Math.PI;
    } //calculamos perimetro
}
