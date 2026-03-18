package d;

public class Main {
    public static void main(String[] args) {
        shape s1 = new circle(5.5, "red", false);  // Upcast Circle to Shape. s1 se define como shape pero es circulo
        System.out.println(s1);                    // which version?polimorfismo
        System.out.println(s1.getArea());          // which version?polimorfismo
        System.out.println(s1.getPerimeter());     // which version?polimorfismo
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        ((circle) s1).getRadius();//acceder a radio
        //System.out.println(s1.getRadius()); Esto es un error porque getRadius no esta definido en shape, y como s1 es de tipo shape no lo reconoce.

        circle c1 = (circle)s1;                   // Downcast back to Circle.circle originalmente
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //shape s2 = new shape(); esto da error puesto que como shape es una clase abstracta, no se puede crear nada desde ella misma
        shape s3 = new rectangle(1.0, 2.0, "red", false);   // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); esto es lo mismo que en el caso anterior, shape no reconoce getLength
        ((rectangle) s3).getLength();

        rectangle r1 = (rectangle) s3;   // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        shape s4 = new square(6.6);     // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide());  getSide esta definido en square y por tanto s4, tipo de shape, no reconoce a la funcion
        ((square)s4).getSide();

        // Take note that we downcast Shape s4 to Rectangle,
//  which is a superclass of Square, instead of Square
        rectangle r2 = (rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); exactamente lo mismo que los casos anteriores, pero este caso es rectangle el que no reconoce getSide, que esta definido en square
        System.out.println(r2.getLength());
        // Downcast Rectangle r2 to Square
        square sq1 = (square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}

// Las clases abstractas sirven para especificar un clase que principalmente es general. Shape incluye a todo tipo de formas genericas, por tanto se necesita especificar con subclase como circle
// Los metodos abstractos sirven para que cada subclase genere la funcion declarada por la principal de manera independiente y como mejor le vaya. Ademas, las subclases estan obligadas a implementarlas.