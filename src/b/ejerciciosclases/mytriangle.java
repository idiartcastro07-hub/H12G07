package b.ejerciciosclases;

public class mytriangle {
    //definir atributos
    private mypoint v1;
    private mypoint v2;
    private mypoint v3;

    //Constructores
    public mytriangle (int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new mypoint (x1, y1);
        this.v2 = new mypoint (x2, y2);
        this.v3 = new mypoint (x3, y3);
    }

    public mytriangle (mypoint v1, mypoint v2, mypoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString () {
        return "MyTriangle[v1 = " +v1+ ", v2 = " +v2+ ", v3 = " +v3 +"]";
    }//mostrar resultado

    public double getPerimeter () {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }//perimetro del resultado

    //Clasificar tipos de triangulos
    public String getType () {
        double l1 = v1.distance(v2);
        double l2 = v2.distance(v3);
        double l3 = v3.distance(v1);
        if (l1 == l2 && l2 == l3) {
            return "Equilateral";
        } else if (l1 != l2 && l2 != l3 && l3 != l1){
            return "Escalene";
        } else return "Isosceles";
    }
}
