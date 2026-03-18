package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase5;

public class TestMain5 {
    public static void main (String[] args) {

        geometricobject g1 = new circle(3);
        System.out.println(g1);
        System.out.println(g1.getArea());
        System.out.println(g1.getPerimeter());

        resizablecircle r2 = new resizablecircle(2);
        System.out.println(r2);
        r2.resize(200);
        System.out.println(r2);
    }
}
