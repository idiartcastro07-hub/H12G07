package a.ejercicioshechos;

public class Circle { // Se crea la clase Circle.java
    // Atributos privados con valores especificados
    private double radius = 1.0;
    private String color = "red";

    // Se crea un circulo con los valores especificados anteriormente
    public Circle() {}

    // Se crea un circulo con el radio determinado en la impresion y el valor del color del atributo
    public Circle(double radius) { // 2nd constructor
        this.radius = radius;
    }

    // Circulo creado con el color y el radio especificados en la impresion
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getters que devuelcen los atributos color y radio
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    // Setters que permiten modificar los atributos una vez creado el circulo
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    public void setColor(String newColor) {
        color = newColor;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }

    // Calcula del area
    public double getArea() {
        return radius*radius*Math.PI;
    }
}