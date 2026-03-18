package c.ejercicio3_3;

public class Point3D extends Point2D {
    // Atributo privado de la clase
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super (x,y); //Accedemos a los valores de Point2D
        this.z = z;
    }

    public Point3D() {
        super();
        this.z = z;
    }

    // Getter y setter del atributo
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }

    // Setter que toma los valores de x, y y z
    public void setXYZ(float x, float y, float z) {
        setX (x);
        setY(y);
        this.z = z;
    }

    // Getter que une los puntos x, y y z mediante un array
    public float[] getXYZ() {
        float[] result = new float[3];
        result [0] = this.getX();
        result [1] = this.getY();
        result [2] = this.getZ();
        return result;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}