package a;

public class Circle {
    // Atributo privado con valor determinado
    private double radius = 1.0;

    public Circle() {
        // No hay parametros el valor de radius ya esta especificado
    }

    // Nuevo Circle con el radio introducido cuando se vaya a imprimir
    public Circle(double x) {
        radius = x;
    }

    // Getter que retorna el radio
    public double getRadius() {
        return radius;
    }

    // Getter que calcula y retorna el area del circulo
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Setter que nos permitira modificar el radio de un circulo ya creado
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter que calcula y retorna el perimetro del circulo
    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    // Muestra como se imprimira por pantalla
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

}