package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase3;


public class TestMain3 {
    public static void main(String[] args) {

        movable m1 = new movablepoint(3,4,6,2);
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);

    }
}
