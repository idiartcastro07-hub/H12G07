package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase2;

public class TestMain {
    public static void main() {

        geometricobject g1 = new circle(3);
        System.out.println(g1);
        System.out.println(g1.getArea());
        System.out.println(g1.getPerimeter());

        geometricobject g2 = new rectangle (2,7);
        System.out.println(g2);
        System.out.println(g2.getArea());
        System.out.println(g2.getPerimeter());


    }

    public static class TestMain5 {
        public static void main (String[] args) {

        }
    }
}
