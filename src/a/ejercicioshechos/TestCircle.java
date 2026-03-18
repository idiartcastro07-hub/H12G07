package a.ejercicioshechos;

public class TestCircle { // Se crea la clase TestCircle
    public static void main(String[] args) {
        // Se crea un  circulo con los valores dados en Circle.java
        Circle c1 = new Circle();
        // Se imprimen por pantalla el radio y el area del circulo
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());

        // Se crea un nuevo circulo con el radio indicado, el color sera el determinado en Circle.java
        Circle c2 = new Circle(2.0);
        // Se imprimen el radio y el area del circulo
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());

        // Construir un nuevo circulo con los valores determinados en Circle.java
        Circle c4 = new Circle();
        c4.setRadius(5.5); // Cambio del radio de este nuevo circulo
        System.out.println("radius is: " + c4.getRadius()); // Se imprime el radio mediante el getter
        c4.setColor("green"); // Cambio del color mediante setter
        System.out.println("color is: " + c4.getColor()); // Imprimir color mediante getter
        // Cambio de radio
        c4.setRadius(4.4);
        System.out.println(c4);
    }
}