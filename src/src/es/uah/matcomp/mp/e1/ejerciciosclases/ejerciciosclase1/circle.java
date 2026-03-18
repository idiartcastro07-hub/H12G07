package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1;

public class circle extends shape {
    protected double radius = 1.0;

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
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea () {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter () {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString () {
        return "Circle [" +super.toString()+ ", radius = " +radius+ "]";
    }


}
