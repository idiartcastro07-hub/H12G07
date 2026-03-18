package d;

public abstract class shape {
    //definimos color y filled protegidos
    protected String color = "red";
    protected boolean filled = true;

    //Constructores
    public shape () {

    }

    public shape (String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor () {
        return color;
    }//devuelve color

    public void setColor (String color) {
        this.color = color;
    }//setter color

    public boolean isFilled () {
        return filled;
    }//booleano

    public void setFilled (boolean filled) {
        this.filled = filled;
    }//setter filled

    @Override//imprime resultado
    public String toString () {
        return "Shape [color = " +color+ ", filled = " +filled+ "]";
    }

    public abstract double getArea () ;//area generica
    public abstract double getPerimeter () ;//perimetro generico
}
