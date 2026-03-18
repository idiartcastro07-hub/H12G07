package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase5;

public class TestMain5 {
    public static void main (String[] args) {

        //Creamos circulo con radio 3 y calculamos area y perimetro
        geometricobject g1 = new circle(3);
        System.out.println(g1);
        System.out.println(g1.getArea());
        System.out.println(g1.getPerimeter());

        //Calculamos resizable circle con radio 2 y calculamos resize
        resizablecircle r2 = new resizablecircle(2);
        System.out.println(r2);
        r2.resize(200);
        System.out.println(r2);
    }
}
