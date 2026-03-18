package c.ejercicio4_2;

public class TestCylinder {
    public static void main(String[] args) {

        // Nuevo cilindro c1
        Cylinder c1 = new Cylinder();
        System.out.println(c1);
        System.out.println("Altura: " + c1.getHeight());
        System.out.println("Radio: " + c1.getRadius());
        System.out.println("Color: " + c1.getColor());
        System.out.println("Área: " + c1.getArea());
        System.out.println("Volumen: " + c1.getVolume());

        // Nuevo cilindro c2
        Cylinder c2 = new Cylinder(3.0, 5.0);
        System.out.println("\n" + c2);
        System.out.println("Altura: " + c2.getHeight());
        System.out.println("Radio: " + c2.getRadius());
        System.out.println("Área: " + c2.getArea());
        System.out.println("Volumen: " + c2.getVolume());

        // Nuevo cilindro c3
        Cylinder c3 = new Cylinder(2.0, 4.0, "blue");
        System.out.println("\n" + c3);
        System.out.println("Color: " + c3.getColor());

        // Cambiar atributos con setters
        c3.setHeight(10.0);
        c3.setRadius(5.0);
        c3.setColor("red");
        System.out.println("\nTras modificar c3:");
        System.out.println(c3);
        System.out.println("Área: " + c3.getArea());
        System.out.println("Volumen: " + c3.getVolume());
    }
}