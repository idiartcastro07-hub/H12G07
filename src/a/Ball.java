package a;

public class Ball {
    // Atributos privados de la clase
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    // Se crea una Ball con los atributos posteriormente indicados en el print
    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    // Getters y setters de x e y
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

    // Getter que calcula el radio y setter que permite modificarlo
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Getters y setters de XDelta e YDelta
    public float getXDelta() {
        return xDelta;
    }
    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }
    public float getYDelta() {
        return yDelta;
    }
    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    // Se crea un metodo que calcula los valores de x e y despues del moviemiento
    public void move() {
        x += xDelta; // A x se le suma XDelta y se sigue llamando x
        y += yDelta; // A y se le suma YDelta y se sigue llamando y
    }

    // Metodos que calculan el rebote de la pelota
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }
    public void reflectVertical() {
        yDelta = -yDelta;
    }

    // Muestra como se imprimira por pantalla
    @Override
    public String toString() {
        return "Ball[(" + x + ", " + y + "),speed=(" + xDelta + ", " + yDelta + ")]";
    }

}