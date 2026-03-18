package d.ejerciciosclase6;

public class cat extends animal{

    public cat (String name) {
        super(name);
    }//Constructores

    @Override
    public void greets() {
        System.out.println("Meow");
    }//saludo del gato

}
