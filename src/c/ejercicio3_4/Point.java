package c.ejercicio3_4;

public class Point {
    // Atributos de la clase que solo se puede acceder desde el package
    protected float x = 0.0f;
    protected float y = 0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point () {}

    // Getters y setters de los diferentes atributos
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }

    // Setter que toma los valores de x e y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter que une los puntos x e y
    public float[] getXY() {
        float[] result = new float[2];
        result[0] = this.x;
        result[1] = this.y;
        return result;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}