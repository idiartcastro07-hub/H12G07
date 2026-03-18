package b.ejerciciosclases;

public class mycircle {
    //definir atributos
    private mypoint center = new mypoint (0, 0);
    private int radius = 1;

    //Constructores
    public mycircle () {

    }

    public mycircle (int x, int y, int radius) {
        this.center = new mypoint (x, y);
        this.radius = radius;
    }

    public mycircle (mypoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    //Getters y setters
    public int getRadius () {
        return radius;
    }

    public void setRadius (int radius) {
        this.radius = radius;
    }

    public mypoint getCenter () {
        return center;
    }

    public void setCenter (mypoint center) {
        this.center = center;
    }

    public int getCenterX () {
        return center.getX();
    } //devuelve coordenada x

    public void setCenterX (int x) {
        this.center.setX(x);
    }//establece coordenada x

    public int getCenterY () {
        return center.getY();
    }//devuelve coordenada y

    public void setCenterY (int y) {
        this.center.setY(y);
    }//establece coordenada y

    public int[] getCenterXY () {
        return new int[]{center.getX(), center.getY()};
    } //devuelve coordenadas con array

    public void setCenterXY (int x, int y) {//establece coordenadas
        this.center.setX(x);
        this.center.setY(y);
    }

    public String toString () {
        return "MyCircle [radius = " +radius+ ", center = "+center.toString()+ "]";
    }//imprime resultado

    public double getArea () {
        return Math.PI * radius * radius;
    }//devuelve area

    public double getCircumference () {
        return 2 * Math.PI * radius;
    }//devuelve perimetro

    public double distance (mycircle another) {
        return center.distance(another.getCenter());
    }//calcula distancia
}
