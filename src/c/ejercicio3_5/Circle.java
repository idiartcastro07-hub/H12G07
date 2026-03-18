package c.ejercicio3_5;


public class Circle extends Shape{
    // Atributo privado de la clase con valor especifico
    private double radius = 1.0;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super (color, filled); //Tomamos los valores de la superclase
        this.radius = radius;
    }

    // Getters del atributo
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculo del area y del perimetro mediante getters
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + ",radius=" + radius + "]";
    }
}