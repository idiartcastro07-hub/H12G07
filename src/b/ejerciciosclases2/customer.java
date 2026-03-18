package b.ejerciciosclases2;

public class customer {
    //definir atributos
    private int id;
    private String name;
    private char gender;

    //Constructores
    public customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    //Getters y setters
    public int getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public char getGender () {
        return gender;
    }

    public String toString () {
        return name+ "(" +id+ ")";
    }//mostrar resultado
}
