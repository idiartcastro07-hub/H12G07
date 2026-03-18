package c.ejercicio3_2;

public class Student extends Person {
    // Atributos privados de la calse
    private String program;
    private int year;
    private double fee;

    // Estudiante que depende de los atribuutos especificaods en la impresion
    public Student (String name, String address, String program, int year, double fee) {
        super (name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    // Getters y setters de los atributos
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() + "program=" + program + ", year=" + year + ", fee=" + fee + ']';
    }
}