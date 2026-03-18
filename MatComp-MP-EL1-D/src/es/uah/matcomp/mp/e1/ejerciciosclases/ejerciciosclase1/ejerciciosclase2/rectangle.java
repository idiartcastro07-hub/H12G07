package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase2;

public class rectangle implements geometricobject {
    private double width;
    private double length;

    public rectangle (double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString () {
        return "Rectangle [width = " +width+ ", length = " +length+ "]";
    }

    @Override
    public double getArea () {
        return width * length;
    }

    @Override
    public double getPerimeter () {
        return 2*width + 2*length;
    }

}
