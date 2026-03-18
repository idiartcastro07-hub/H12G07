package c.ejercicio4_1;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line (2,4,5,0);
        System.out.println(l1);
        System.out.println("Length: " + l1.getLength());
        System.out.println("Gradient: " + l1.getGradient());

        Point p1 = new Point (8,1);
        Point p2 = new Point (2,5);
        Line l2 = new Line (p1,p2);
        System.out.println(l2);
        System.out.println("Length: " + l2.getLength());
        System.out.println("Gradient: " + l2.getGradient());

        l2.setBeginXY(3,5);
        l2.setEndXY(6,2);
        System.out.println(l2);
        System.out.println("BeginX is: " + l2.getBeginX());
        System.out.println("BeginY is: " + l2.getBeginY());
        System.out.println("EndX is: " + l2.getEndX());
        System.out.println("EndY is: " + l2.getEndY());
    }
}