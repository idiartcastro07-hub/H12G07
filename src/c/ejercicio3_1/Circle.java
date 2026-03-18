package c.ejercicio3_1;

public class Circle {
    // Atributos privados de la clase con valores determinados
    private double radius = 1.0;
    private String color = "red";

    // Se crea un metodo de circulo con los valores especificados en los atributos
    public Circle(){}

    // Se crea un ciculo con los valores del
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    } //Devuelve radio
    public void setRadius(double radius) {
        this.radius = radius;
    } //Calcula y devuelve el redio
    public String getColor() {
        return color;
    } //Devuelve el color
    public void setColor(String color) {
        this.color = color;
    } //Establece el color

    // Calcula el area y lo devielve
    public double getArea(){
        return Math.PI * radius  * radius;
    }

    @Override
    public String toString(){
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }//imprime resultado
}