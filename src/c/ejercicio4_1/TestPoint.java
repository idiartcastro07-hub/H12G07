package c.ejercicio4_1;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10,0); // Construct a Point
        System.out.println(p1);
        // Try setting p1 to (100, 10)
        p1.setXY(100,10);
        System.out.println(p1);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
    }
}