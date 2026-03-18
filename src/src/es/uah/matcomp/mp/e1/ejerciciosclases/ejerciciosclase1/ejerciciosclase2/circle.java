package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase2;

public class circle implements geometricobject {
    private double radius;

    public circle (double radius) {
        this.radius = radius;
    }

    @Override
    public String toString () {
        return "Circle [radius = " +radius+ "]";
    }

    @Override
    public double getArea () {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter () {
        return 2*radius*Math.PI;
    }

}
