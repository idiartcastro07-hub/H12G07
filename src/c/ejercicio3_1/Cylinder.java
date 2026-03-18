package c.ejercicio3_1;

public class Cylinder extends Circle {
    // Atributo privado de la clase
    private double height;

    // Cilindro que se calcula con los datos de los atributos ya aportados
    public Cylinder(){
        super (); // Coge los atributos de Circle
        height = 1.0;
    }

    // Cilindro que se calcula con los datos de los atributos ya aportados, excepto la altura que se especifica en la impresion
    public Cylinder(double height){
        super ();
        this.height = height;
    }

    // Cilindro que depende del radio y de la altura especificadas en la impresion
    public Cylinder(double radius, double height){
        super (radius); // Coge el atributo radius de la clase Circle
        this.height = height;
    }

    // Cilindro que depende del radio, altura y color especificados en la impresion
    public Cylinder(double radius, double height, String color){
        super (radius, color);
        this.height = height;
    }

    // Getter y setter del atributo height
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    // Getter que devuelve el valor del volumen
    public double getVolume() {
        return getArea() * height;
    } //Hereda el getArea de Circle

    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
                + " height=" + height;
    }
}