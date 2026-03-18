package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase2;
//programa de prueba
public class TestMain {
    public static void main() {

        //Creamos circulo de radio 3 y mostramos los datos del area y perimetro
        geometricobject g1 = new circle(3);
        System.out.println(g1);
        System.out.println(g1.getArea());
        System.out.println(g1.getPerimeter());

        //Creamos rectangulo de ancho 2 y largo7 y mostramos los datos del area y perimetro
        geometricobject g2 = new rectangle (2,7);
        System.out.println(g2);
        System.out.println(g2.getArea());
        System.out.println(g2.getPerimeter());


    }

}
