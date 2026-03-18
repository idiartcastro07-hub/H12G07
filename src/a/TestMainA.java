package a;

public class TestMainA {
  public static void main(String[] args) {
    //CIRCLE
    // Se construye un circulo c1
    Circle c1 = new Circle(1.1);
    System.out.println(c1);
    // Se construye un nuevo circulo c2
    Circle c2 = new Circle();
    System.out.println(c2);
    c1.setRadius(2.2); // Cambio de radio de c1
    System.out.println(c1);
    System.out.println("Radius is: " + c1.getRadius());
    // Impresion del area y del perimetro
    System.out.printf("Area is: %.2f%n", c1.getArea());
    System.out.printf("Circumference is: %.2f%n", c1.getCircumference());

    System.out.println();

    //RECTANGLE
    // Se crea un nuevo rectangulo r1 con valores determinados
    Rectangle r1 = new Rectangle(1.2f, 3.4f);
    System.out.println(r1);
    // Se crea un nuevo rectangulo r2 con los valores especificados en los atributos de su clase
    Rectangle r2 = new Rectangle();
    System.out.println(r2);
    // Cambio de la base y de la altura de r1 a traves de los setters
    r1.setLength(5.6f);
    r1.setWidth(7.8f);
    System.out.println(r1);
    // Getters de la base y la altura
    System.out.println("length is: " + r1.getLength());
    System.out.println("width is: " + r1.getWidth());
    // Impresion del area y el perimetro
    System.out.printf("area is: %.2f%n", r1.getArea());
    System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());

    System.out.println();

    //EMPLOYEE
    // Se crea un nuevo empleado e1
    Employee e1 = new Employee(8, "Peter", "Tan", 2500);
    System.out.println(e1);
    // Cambio del salario
    e1.setSalary(999);
    System.out.println(e1);
    // Getters de los tributos
    System.out.println("id is: " + e1.getId());
    System.out.println("firstname is: " + e1.getFirstName());
    System.out.println("lastname is: " + e1.getLastName());
    System.out.println("salary is: " + e1.getSalary());
    System.out.println("name is: " + e1.getName());
    // Calculo del salario anual y del incremento del salario
    System.out.println("annual salary is: " + e1.getAnnualSalary());
    System.out.println(e1.raiseSalary(10));
    System.out.println(e1);

    System.out.println();

    // INVOICE ITEM
    // Se crea un nuevo item con valores determinados
    InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
    System.out.println(inv1); // toString();
    // Cambiamos algunos atributos a traves de los setters
    inv1.setQty(999);
    inv1.setUnitPrice(0.99);
    System.out.println(inv1);
    System.out.println("id is: " + inv1.getId());
    System.out.println("desc is: " + inv1.getDesc());
    System.out.println("qty is: " + inv1.getQty());
    System.out.println("unitPrice is: " + inv1.getUnitPrice());
    // Impresion del total calculado
    System.out.println("The total is: " + inv1.getTotal());

    System.out.println();

    // ACCOUNT
    // Se crea una cuenta a1 con valores determiandos
    Account a1 = new Account("A101", "Tan Ah Teck", 88);
    System.out.println(a1);
    // Se crea otra cuenta a2 con los valores de id y name especificados y con balance de la clase (en este caso, 0)
    Account a2 = new Account("A102", "Kumar");
    System.out.println(a2);
    // Getters de los atributos
    System.out.println("ID: " + a1.getID());
    System.out.println("Name: " + a1.getName());
    System.out.println("Balance: " + a1.getBalance());
    // Calculo del credito y del debito
    a1.credit(100);
    System.out.println(a1);
    a1.debit(50);
    System.out.println(a1);
    a1.debit(500); // La cantidad supera al balance
    System.out.println(a1);
    // Calculo de la transferencia
    a1.transferTo(a2, 100);
    System.out.println(a1);
    System.out.println(a2);

    System.out.println();

    //TIME
    // Se crea un nuevo tiempo t1
    Time t1 = new Time(1, 2, 3);
    System.out.println(t1);
    // Se cambia el tiempo a traves de los setters
    t1.setHour(4);
    t1.setMinute(5);
    t1.setSecond(6);
    // Getters de los nuevos atributos ya cambiados
    System.out.println(t1); // toString()
    System.out.println("Hour: " + t1.getHour());
    System.out.println("Minute: " + t1.getMinute());
    System.out.println("Second: " + t1.getSecond());
    // Setter del tiempo
    t1.setTime(23, 59, 58);
    System.out.println(t1);
    // Se prueba el siguiente segundo
    System.out.println(t1.nextSecond());
    System.out.println(t1.nextSecond().nextSecond());
    // Se prueba el segundo anterior
    System.out.println(t1.previousSecond());
    System.out.println(t1.previousSecond().previousSecond());

    System.out.println();

    // BALL
    // Se crea una nueva ball
    Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
    System.out.println(ball);
    // Setters y getters de los atributos
    ball.setX(80.0f);
    ball.setY(35.0f);
    ball.setRadius(5);
    ball.setXDelta(4.0f);
    ball.setYDelta(6.0f);
    System.out.println(ball);
    System.out.println("x is: " + ball.getX());
    System.out.println("y is: " + ball.getY());
    System.out.println("radius is: " + ball.getRadius());
    System.out.println("xDelta is: " + ball.getXDelta());
    System.out.println("yDelta is: " + ball.getYDelta());
    // Se establecen unos limites
    float xMin = 0.0f;
    float xMax = 100.0f;
    float yMin = 0.0f;
    float yMax = 50.0f;
    // La pelota hace 15 movimientos
    for (int i = 0; i < 15; i++) {
      ball.move(); // Movimientos de la pelota
      System.out.println(ball); // Impresion del estadoa actual
      // Obtencion de sus nuevas posiciones en X e Y
      float xNew = ball.getX();
      float yNew = ball.getY();
      // Obtencion del radio de la pelota
      int radius = ball.getRadius();
      // Se comprueba si la pelota choca con algun limite vertical u horizontal para que rebote
      if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
        ball.reflectHorizontal();
      }
      if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
        ball.reflectVertical();
      }
    }
  }

}




