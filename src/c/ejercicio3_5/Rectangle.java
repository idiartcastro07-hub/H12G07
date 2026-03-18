package c.ejercicio3_5;

public class Rectangle extends Shape {
    // Atributos privados con valores concretos
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled); // Tomamos los atributos de Shape
        this.width = width;
        this.length = length;
    }

    //Getters y setters de los atributos
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    // Calculo del area y del perimetro
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ",width=" + width + ",length=" + length + "]";
    }
}