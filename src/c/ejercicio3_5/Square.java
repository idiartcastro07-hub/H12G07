package c.ejercicio3_5;

public class Square extends Rectangle {
    public Square() {}

    public Square (double side) {
        super (side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter del lado del cuadrado
    public double getSide() {
        return getWidth(); //Coge este getter de Rectangle porque el lado de este equivale al del cuadrado
    }

    // Setter del lado del cuadrado que hereda los del rectangulo por tanto emplea sus setters
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    } //hereda

    @Override
    public void setLength(double side) {
        super.setLength(side);
    } //hereda

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}