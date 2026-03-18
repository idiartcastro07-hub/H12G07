package b;

import b.ejerciciosclases.*;

//programa probador
public class TestMain {
    public static void main(String[] args) {

        //NUEVAS MODIFICACIONES AUTHOR Y BOOK
        // Test Author class
        //Crea autor e email y calcula y muestra datos
        author a1 = new author("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(a1);
        a1.setEmail("ahteck@somewhere.com");
        System.out.println(a1);
        System.out.println("name is: " + a1.getName());
        System.out.println("email is: " + a1.getEmail());
        // Test Book class
        //Crea un libro y calcula los datos con sus respectivos metodos y los muestra
        book b1 = new book("12345", "Java for dummies", a1, 8.8, 88);
        System.out.println(b1);
        b1.setPrice(9.9);
        b1.setQty(99);
        System.out.println(b1);
        System.out.println("isbn is: " + b1.getIsbn());
        System.out.println("name is: " + b1.getName());
        System.out.println("price is: " + b1.getPrice());
        System.out.println("qty is: " + b1.getQty());
        System.out.println("author is: " + b1.getAuthor());  // Author's toString()
        System.out.println("author's name: " + b1.getAuthorname());
        System.out.println("author's name: " + b1.getAuthor().getName());
        System.out.println("author's email: " + b1.getAuthor().getEmail());

        //CLIENTE Y FACTURA
        // Test Customer class
        //Crea customer y calcula datos con sus respectivo metodos y los muestra
        customer c1 = new customer(88, "Tan Ah Teck", 10);
        System.out.println(c1);  // Customer's toString()
        c1.setDiscount(8);
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("discount is: " + c1.getDiscount());
        // Test Invoice class
        //Crea invoice, calculando datos con sus respectivos metodos y los muestra
        invoice inv1 = new invoice(101, c1, 888.8);
        System.out.println(inv1);
        inv1.setAmount(999.9);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("customer is: " + inv1.getCustomer());  // Customer's toString()
        System.out.println("amount is: " + inv1.getAmount());
        System.out.println("customer's id is: " + inv1.getCustomerId());
        System.out.println("customer's name is: " + inv1.getCustomerName());
        System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
        System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());

        //MYPOINT
        // Test program to test all constructors and public methods
        //Calcula el point y con sus respectivos metodos calcula las coordenadas
        mypoint p1 = new mypoint();  // Test constructor
        System.out.println(p1);
        // Test toString()
        p1.setX(8);
        p1.setY(6);
        // Test setters
        System.out.println("x is: " + p1.getX());  // Test getters
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0);
        // Test setXY()
        System.out.println(p1.getXY()[0]);  // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        mypoint p2 = new mypoint(0, 4);  // Test another constructor
        System.out.println(p2); // Testing the overloaded methods distance()
        System.out.println(p1.distance(p2)); // which version? distance(another mypoint)
        System.out.println(p2.distance(p1)); // which version? distance(another mypoint)
        System.out.println(p1.distance(5, 6));  // which version? distance(x int, y int)
        System.out.println(p1.distance()); // which version? distance (0,0)

        //Con los puntos de distancia, crear una matriz con for
        mypoint[] points = new mypoint[10];
        for (int i = 0; i < 10; i++) {
            points[i] = new mypoint(i+1,i+1);
            System.out.println(points[i]);
        }


        //MY LINE Y MY POINT
        //Crear linea con coordenadas que tu deseas y calcular los metodos
        myline l2 = new myline(2,4,5,6);  // Test constructor
        System.out.println();
        mypoint p3 = new mypoint (4,8);
        mypoint p4 = new mypoint (3,6);
        myline l3 = new myline (p3, p4);
        System.out.println(l3);
        // Test toString()
        l2.setBeginX(9);
        l2.setBeginY(6);
        l2.setEndX(5);
        l2.setEndY(3);
        // Test setters
        System.out.println("x1 is: " + l2.getBeginX());  // Test getters
        System.out.println("y1 is: " + l2.getBeginY());
        System.out.println("x2 is: " + l2.getEndX());
        System.out.println("y2 is: " + l2.getEndY());
        l2.setBeginXY(2,5);
        l2.setEndXY(4,6);
        // Test setXY()
        System.out.println(l2.getBeginXY()[0]);  // Test getXY()
        System.out.println(l2.getEndXY()[1]);
        System.out.println(l2);
        myline l4 = new myline(0,9,8,8);  // Test another constructor
        System.out.println(l4); // Testing the overloaded methods distance()
        myline l5 = new myline (2,3,4,5);
        System.out.println("length is: " +l5.getLength());
        System.out.println("Gradient is: " +l5.getGradient()); //grados

        //MYCIRCLE
        //Crear circle con coordenadas y radio que deseas y calcular los metodos establecido en la clase
        mycircle c3 = new mycircle(2,3,6);  // Test constructor
        System.out.println(c3);
        mypoint p5 = new mypoint (4,8);
        mypoint p6 = new mypoint (3,6);
        myline c4 = new myline (p5, p6);
        System.out.println(c4);
        // Test toString()
        c3.setCenterX(9);
        c3.setCenterY(6);
        c3.setCenter(new mypoint(5,7));
        c3.setRadius(3);
        // Test setters
        System.out.println("x1 is: " + c3.getCenterX());  // Test getters
        System.out.println("y1 is: " + c3.getCenterY());
        System.out.println("x2 is: " + c3.getCenter());
        System.out.println("y2 is: " + c3.getRadius());
        c3.setCenterXY(2,5);
        // Test setXY()
        System.out.println(c3.getCenterXY()[0]);  // Test getXY()
        System.out.println();
        mycircle c5 = new mycircle(0,2,3);  // Test another constructor
        System.out.println(c5); // Testing the overloaded methods distance()
        mycircle c6 = new mycircle (2,3,4);
        System.out.println("area is: " +c6.getArea());
        System.out.println("circumference is: " +c6.getCircumference());
        System.out.println("distance is: " +c6.distance(c3));

        //MY TRIANGLE
        //Crear un triangulo con los datos que quieras y luego calcular los metodos y clasificar el tipo de triangulo dado
        mytriangle t1 = new mytriangle(2,4,5,6,2,3);  // Test constructor
        System.out.println(t1);
        mypoint p7 = new mypoint (4,8);
        mypoint p8 = new mypoint (3,6);
        mypoint p9 = new mypoint (6,6);
        mytriangle t2 = new mytriangle (p7, p8, p9);
        System.out.println(t2);
        mytriangle t3 = new mytriangle (2,3,4,5,4,3);
        mytriangle t4 = new mytriangle(0,0,4,0,0,6);
        System.out.println("perimeter is: " +t3.getPerimeter());
        System.out.println("type is: " +t3.getType());
        System.out.println("type is: " +t4.getType());








    }
}
