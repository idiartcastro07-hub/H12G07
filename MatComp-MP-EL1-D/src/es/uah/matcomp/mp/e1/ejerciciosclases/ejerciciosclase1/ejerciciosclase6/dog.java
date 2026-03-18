package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase6;

public class dog extends animal {

    public dog (String name) {
        super(name);
    }

    @Override
    public void greets () {
        System.out.println("Woof");
    }

    public void greets (dog another) {
        System.out.println("Woooof");
    }
}
