package c.ejercicio4_2;

public class Cylinder {
    // Artibutos privados de la clase
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }

    // Getters y setters de los atributos
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return base.getRadius();
    }
    public void setRadius(double radius) {
        base.setRadius(radius);
    }

    public String getColor() {
        return base.getColor();
    }
    public void setColor(String color) {
        base.setColor(color);
    }

    // Calculo del area y del volumen
    public double getArea() {
        return 2 * Math.PI * getRadius() * (getRadius() + height);
    }
    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[" + base.toString() + ", height=" + height + "]";
    }
}

/* Es mas correcto hacerlo por composicion porque, si utilizamos la herencia, el cilindro
* heredaría propiedades del circulo que no tienen sentido en el cilindro. Y haciendolo por
* composición el circulo unicamente se entiende como la base del cilindro, lo que es realmente. */