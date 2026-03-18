package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase6;

public class dog extends animal {

    public dog (String name) {
        super(name);
    }//Constructores

    @Override
    public void greets () {
        System.out.println("Woof");
    }//saludo del perro

    public void greets (dog another) {
        System.out.println("Woooof");
    }//saludo a otro perro
}
