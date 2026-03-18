package c.ejercicio3_4;

public class MovablePoint extends Point {
    // Atributos privado de la clase con valor especificado
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y); // Accedemos a los valores de Point
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {} //Mueve el punto

    // Getters y setters de los atributos
    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    //Setter que toma los valores necesarios para calcular la valocidad
    public void setSpeed (float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter que calcula la velocidad
    public float[] getSpeed(){
        float[] result = new float[2];
        result[0] = this.xSpeed;
        result[1] = this.ySpeed;
        return result;
    }

    @Override
    public String toString(){
       return super.toString() + ",speed=(" + xSpeed +  "," + ySpeed + ")";
    }

    // Punto despues del movimiento
    public MovablePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;

    }
}