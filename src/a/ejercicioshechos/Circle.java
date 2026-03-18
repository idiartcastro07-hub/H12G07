package a.ejercicioshechos;

public class Circle { // Se crea la clase Circle.java
    // Atributos radio y color (del circulo) privados
    private double radius = 1.0;
    private String color = "red";

    // Construye un Circle con los valores ya aportados
    public Circle() {}

    // Construye un Circle con un nuevo radio
    public Circle(double radius) { // 2nd constructor
        this.radius = radius;
    }

    // Construye un nuevo Circle con nuevo radio y color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getters que devuelven los valores del radio y el color
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    // Setters para las variables radio y color
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    public void setColor(String newColor) {
        color = newColor;
    }

    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }

    // Devuelve el area el circulo
    public double getArea() {
        return radius*radius*Math.PI;
    }
}