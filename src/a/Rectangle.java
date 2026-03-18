package a;

public class Rectangle {
    // Atributos privados de la clase con valores ya especificados
    private float length = 1.0f;
    private float width = 1.0f;

    // Rectangulo calculado con los atributos especificados en la clase
    public Rectangle(){}

    // Rectangulo con valores determinados posteriormente
    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    // Getters y setters de los diferentes atributos
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }

    // Calcula y devuelve el area del rectangulo
    public double getArea() {
        return length * width;
    }

    // Calcula y devuelve el perimetro del rectangulo
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }
}