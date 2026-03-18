package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1;

public class square extends rectangle {

    public square () {

    }

    public square (double side) {
        setWidth(side);
        setLength (side);
    }

    public square (double side, String color, boolean filled) {
        super (side, side, color, filled);

    }

    public double getSide () {
        return getWidth();
    }

    public void setSide (double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth (double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength (double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString () {
        return "Square [" +super.toString()+ "]";
    }
}
