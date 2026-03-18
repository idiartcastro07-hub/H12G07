package c.ejercicio3_1;

public class TestCylinder {
    public static void main (String[] args) {
        // Se crea un nuevo cilindro c1 utilizando los valores de los atributos
        Cylinder c1 = new Cylinder();
        // Se imprimen todos los valores del circulo y del cilindro a traves de los getters
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume());
        // Se crea un nuevo cilindro c2 especificando la altura
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume());
        // Se crea un nuevo cilindro c3 especificando la altura y el radio
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume());
    }
}
