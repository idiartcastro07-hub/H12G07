package c.ejercicio3_2;

public class Staff extends Person {
    // Atributos privados de la clase
    private String school;
    private double pay;

    // El personal depende de los atributos especificados en la impresion
    public Staff(String name, String address, String school, double pay) {
        super(name, address); // Se acceden a los atributos de Person
        this.school = school;
        this.pay = pay;
    }

    // Getters y setters de los atributos
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public double getPay() {
        return pay;
    }
    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString(){
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}