package c.ejercicio4_1;

public class LineSub extends Point{
    // A line needs two points: begin and end.
    // The begin point is inherited from its superclass Point.
    // Private variables
    Point end; // Ending point
    // Constructors
    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY); // construct the begin Point
        this.end = new Point(endX, endY); // construct the end Point
    }

    public LineSub (Point begin, Point end) { // caller to construct the Points
        super(begin.getX(), begin.getY()); // need to reconstruct the begin Point
        this.end = end;
    }
    // Public methods
    // Inherits methods getX() and getY() from superclass Point
    public String toString() {
        return "LineSub: (" + getX() + "," + getY() + ") to (" + end.getX() + "," + end.getY() + ")";
    }

    public Point getBegin() {return new Point(getX(), getY());}
    public Point getEnd() {return end; }

    public void setBegin(Point begin) {setXY(begin.getX(), begin.getY()); }
    public void setEnd(Point end) {this.end = end; }

    public int getBeginX() {return getX(); }
    public int getBeginY() {return getY(); }
    public int getEndX() {return end.getX(); }
    public int getEndY() {return end.getY(); }

    public void setBeginX(int x) {setX(x); }
    public void setBeginY(int y) {setY(y); }
    public void setBeginXY(int x, int y) {setX(x);setY(y); }

    public void setEndX(int x) {end.setX(x); }
    public void setEndY(int y) {end.setY(y); }
    public void setEndXY(int x, int y) {end.setXY(x, y); }

    public int getLength() {
        int xDiff = end.getX() -getX();
        int yDiff = end.getY() -getY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }// Length of the line

    public double getGradient() {
        return Math.atan2(end.getY() - getY(), end.getX() - getX());
    } // Gradient in radians
}