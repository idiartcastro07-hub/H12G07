package b.ejerciciosclases;

public class author {
    //definimos atributos
    private String name;
    private String email;

    //Constructores
    public author (String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName () {
        return name;
    }//devuelve el nombre

    public String getEmail () {
        return email;
    }//devuelve el email

    public void setEmail (String email) {
        this.email = email;
    }//establece el email

    public String toString () {
        return "Author [ name = " +name+ ", email = " +email+ "]";
    }//muestra resultado
}
