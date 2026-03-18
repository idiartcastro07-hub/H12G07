package c.ejercicio4_1;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub l1 = new LineSub(9, 0, 1, 4);
        System.out.println(l1);
        System.out.println("Length is: " + l1.getLength());
        System.out.println("Gradient is: " + l1.getGradient());

        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);
        LineSub l2 = new LineSub(p1, p2);
        System.out.println(l2);
        System.out.println("Length is: " + l2.getLength());
        System.out.println("Gradient is: " + l2.getGradient());

        l2.setBeginXY(5, 2);
        l2.setEndXY(3, 4);
        System.out.println("BeginX is: " + l2.getBeginX());
        System.out.println("BeginY is: " + l2.getBeginY());
        System.out.println("EndX is: " + l2.getEndX());
        System.out.println("EndY is: " + l2.getEndY());
    }
}