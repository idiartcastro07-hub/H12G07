package a;

public class Employee {
    // Atributos privados de la clase
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String name, String lastName, int salary) {
        this.id = id;
        this.firstName = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getters que devuelven sus respectivos atributos
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    public int getSalary() {
        return salary;
    }

    // Setter que nos permitira calcular el salario de un empleado especificado
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Calculo del salario anual
    public int getAnnualSalary () {
        return salary * 12;
    }

    // Metodo que incrementa el salario
    public int raiseSalary (int percent) {
        salary += salary * percent / 100; // Al salario se le suma el procentaje
        return salary;
    }
     @Override
    public String toString() {
        return "Employee [id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary + "]";
    }
}