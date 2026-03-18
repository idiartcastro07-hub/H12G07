package a.ejercicioshechos;

public class TestCircle { // Se crea la clase TestCircle.java
    public static void main(String[] args) {
        // Se crea un nuevo circulo c1
        Circle c1 = new Circle();
        // Se imprimen su radio y area con los getters
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
        // Se crea un nuevo circulo c2
        Circle c2 = new Circle(2.0);
        // Se imprimen su radio y area con los getters
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
        // Se crea un nuevo circulo c4
        Circle c4 = new Circle();
        c4.setRadius(5.5); // Cambio de radio mediante setter
        System.out.println("radius is: " + c4.getRadius()); // Impresion del radio ya cambiado
        c4.setColor("green"); // Cambio de color mediante setter
        System.out.println("color is: " + c4.getColor()); // Impresion del color ya cambiado
        // Cambio de radio mediante setter
        c4.setRadius(4.4);
        System.out.println(c4);
    }
}