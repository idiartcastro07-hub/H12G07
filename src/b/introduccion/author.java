package b.introduccion;

public class author {
    //definir atributos
    private String name;
    private String email;
    private char gender;

    //Constructores
    public author (String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName () {
        return name;
    }//devuelve el nombre

    public String getEmail () {
        return email;
    }//devuelve el email

    public char getGender () {return gender;}//devuelve el genero, m o f

    public void setEmail (String email) {
        this.email = email;
    }//establece el email

    public String toString () {
        return "Author [ name = " +name+ ", email = " +email+ "]";
    }//muestra resultado
}
