package b.ejerciciosclases;

public class myline {
    //definimos atributos
    private mypoint begin;
    private mypoint end;

    //Constructores
    public myline (int x1, int x2, int y1, int y2) {
        this.begin= new mypoint (x1,y1);
        this.end = new mypoint (x2,y2);
    }

    public myline (mypoint begin, mypoint end) {
        this.begin = begin;
        this.end = end;
    }

    //Getters y setters
    public mypoint getBegin () {
        return begin;
    }

    public void setBegin(mypoint begin) {
        this.begin = begin;
    }

    public mypoint getEnd () {
        return end;
    }

    public void setEnd (mypoint end) {
        this.end = end;
    }

    public int getBeginX () {
        return begin.getX();
    }

    public void setBeginX (int x) {
        begin.setX(x);
    }

    public int getBeginY () {
        return begin.getY();
    }

    public void setBeginY (int y) {
        begin.setY(y);
    }

    public int getEndX () {
        return end.getX();
    }

    public void setEndX (int x) {
        end.setX(x);
    }

    public int getEndY () {
        return end.getY();

    }

    public void setEndY (int y) {
        end.setY(y);

    }

    public int[] getBeginXY () {
        return begin.getXY();
    }//devuelve array coordenadas iniciales

    public void setBeginXY (int x, int y) {
        begin.setXY(x,y);
    }

    public int[] getEndXY () {
        return end.getXY();
    }//devuelve array coordenadas finales

    public void setEndXY (int x, int y) {
        end.setXY(x, y);
    }

    public double getLength () {
        return end.distance(begin);
    }

    public double getGradient () {
       int xDiff = end.getX() - begin.getX();
       int yDiff = end.getY() - begin.getY();
       return Math.atan2(yDiff, xDiff);//calcular grados
    }

    public String toString () {
        return "MyLine [begin = " +begin+ ", end = " +end+ "]";
    }//imprimir resultados


}
