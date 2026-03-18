package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase6;

public class bigdog extends dog{

    public bigdog (String name) {
        super (name);
    }//Constructor

    @Override
    public void greets () {
        System.out.println("Wooow");
    }//Saludo del bigdo

    @Override
    public void greets (dog another) {
        System.out.println("Woooooow");
    }//saludo a otro perro

    public void greets (bigdog another) {
        System.out.println("Wooooooooow");
    }//saludo a otro bigdog

}
