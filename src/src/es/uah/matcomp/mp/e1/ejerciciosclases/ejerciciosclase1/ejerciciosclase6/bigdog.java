package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase6;

public class bigdog extends dog{

    public bigdog (String name) {
        super (name);
    }

    @Override
    public void greets () {
        System.out.println("Wooow");
    }

    @Override
    public void greets (dog another) {
        System.out.println("Woooooow");
    }

    public void greets (bigdog another) {
        System.out.println("Wooooooooow");
    }

}
