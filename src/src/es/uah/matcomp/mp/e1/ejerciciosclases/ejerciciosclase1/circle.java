package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1;

public class circle extends shape {
    protected double radius = 1.0;//definimos radio protegido

    //Constructores
    public circle() {

    }

    public circle(double radius) {
        this.radius = radius;
    }

    public circle (double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius () {
        return radius;
    }//devuelve radio

    public void setRadius (double radius) {
        this.radius = radius;
    }//calcula y devuelve radio

    @Override
    public double getArea () {
        return radius * radius * Math.PI;
    }//devuelve area del circulo

    @Override
    public double getPerimeter () {
        return 2 * radius * Math.PI;
    }//devuelve perimetro del circulo

    @Override
    public String toString () {
        return "Circle [" +super.toString()+ ", radius = " +radius+ "]";
    }//imprime por pantalla


}
