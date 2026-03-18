package b.ejerciciosclases;

public class mypoint {
    //definir atributos
    private int x = 0;
    private int y = 0;

    //Constructores
    public mypoint () {

    }

    public mypoint (int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Getters y setters
    public int getX () {
        return x;
    }

    public void setX (int x) {
        this.x = x;
    }
     public int getY () {
        return y;
     }

     public void setY (int y) {
        this.y = y;
     }

     public int[] getXY () {
        return new int[]{x, y};
     }//devuelve coordenadas en array

     public void setXY (int x, int y) {//establece coordenadas
        this.x = x;
        this.y = y;
     }

     public String toString () {
        return "(" +x+ " , " +y+ ")";
     }//imprime resultado

     public double distance (int x, int y) {//calcular distancia
        int dx = this.x-x;
        int dy = this.y-y;
        return Math.sqrt(dx*dx + dy*dy);
     }

     public double distance (mypoint another) {
        return distance (another.getX(), another.getY());
     }

     public double distance () {
        return distance(0,0);
     }

}
