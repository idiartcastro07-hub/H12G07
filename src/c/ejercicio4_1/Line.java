package c.ejercicio4_1;

public class Line {
    // Atributos privados de la clase
    private Point begin; // Punto inicial
    private Point end; // Punto final

    public Line (Point begin, Point end) { // caller to construct the Points
        this.begin = begin;
    }

    public Line (int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY); // Hereda el principio de un punto Point
        end = new Point(endX, endY); // Hereda el final de un punto con Point

    }

    @Override
    public String toString() {
        return "Line[begin=" + begin + ",end=" + end + "]";
    }

    //Getters y setters
    public Point getBegin() {return begin;}
    public Point getEnd() {return end;}

    public void setBegin(Point begin) {this .begin = begin;}
    public void setEnd(Point end) {this.end = end;}

    public int getBeginX() {return begin.getX();}
    public int getBeginY() {return begin.getY(); }
    public int getEndX() {return end.getX(); }
    public int getEndY() {return end.getY(); }

    public void setBeginX(int x) {begin.setX(x); }
    public void setBeginY(int y) {begin.setY(y); }
    public void setBeginXY(int x, int y) {begin.setXY(x,y); }

    public void setEndX(int x) {end.setX(x); }
    public void setEndY(int y) {end.setY(y); }
    public void setEndXY(int x, int y) {end.setXY(x,y); }

    // Calculo de la longitud
    public int getLength() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Calculo del grado
    public double getGradient() {
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    } // Gradient in radians

// Math.atan2(yDiff, xDiff)
}

/* Es mejor esta opción (por composición) porque tenemos dos puntos como atributos,
* pero en LineSub (por herencia) el punto de inicio es la propia clase, heredada de
* Point, y el punto final es otro atributo */