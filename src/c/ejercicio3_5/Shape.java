package c.ejercicio3_5;

public class Shape {
    // Atributos privados con valores concretos
    private String color = "red";
    private boolean filled = true;

    // El valor de los atributos esta especificado en la clase
    public Shape() {}

    // El valor de los atributos se toma de lo parentesis en la impresion
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getters y setters de los atributos
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}