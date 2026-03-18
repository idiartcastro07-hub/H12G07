package c;

import c.ejercicio3_2.*;
import c.ejercicio3_3.*;
import c.ejercicio3_4.*;
import c.ejercicio3_5.*;
import c.ejercicio3_6.*;

import java.util.Arrays;

public class TestMainC {
    public static void main(String[] args) {
        // Person, student and staff
        Person p1 = new Person ("Evaristo", "Calle San Lorenzo");
        System.out.println(p1);
        System.out.println("Name is:" + p1.getName());
        System.out.println("Address is:" + p1.getAdress());
        Student s1 = new Student("Mercedes", "Avenida la Paz", "G231", 2024, 382);
        System.out.println(s1);
        System.out.println("Name is:" + s1.getName());
        System.out.println("Address is:" + s1.getAdress());
        System.out.println("Program is: " + s1.getProgram());
        System.out.println("Year is:" + s1.getYear());
        System.out.println("Fee is: " + s1.getFee());
        Staff st1 = new Staff("Teodora", "Calle de la Concordia", "Liceo la Paz", 187.99);
        System.out.println(st1);
        System.out.println("Name is:" + st1.getName());
        System.out.println("Address is:" + st1.getAdress());
        System.out.println("School is: " + st1.getSchool());
        System.out.println("Pay is: " + st1.getPay());

        System.out.println();

        // Point 2D y Point 3D
        Point2D p2 = new Point2D (3, 6);
        System.out.println(p2);
        p2.setX(4);
        System.out.println("x is: " + p2.getX());
        System.out.println("y is: " + p2.getY());
        System.out.println("(x,y) is: " + Arrays.toString(p2.getXY()));
        Point3D p3 = new Point3D (8,2,7);
        System.out.println(p3);
        p3.setY(6);
        System.out.println("x is: " + p3.getX());
        System.out.println("y is: " + p3.getY());
        System.out.println("z is: " + p3.getZ());
        System.out.println("(x,y,z) is: " + Arrays.toString(p3.getXYZ()));

        System.out.println();

        // Point y Movable Point
        Point p4 = new Point (1,2);
        System.out.println(p4);
        System.out.println("x is: " + p4.getX());
        System.out.println("y is: " + p4.getY());
        p4.setX(4);
        System.out.println(p4);
        MovablePoint mp1 = new MovablePoint(3,2,5,3);
        System.out.println(mp1);
        System.out.println("x is: " + mp1.getX());
        System.out.println("y is: " + mp1.getY());
        System.out.println("xSpeed is: " +  mp1.getXSpeed());
        System.out.println("ySpeed is: " +  mp1.getYSpeed());
        System.out.println("Speed is: " +  Arrays.toString(mp1.getSpeed())); // Asi Java puede leer el array
        System.out.println("Move is: " +  mp1.move());
        mp1.setSpeed(2,1);
        System.out.println("Speed is: " + Arrays.toString(mp1.getSpeed()));

        System.out.println();

        //Shape y subclases
        Shape sh = new Shape("green", true);
        System.out.println(sh);
        System.out.println("Color is: " + sh.getColor());
        System.out.println("Filled is: " + sh.isFilled());
        Circle c1 = new Circle(5);
        System.out.println(c1);
        System.out.println("Filled is: " + c1.isFilled());
        System.out.println("Color is: " + c1.getColor());
        System.out.println("Radius is: " + c1.getRadius());
        System.out.println("Area is: " + c1.getArea());
        System.out.println("Perimeter is: " + c1.getPerimeter());
        Rectangle r1 = new Rectangle(5,3);
        System.out.println(r1);
        r1.setColor ("Pink");
        System.out.println("Width is: " + r1.getWidth());
        System.out.println("Length is: " + r1.getLength());
        System.out.println("Color is: " + r1.getColor());
        System.out.println("Filled is: " + r1.isFilled());
        Square sq1 = new Square();
        System.out.println(sq1);
        System.out.println("Filled is: " + sq1.isFilled());
        System.out.println("Color is: " + sq1.getColor());
        System.out.println("Side is: " + sq1.getSide());

        System.out.println();

        // Animal
        Animal a1 = new Animal("Max");
        System.out.println(a1);
        Mammal m1 = new Mammal("Peggie");
        System.out.println(m1);
        Cat c4 = new Cat("Simba");
        System.out.println(c4);
        c4.greets();
        Dog d1 = new Dog ("Mia");
        Dog d2 = new Dog ("Coco");
        System.out.println(d1);
        System.out.println(d2);
        d1.greets();
        d1.greets(d2);
    }
}