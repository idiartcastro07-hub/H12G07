package c.ejercicio3_2;

public class Person {
    // Atributos privados de la clase
    private String name;
    private String address;

    public Person(String name, String adress) {
        this.name = name;
        this.address = adress;
    }

    // Getter que devuelve el nombre
    public String getName() {
        return name;
    }

    // Getter y setter que devuelve la direccion y permite cambiarlo
    public String getAdress() {
        return address;
    }
    public void setAdress(String adress) {
        this.address = adress;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ",adress=" + address + ']';
    }
}