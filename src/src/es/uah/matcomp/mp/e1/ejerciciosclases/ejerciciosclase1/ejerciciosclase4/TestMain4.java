package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase4;

public class TestMain4 {
    public static void main (String[] args) {

        movable m1 = new movablepoint(3,4,6,8);
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);

        movable m2 = new movablecircle(2,7,4,6,8);
        System.out.println(m2);
        m2.moveUp();
        System.out.println(m2);
        m2.moveDown();
        System.out.println(m2);
        m2.moveLeft();
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}
