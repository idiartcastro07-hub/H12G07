package c.ejercicio3_3;

public class Point2D {
    // Atributos privados de la clase
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

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

    // Setter de x e y al mismo tiempo
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter formado por un array que coge los valores de x e y y los junta en forma de punto
    public float[]  getXY() {
        float[] result = new float[2];
        result[0] = this.x;
        result[1] = this.y;
        return result;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}